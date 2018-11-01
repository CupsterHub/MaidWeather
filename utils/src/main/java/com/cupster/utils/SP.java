package com.cupster.utils;

import android.content.SharedPreferences;

/**
 * Created by Cupster on 2018/10/29.
 */

public class SP {

    public static SharedPreferences get(String name){
        try {
            return UtilManager.getAppContext().getSharedPreferences(name,0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
