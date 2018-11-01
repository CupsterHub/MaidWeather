package com.cupster.maidweather.utils;

/**
 * 网络状态监听回调
 * Created by Cupster on 2018/10/30.
 */
public interface NetStatus {
    String netBack(String weaid ,int status ,int queryType );
}
