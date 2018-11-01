package com.cupster.utils;

import android.widget.Toast;

/**
 * Created by Cupster on 2018/10/29.
 */

public class Tshow {

    private static final boolean DEBUG_SWITCH = true;

    public static void text(String text){
        try {
            Toast.makeText(UtilManager.getAppContext(),text,Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void debug(String text){
        if (!DEBUG_SWITCH){
            return;
        }
        try {
            Toast.makeText(UtilManager.getAppContext(),text,Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
