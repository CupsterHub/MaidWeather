package com.cupster.maidweather;

import android.app.Application;

import com.cupster.database.DBManager;
import com.cupster.utils.UtilManager;

/**
 * Created by Cupster on 2018/10/21.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        DBManager.setupGreenDao(getApplicationContext());
        //初始化Utils
        UtilManager.initUitls(this);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


}
