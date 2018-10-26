package com.cupster.database.util;

import com.cupster.database.DBManager;
import com.cupster.database.dao.HistoryInfoDao;
import com.cupster.database.model.HistoryInfo;
import com.cupster.loglib.LogUtil;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by Cupster on 2018/10/25.
 */

public class HistoryInfoUtil {


    /**
     * 增，单条
     * @param info
     * @return
     */
    public static boolean insertInfo(HistoryInfo info){
        boolean flag = false;
        long index = DBManager.getDaoSession().getHistoryInfoDao().insert(info);
        flag = index == -1;
        LogUtil.d( flag ? "insert failure":"insert success index = "+index);
        return flag;
    }

    /**
     * 增，多条，子线程操作
     * @param infos
     * @return
     */
    public static boolean insertInfo(final List<HistoryInfo> infos){
        boolean flag = false;
        try{
            DBManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (HistoryInfo info :infos){
                        DBManager.getDaoSession().getHistoryInfoDao().insertOrReplace(info);
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
    public static boolean deleteInfo(HistoryInfo info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getHistoryInfoDao().delete(info);
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
            DBManager.getDaoSession().deleteAll(HistoryInfo.class);
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
    public static boolean updateInfo(HistoryInfo info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getHistoryInfoDao().update(info);
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
    public static List<HistoryInfo> queryAll(){
        return DBManager.getDaoSession().loadAll(HistoryInfo.class);
    }

    /**
     * 查，根据ID
     * @param key
     * @return
     */
    public static HistoryInfo queryById(long key){
        return DBManager.getDaoSession().load(HistoryInfo.class,key);
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
    public static List<HistoryInfo> queryBySQL(String sql , String [] conditions){
        return DBManager.getDaoSession().queryRaw(HistoryInfo.class,sql,conditions);
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param id
     * @return
     */
    public static List<HistoryInfo> queryByQueryBuidler(long id){
        QueryBuilder<HistoryInfo> qb = DBManager.getDaoSession().queryBuilder(HistoryInfo.class);
        return qb.where(HistoryInfoDao.Properties.Id.eq(id)).list();
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param weaid
     * @return
     */
    public static List<HistoryInfo> queryByQueryBuidler(String weaid){
        QueryBuilder<HistoryInfo> qb = DBManager.getDaoSession().queryBuilder(HistoryInfo.class);
        return qb.where(HistoryInfoDao.Properties.Weaid.eq(weaid)).list();
    }
}
