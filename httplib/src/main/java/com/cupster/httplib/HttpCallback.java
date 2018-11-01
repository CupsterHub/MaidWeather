package com.cupster.httplib;

/**
 * Created by Cupster on 2018/10/30.
 */

public interface HttpCallback {

    void onFailure();

    void onResponse(String body);
}
