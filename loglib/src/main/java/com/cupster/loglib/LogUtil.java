package com.cupster.loglib;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Cupster on 2018/10/24.
 */

public class LogUtil {

    public static String MODULE_NAME ="app";
    public static boolean showVerbose = true;
    public static boolean showDebug = true;
    public static boolean showInfo = true;
    public static boolean showWarn = true;
    public static boolean showError = true;
    public static boolean showAssert = true;
    public static boolean showWTF = true;

    /**
     * 连接完整log tag
     * @return
     */
    private static String linkTag(){
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String callerClazzName = stackTraceElement.getClassName();
        callerClazzName = callerClazzName.substring(callerClazzName.lastIndexOf(".") + 1);
        String tag = "%s.%s(L:%d)";
        tag = String.format(tag, new Object[]{callerClazzName, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
        //给tag设置前缀
        tag = TextUtils.isEmpty(MODULE_NAME) ? tag : MODULE_NAME + ":" + tag;
        return tag;

    }

    public static void v(String  msg){
        if (showVerbose){
            Log.v(linkTag(),msg);
        }
    }

    public static void v(String msg, Throwable tr) {
        if (showVerbose) {
            Log.v(linkTag(), msg, tr);
        }
    }

    public static void d(String msg) {
        if (showDebug) {
            Log.d(linkTag(), msg);
        }
    }

    public static void d(String msg, Throwable tr) {
        if (showDebug) {
            Log.d(linkTag(), msg, tr);
        }
    }

    public static void i(String msg) {
        if (showInfo) {
            Log.i(linkTag(), msg);
        }
    }

    public static void i(String msg, Throwable tr) {
        if (showInfo) {
            Log.i(linkTag(), msg, tr);
        }
    }

    public static void w(String msg) {
        if (showWarn) {
            Log.w(linkTag(), msg);
        }
    }

    public static void w(String msg, Throwable tr) {
        if (showWarn) {
            Log.w(linkTag(), msg, tr);
        }
    }

    public static void e(String msg) {
        if (showError) {
            Log.e(linkTag(), msg);
        }
    }

    public static void e(String msg, Throwable tr) {
        if (showError) {
            Log.e(linkTag(), msg, tr);
        }
    }

    public static void wtf(String msg) {
        if (showWTF) {
            Log.wtf(linkTag(), msg);
        }
    }

    public static void wtf(String msg, Throwable tr) {
        if (showWTF) {
            Log.wtf(linkTag(), msg, tr);
        }
    }


}
