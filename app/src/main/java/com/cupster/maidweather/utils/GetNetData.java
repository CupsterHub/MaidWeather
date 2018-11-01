package com.cupster.maidweather.utils;

import com.cupster.database.model.HistoryInfo;
import com.cupster.database.model.LifeIndexInfo;
import com.cupster.database.model.Pm25Info;
import com.cupster.database.model.TodayInfo;
import com.cupster.database.model.WeekInfo;
import com.cupster.database.util.HistoryInfoUtil;
import com.cupster.database.util.LifeIndexInfoUtil;
import com.cupster.database.util.Pm25InfoUtil;
import com.cupster.database.util.TodayInfoUtil;
import com.cupster.database.util.WeekInfoUtil;
import com.cupster.httplib.HttpCallback;
import com.cupster.httplib.HttpManager;
import com.cupster.loglib.LogUtil;
import com.cupster.utils.DateUtil;
import com.cupster.utils.SP;
import com.cupster.utils.Tshow;

import java.util.List;

/**
 * 请求服务器数据
 * Created by Cupster on 2018/10/30.
 */

public class GetNetData {

    private static final String URL_HEAD = "http://api.k780.com/?app=weather.";
    private static final String URL_END = "&appkey=24364&sign=570278bbeddd915e960e5a9c57a99364&format=json";

    /*
        获取信息类型 编号
     */
    public static final int TODAY = 1;
    public static final int PM25 = 2;
    public static final int FUTURE = 3;
    public static final int LIFE = 4;
    public static final int HISTORY = 5;

    /*
        列表、当前城市分开处理
     */
    private static int questType_cities = TODAY;
    private static int questType = TODAY;

    /**
     * 获取目标城市weaid
     */
    public static String weaid_curr = "101010100";//默认北京
    /**
     * json中间处理
     */
    private static String json_temp;
    /**
     * 回调接口
     */
    private static NetStatus netStatus;

    private static boolean isCompeleted = false;
    /**
     * 更改目标城市 -weaid
     * @param weaid
     */
    public static void setWeaidCurr(String weaid) {
        weaid_curr = weaid;
        SP.get("setting").edit().putString("weaid_curr",weaid).apply();
    }

    /*
    ====================================分割线========================================
     */

    /**
     * 刷新数据
     */
    public static void freshCity() {
//        List<TodayInfo> to = DataSupport.where("cityid=?", weaid_curr).find(TodayInfo.class);
        List<TodayInfo> todayInfos = TodayInfoUtil.queryByQueryBuidler(weaid_curr);
        if (todayInfos != null && todayInfos.size() != 0) {
            String days = todayInfos.get(0).getDays();
            if (DateUtil.getCurrTime("yyyy-MM-dd").equals(days)) {
                //是今天的
                String uptime = todayInfos.get(0).getFreshTime().split("-")[0];
                int nowtime = Integer.parseInt(DateUtil.getCurrTime("HH"));
                if (nowtime - Integer.parseInt(uptime) < 1) {//1小时内不刷新。
                    LogUtil.w("本地数据已最新");
                    //TODO 1 接口回调、传递信息
//                    netStatus.netBack(weaid_curr, 10, 5);
                    return;
                }
            }
        }
        //开始循环获取5钟返回数据
        for (int i = 1; i <= 5; i++) {
            isCompeleted = false;
            String url = setURL(i, weaid_curr, DateUtil.getYesterday());
            questType = i;//change value , where only modified.
            HttpManager.httpAsk(url, new HttpCallback() {
                @Override
                public void onFailure() {
                    isCompeleted =true;
                    LogUtil.w("get weaid="+weaid_curr+" type = "+questType+" failure");
                    //TODO 2 接口回调、传递信息
                }

                @Override
                public void onResponse(String body) {
                    LogUtil.d(body);
                    saveData(questType, body);
                    isCompeleted=true;
                    LogUtil.i("get weaid="+weaid_curr+" type = "+questType+" success");
                    //TODO 3 接口回调、传递信息

                }
            });
            //等待响应
            while (!isCompeleted) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
//        netStatus.netBack("", 13, 0);
    }


    /**
     * URL 路径组装
     */
    public static String setURL(int type, String weaID, String date) {
        String URL = "";
        switch (type) {
            case TODAY:
                URL = URL_HEAD + "today" + "&weaid=" + weaID + URL_END;
                break;
            case PM25:
                URL = URL_HEAD + "pm25" + "&weaid=" + weaID + URL_END;
                break;
            case FUTURE:
                URL = URL_HEAD + "future" + "&weaid=" + weaID + URL_END;
                break;
            case LIFE:
                URL = URL_HEAD + "lifeindex" + "&weaid=" + weaID + URL_END;
                break;
            case HISTORY:
                URL = URL_HEAD + "history" + "&weaid=" + weaID + "&date=" + date + URL_END;
                break;
            default:
                break;
        }
        return URL;
    }

    /**
     * 存入数据库
     *
     * @param type which kind
     * @param json json
     */
    private static void saveData(int type, String json) {
        //5个API ，逐一解析，存入数据库
        switch (type) {//判断一下当前的url请求的是哪种
            case TODAY:
                TodayInfo todayInfo = InfoReader.readToday(json);
                if (todayInfo == null) {
                    useUpAPIorNoDataNow();
                    break;
                }
                List<TodayInfo> todayInfos = TodayInfoUtil.queryByQueryBuidler(todayInfo.getWeaid());
                if (todayInfos !=null && todayInfos.size()!=0){
                    for(TodayInfo to : todayInfos){
                        TodayInfoUtil.deleteTodayInfo(to.getId());
                    }
                }
                TodayInfoUtil.insertTodayInfo(todayInfo);
                break;
            case PM25:
                Pm25Info pm25 = InfoReader.readPm25(json);
                if (pm25 == null) {
                    useUpAPIorNoDataNow();
                    break;
                }
                List<Pm25Info> pm25Infos = Pm25InfoUtil.queryByQueryBuidler(pm25.getWeaid());
                if (pm25Infos !=null && pm25Infos.size()!=0){
                    for(Pm25Info info : pm25Infos){
                        Pm25InfoUtil.deleteInfo(info);
                    }
                }
                Pm25InfoUtil.insertInfo(pm25);
                break;
            case FUTURE:
                List<WeekInfo> list = InfoReader.readFuture(json);
                if (list == null || list.size()==0 ) {
                    useUpAPIorNoDataNow();
                    break;
                }
                List<WeekInfo> weekInfos = WeekInfoUtil.queryByQueryBuidler(list.get(0).getWeaid());
                if (weekInfos != null && weekInfos.size() !=0 ){
                    for (WeekInfo info :weekInfos){
                        WeekInfoUtil.deleteInfo(info);
                    }
                }
                LogUtil.d("weekinfo size:"+list.size());
                WeekInfoUtil.insertInfo(list);
                break;
            case LIFE:
                LifeIndexInfo lifeIndex = InfoReader.readLifeIndex(json);
                if (lifeIndex == null) {
                    useUpAPIorNoDataNow();
                    break;
                }
                List<LifeIndexInfo> lifeIndexInfos = LifeIndexInfoUtil.queryByQueryBuidler(lifeIndex.getWeaid());
                if (lifeIndexInfos!=null && lifeIndexInfos.size()!=0){
                    for (LifeIndexInfo info:lifeIndexInfos){
                        LifeIndexInfoUtil.deleteInfo(info);
                    }
                }
                LifeIndexInfoUtil.insertInfo(lifeIndex);
                break;
            case HISTORY:
                List<HistoryInfo> histories = InfoReader.readHistory(json);
                if (histories == null || histories.size()==0 ) {
                    useUpAPIorNoDataNow();
                    break;
                }
                List<HistoryInfo> historyInfos = HistoryInfoUtil.queryByQueryBuidler(histories.get(0).getWeaid());
                if (historyInfos !=null && historyInfos.size()!=0){
                    for (HistoryInfo info:historyInfos){
                        HistoryInfoUtil.deleteInfo(info);
                    }
                }
                HistoryInfoUtil.insertInfo(histories);
                break;
            default:
                break;
        }
    }

    /**
     * API 请求次数超限 or 暂无该城市 信息
     * (ex：新疆天池101130109 没有未来一周天气预报,
     * return :{"success":"0","msgid":"1000060","msg":"暂无数据"})
     */
    private static void useUpAPIorNoDataNow() {
        //TODO  Application级 对话框提示。
        Tshow.debug("服务器API请求超额");
//        Tshow.text("服务器API请求超额");
    }


}
