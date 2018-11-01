package com.cupster.utils;

import android.content.Context;

/**
 * Created by Cupster on 2018/10/29.
 */

public class UtilManager {

    private static Context app;

    private UtilManager(){}

    private static class Holder{
        public static UtilManager instance = new UtilManager();
    }

    public UtilManager getInstance(){
        return Holder.instance;
    }

    public static void initUitls(Context context){
        app = context;
    }

    public static Context getAppContext () throws Exception {
        if(app == null){
            throw new Exception("init UtilManager first!");
        }
        return app;
    }

}
