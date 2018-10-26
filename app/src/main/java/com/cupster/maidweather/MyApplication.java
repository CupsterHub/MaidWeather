package com.cupster.maidweather;

import android.app.Application;

import com.cupster.database.DBManager;

/**
 * Created by Cupster on 2018/10/21.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        DBManager.setupGreenDao(getApplicationContext());
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


}
