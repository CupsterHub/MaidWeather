package com.cupster.database.util;

import com.cupster.database.DBManager;
import com.cupster.database.dao.Pm25InfoDao;
import com.cupster.database.model.Pm25Info;
import com.cupster.loglib.LogUtil;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by Cupster on 2018/10/25.
 */

public class Pm25InfoUtil {


    /**
     * 增，单条
     * @param info
     * @return
     */
    public static boolean insertInfo(Pm25Info info){
        boolean flag = false;
        long index = DBManager.getDaoSession().getPm25InfoDao().insert(info);
        flag = index == -1;
        LogUtil.d( flag ? "insert failure":"insert success index = "+index);
        return flag;
    }

    /**
     * 增，多条，子线程操作
     * @param infos
     * @return
     */
    public static boolean insertInfo(final List<Pm25Info> infos){
        boolean flag = false;
        try{
            DBManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (Pm25Info info :infos){
                        DBManager.getDaoSession().getPm25InfoDao().insertOrReplace(info);
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
    public static boolean deleteInfo(Pm25Info info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getPm25InfoDao().delete(info);
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
            DBManager.getDaoSession().deleteAll(Pm25Info.class);
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
    public static boolean updateInfo(Pm25Info info){
        boolean flag = false;
        try{
            DBManager.getDaoSession().getPm25InfoDao().update(info);
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
    public static List<Pm25Info> queryAll(){
        return DBManager.getDaoSession().loadAll(Pm25Info.class);
    }

    /**
     * 查，根据ID
     * @param key
     * @return
     */
    public static Pm25Info queryById(long key){
        return DBManager.getDaoSession().load(Pm25Info.class,key);
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
    public static List<Pm25Info> queryBySQL(String sql , String [] conditions){
        return DBManager.getDaoSession().queryRaw(Pm25Info.class,sql,conditions);
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param id
     * @return
     */
    public static List<Pm25Info> queryByQueryBuidler(long id){
        QueryBuilder<Pm25Info> qb = DBManager.getDaoSession().queryBuilder(Pm25Info.class);
        return qb.where(Pm25InfoDao.Properties.Id.eq(id)).list();
    }

    /**
     * 查，根据querybuidler(编译时可检查错误)
     * @param weaid
     * @return
     */
    public static List<Pm25Info> queryByQueryBuidler(String weaid){
        QueryBuilder<Pm25Info> qb = DBManager.getDaoSession().queryBuilder(Pm25Info.class);
        return qb.where(Pm25InfoDao.Properties.Weaid.eq(weaid)).list();
    }
}
