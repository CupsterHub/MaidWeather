package com.cupster.maidweather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.cupster.maidweather.utils.ActivityManager;
import com.cupster.maidweather.utils.EventMsg;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by Cupster on 2018/10/29.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void pausedSave(Bundle state);
    protected abstract void restoreData(Bundle state);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Activity 管理
        ActivityManager.addActivity(this);
        //注册EventBus
        EventBus.getDefault().register(this);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        pausedSave(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        restoreData(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        //移出队列
        ActivityManager.removeActivity(this);
        //解注册EventBus
        if (EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().unregister(this);
        }
        super.onDestroy();
    }




}
