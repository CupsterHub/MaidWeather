package com.cupster.maidweather.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

import com.cupster.maidweather.BaseActivity;
import com.cupster.maidweather.R;
import com.cupster.maidweather.utils.EventMsg;
import com.cupster.maidweather.utils.GetNetData;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 天气主界面
 * Created by Cupster on 2018/10/29.
 */

public class WeatherActivity extends BaseActivity {


    @BindView(R.id.btn_test)
    Button btnTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    protected void pausedSave(Bundle state) {

    }

    @Override
    protected void restoreData(Bundle state) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void Event(EventMsg eventMsg) {

    }


    @OnClick(R.id.btn_test)
    public void onViewClicked() {
        GetNetData.freshCity();


    }
}
