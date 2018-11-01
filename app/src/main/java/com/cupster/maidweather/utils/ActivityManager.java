package com.cupster.maidweather.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity管理器，减少内存占用
 * Created by Cupster on 2018/10/30.
 */

public class ActivityManager {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    /**
     * 移出队列
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 关闭其他activity
     * @param activity
     */
    public static void finishOthers(Activity activity){
        removeActivity(activity);
        finishAll();
        addActivity(activity);
//        for (Activity other :activities){
//            if (other != activity){
//                other.finish();
//            }
//        }
    }

    /**
     * 退出所有Activity
     */
    public static void finishAll(){
        for (Activity activity : activities){
            activity.finish();
        }
    }

    /**
     * 完全退出APP
     */
    public static void ExitEntirely(){
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    /**
     * startActivity
     * @param context
     * @param cls
     */
    public static void startActivity(Context context,Class cls ){
        Intent intent = new Intent(context,cls);
        context.startActivity(intent);
    }

    /**
     * startActivity
     *
     * @param context
     * @param cls
     * @param flag
     */
    public static void startActivity(Context context,Class cls,int flag ){
        Intent intent = new Intent(context,cls);
        intent.addFlags(flag);
        context.startActivity(intent);
    }




}
