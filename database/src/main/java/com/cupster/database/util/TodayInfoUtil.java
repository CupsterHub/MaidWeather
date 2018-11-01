package com.cupster.database.util;

import com.cupster.database.DBManager;
import com.cupster.database.dao.TodayInfoDao;
import com.cupster.database.model.TodayInfo;
import com.cupster.loglib.LogUtil;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 *
 * Created by Cupster on 2018/10/25.
 */

public class TodayInfoUtil {
    //util改进，抽出共同DBManager,取消单例
//    private TodayInfoUtil(){
//
//    }
//
//    private static class Holder{
//        public static TodayInfoUtil instance = new TodayInfoUtil();
//    }
//
//    public static TodayInfoUtil getInstance(){
//        return  Holder.instance;
//    }

    /**
     * 增，单条
     * @param info
     * @return
     */
    public static boolean insertTodayInfo(TodayInfo info){
        boolean flag = false;
        long index = DBManager.getDaoSession().getTodayInfoDao().insert(info);
        flag = index == -1;
        LogUtil.d( flag ? "insert failure":"insert success index = "+index);
        return flag;
    }

    /**
     * 增，多条，子线程操作
     * @param infos
     * @return
     */
    public static boolean insertTodayInfo(final List<TodayInfo> infos){
        boolean flag = false;
        try{
            DBManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (TodayInfo info :infos){
                        DBManager.getDaoSession().getTodayInfoDao().insertOrReplace(info);
                    }
                }
            });
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删
     * @param info
     * @return
     */
    public static boolean deleteTodayInfo(TodayInfo info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getTodayInfoDao().delete(info);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删,by key
     */
    public static boolean deleteTodayInfo(Long key){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getTodayInfoDao().deleteByKey(key);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删，删除所有记录
     * @return
     */
    public static boolean deleteAll(){
        boolean flag = false;
        try{
            DBManager.getDaoSession().deleteAll(TodayInfo.class);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 改，修改一条数据
     * @param info
     * @return
     */
    public static boolean updateTodayInfo(TodayInfo info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getTodayInfoDao().update(info);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 查，所有记录
     * @return
     */
    public static List<TodayInfo> queryAll(){
        return DBManager.getDaoSession().loadAll(TodayInfo.class);
    }

    /**
     * 查，根据ID
     * @param key
     * @return
     */
    public static TodayInfo queryById(long key){
        return DBManager.getDaoSession().load(TodayInfo.class,key);
    }

    /**
     * 查，根据sql语句
     * eg:String sql = "where _id > ?";
     *    String[] condition = new String[]{"1008"};
     *    List<Meizi> meiziList2 = mMeiziDaoUtils.queryMeiziByNativeSql(sql, condition);
     *    for (Meizi meizi2 : meiziList2) {
     *        Log.i(TAG, meizi2.toString());
     *    }
     * @param sql
     * @param conditions
     * @return
     */
    public static List<TodayInfo> queryBySQL(String sql , String [] conditions){
        return DBManager.getDaoSession().queryRaw(TodayInfo.class,sql,conditions);
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param id
     * @return
     */
    public static List<TodayInfo> queryByQueryBuidler(long id){
        QueryBuilder<TodayInfo> qb = DBManager.getDaoSession().queryBuilder(TodayInfo.class);
        return qb.where(TodayInfoDao.Properties.Id.eq(id)).list();
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param weaid
     * @return
     */
    public static List<TodayInfo> queryByQueryBuidler(String weaid){
        QueryBuilder<TodayInfo> qb = DBManager.getDaoSession().queryBuilder(TodayInfo.class);
        return qb.where(TodayInfoDao.Properties.Weaid.eq(weaid)).list();
    }

}
