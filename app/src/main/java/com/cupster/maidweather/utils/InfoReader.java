package com.cupster.maidweather.utils;



import com.cupster.database.model.HistoryInfo;
import com.cupster.database.model.LifeIndexInfo;
import com.cupster.database.model.Pm25Info;
import com.cupster.database.model.TodayInfo;
import com.cupster.database.model.WeekInfo;
import com.cupster.utils.DateUtil;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * read json to model
 * Created by Cupster on 2018/2/26.
 */

public class InfoReader {

    /**
     * 解析当天JSON
     *
     * @param Json json
     * @return TodayInfo
     */
    public static TodayInfo readToday(String Json) {
        TodayInfo todayInfo = new TodayInfo();
        try {
            JSONObject jObject = new JSONObject(Json);
            String success = jObject.getString("success");
            if (!success.equals("1")) {
                return null;
            }
            JSONObject info = jObject.getJSONObject("result");
            //数据today提取:
            //方式1：
//            todayInfo.setFreshTime(DateTool.getCurrTime("HH-mm"));
//            todayInfo.setWeaid(info.getString("weaid"));
//            todayInfo.setDays(info.getString("days"));
//            todayInfo.setWeek(info.getString("week"));
//            todayInfo.setCityno(info.getString("cityno"));
//            todayInfo.setCitynm(info.getString("citynm"));
//            todayInfo.setCityid(info.getString("cityid"));
//            todayInfo.setTemperature(info.getString("temperature"));
//            todayInfo.setTemperature_curr(info.getString("temperature_curr"));
//            todayInfo.setHumidity(info.getString("humidity"));
//            todayInfo.setWeather(info.getString("weather"));
//            todayInfo.setWeather_curr(info.getString("weather_curr"));
//            todayInfo.setWeather_icon(info.getString("weather_icon"));
//            todayInfo.setWeather_icon1(info.getString("weather_icon1"));
//            todayInfo.setWind(info.getString("wind"));
//            todayInfo.setWinp(info.getString("winp"));
//            todayInfo.setTemp_high(info.getString("temp_high"));
//            todayInfo.setTemp_low(info.getString("temp_low"));
//            todayInfo.setTemp_curr(info.getString("temp_curr"));
//            todayInfo.setHumi_high(info.getString("humi_high"));
//            todayInfo.setHumi_low(info.getString("humi_low"));
//            todayInfo.setWeatid(info.getString("weatid"));
//            todayInfo.setWeatid1(info.getString("weatid1"));
//            todayInfo.setWindid(info.getString("windid"));
//            todayInfo.setWinpid(info.getString("winpid"));
            //方式2：
            todayInfo = new Gson().fromJson(info.toString(), TodayInfo.class);
            todayInfo.setFreshTime(DateUtil.getCurrTime("HH-mm"));//后期使用到分钟mm
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return todayInfo;
    }

    /**
     * 解析未来5-7天
     *
     * @param json json
     * @return list
     */
    public static List<WeekInfo> readFuture(String json) {
        List<WeekInfo> weekInfos = new ArrayList<>();
        try {
            JSONObject jObject = new JSONObject(json);
            String success = jObject.getString("success");
            if (!success.equals("1")) {
                return null;
            }
            JSONArray array = jObject.getJSONArray("result");
            for (int i = 0; i < array.length(); i++) {
                String content = array.getJSONObject(i).toString();
                WeekInfo weekInfo = new Gson().fromJson(content, WeekInfo.class);
                weekInfos.add(weekInfo);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return weekInfos;
    }

    /**
     * 解析Pm25
     *
     * @param json json
     * @return pm25
     */
    public static Pm25Info readPm25(String json) {
        Pm25Info pm25 = new Pm25Info();
        try {
            JSONObject jObject = new JSONObject(json);
            String success = jObject.getString("success");
            if (!success.equals("1")) {
                return null;
            }
            JSONObject info = jObject.getJSONObject("result");
            pm25 = new Gson().fromJson(info.toString(), Pm25Info.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return pm25;
    }

    /**
     * 解析生活指数
     *
     * @param json json
     * @return lifeIndex
     */
    public static LifeIndexInfo readLifeIndex(String json) {
        LifeIndexInfo lifeIndex = new LifeIndexInfo();
        try {
            JSONObject jObject = new JSONObject(json);
            String success = jObject.getString("success");
            if (!success.equals("1")) {
                return null;
            }
            JSONArray array = jObject.getJSONArray("result");
            //这里只要当天的指数数据就好了: index = 0
            String content = array.getJSONObject(0).toString();
            lifeIndex = new Gson().fromJson(content, LifeIndexInfo.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lifeIndex;
    }

    /**
     * 解析历史数据
     *
     * @param json json
     * @return list<history>
     */
    public static List<HistoryInfo> readHistory(String json) {
        List<HistoryInfo> history_list = new ArrayList<>();
        try {
            JSONObject jObject = new JSONObject(json);
            String success = jObject.getString("success");
            if (!success.equals("1")) {
                return null;
            }
            JSONArray array = jObject.getJSONArray("result");
            for (int i = 0; i < array.length(); i++) {
                String content = array.getJSONObject(i).toString();
                HistoryInfo history = new Gson().fromJson(content, HistoryInfo.class);
                JSONObject item = new JSONObject(content);
                history.setTempnum(Integer.parseInt(item.getString("temp")));
                history_list.add(history);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return history_list;
    }



}
