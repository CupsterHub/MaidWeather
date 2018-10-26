package com.cupster.database;

import android.content.Context;
import com.cupster.database.dao.DaoMaster;
import com.cupster.database.dao.DaoSession;
import com.cupster.database.dao.HistoryInfoDao;
import com.cupster.database.model.HistoryInfo;
import com.cupster.loglib.LogUtil;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * 数据库操作，须在Application中先初始化
 *
 * Created by Cupster on 2018/10/22.
 */
public class DBManager {

    /*
     * 单例模式
     */
    //step1
    private DBManager(){}
    //step2
    private static class initHolder{
        private static final DBManager instance = new DBManager();
    }
    //step3
    public static DBManager getInstance(){
        return initHolder.instance;
    }

    //greendao 初始化
    private static final String DATABASE_NAME="weather_db";
    private static DaoSession mDaoSession;

    /**
     * 初始化greendao数据库
     * @param context
     */
    public static void setupGreenDao(Context context){
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(context,DATABASE_NAME);
        Database db = openHelper.getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    /**
     * 获取 DaoSession
     * @return
     */
    public static DaoSession getDaoSession(){
        return mDaoSession;
    }

    /**
     * SQL日志 开关
     * @param flag
     */
    public static void setDebug(boolean flag){
        QueryBuilder.LOG_SQL = flag;
        QueryBuilder.LOG_VALUES = flag;
    }

    /**
     * 释放额外占用内存
     * 操作相对频繁，故不做置null处理
     */
    public static void gcDaoSession(){
        if(mDaoSession != null){
            mDaoSession.clear();
        }
    }

}
