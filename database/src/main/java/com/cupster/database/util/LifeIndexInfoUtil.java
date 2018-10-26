package com.cupster.database.util;

import com.cupster.database.DBManager;
import com.cupster.database.dao.LifeIndexInfoDao;
import com.cupster.database.model.LifeIndexInfo;
import com.cupster.loglib.LogUtil;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by Cupster on 2018/10/25.
 */

public class LifeIndexInfoUtil {


    /**
     * 增，单条
     * @param info
     * @return
     */
    public static boolean insertInfo(LifeIndexInfo info){
        boolean flag = false;
        long index = DBManager.getDaoSession().getLifeIndexInfoDao().insert(info);
        flag = index == -1;
        LogUtil.d( flag ? "insert failure":"insert success index = "+index);
        return flag;
    }

    /**
     * 增，多条，子线程操作
     * @param infos
     * @return
     */
    public static boolean insertInfo(final List<LifeIndexInfo> infos){
        boolean flag = false;
        try{
            DBManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (LifeIndexInfo info :infos){
                        DBManager.getDaoSession().getLifeIndexInfoDao().insertOrReplace(info);
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
    public static boolean deleteInfo(LifeIndexInfo info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getLifeIndexInfoDao().delete(info);
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
            DBManager.getDaoSession().deleteAll(LifeIndexInfo.class);
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
    public static boolean updateInfo(LifeIndexInfo info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getLifeIndexInfoDao().update(info);
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
    public static List<LifeIndexInfo> queryAll(){
        return DBManager.getDaoSession().loadAll(LifeIndexInfo.class);
    }

    /**
     * 查，根据ID
     * @param key
     * @return
     */
    public static LifeIndexInfo queryById(long key){
        return DBManager.getDaoSession().load(LifeIndexInfo.class,key);
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
    public static List<LifeIndexInfo> queryBySQL(String sql , String [] conditions){
        return DBManager.getDaoSession().queryRaw(LifeIndexInfo.class,sql,conditions);
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param id
     * @return
     */
    public static List<LifeIndexInfo> queryByQueryBuidler(long id){
        QueryBuilder<LifeIndexInfo> qb = DBManager.getDaoSession().queryBuilder(LifeIndexInfo.class);
        return qb.where(LifeIndexInfoDao.Properties.Id.eq(id)).list();
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param weaid
     * @return
     */
    public static List<LifeIndexInfo> queryByQueryBuidler(String weaid){
        QueryBuilder<LifeIndexInfo> qb = DBManager.getDaoSession().queryBuilder(LifeIndexInfo.class);
        return qb.where(LifeIndexInfoDao.Properties.Weaid.eq(weaid)).list();
    }

}
