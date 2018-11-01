package com.cupster.httplib;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Cupster on 2018/10/26.
 */

public class HttpManager {


    /**
     * 获取数据
     * @param url
     * @param callback
     */
    public static void httpAsk(String url , final HttpCallback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                callback.onFailure();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                callback.onResponse(response.body().string());
            }
        });
    }



}
