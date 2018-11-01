package com.cupster.maidweather;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cupster.loglib.LogUtil;
import com.cupster.maidweather.activity.WeatherActivity;
import com.cupster.maidweather.utils.EventMsg;
import com.cupster.utils.SP;
import com.cupster.utils.Tshow;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private MyHandler handler;

    @BindView(R.id.ad_page_img)
    ImageView adPageImg;
    @BindView(R.id.ad_page_word)
    TextView adPageWord;
    @BindView(R.id.ad_page_skip)
    ImageView adPageSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        handler = new MyHandler(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        boolean ad_page = true;
        try{
            ad_page = SP.get("setting").getBoolean("first_ad_page",false);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(ad_page){
            LogUtil.d("ad_page show");
            handler.postDelayed(closeAD,3000);
        }else {
            closeADpage();
            LogUtil.d("ad_page gone");
        }

    }

    @Override
    protected void pausedSave(Bundle state) {

    }

    @Override
    protected void restoreData(Bundle state) {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void Event(EventMsg eventMsg){

    }

    @OnClick({R.id.ad_page_img, R.id.ad_page_word, R.id.ad_page_skip})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ad_page_img:

                break;
            case R.id.ad_page_word:
                Tshow.text("skip ad page");
                break;
            case R.id.ad_page_skip:
                closeADpage();
                break;
        }
    }

    private static class MyHandler extends Handler {
            private WeakReference<MainActivity> activityWeakReference;

            public MyHandler(MainActivity activity) {
                activityWeakReference = new WeakReference<MainActivity>(activity);
            }

            @Override
            public void handleMessage(Message msg) {
                MainActivity activity = activityWeakReference.get();
                if (activity != null) {

                }
            }
    }

    Runnable closeAD = new Runnable() {
        @Override
        public void run() {
            closeADpage();
        }
    };

    private void closeADpage(){
        Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
        startActivity(intent);
        handler.removeCallbacks(closeAD);
        finish();
        System.gc();
    }

}
