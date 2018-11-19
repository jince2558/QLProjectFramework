package com.example.lenovo.qlprojectframework.net;

import android.app.Activity;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.support.constraint.Constraints.TAG;

/**
 * @author LMK
 * @create 2018/11/19
 * @Describe
 */
public class OkhttpUtils implements NetInterface {
    private static Gson gson;
    private static GsonBuilder gsonBuilder;
    private static String json = "";

    @Override
    public void startRequest(final Activity activity, String url, final GetOkHttpData getOkHttpData,final Object obj) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(5 * 60 * 1000, TimeUnit.MILLISECONDS)
                .writeTimeout(5 * 60 * 1000, TimeUnit.MILLISECONDS)
                .build();
        final Request request = new Request.Builder()
                .url(url)
                .build();
        Log.e(TAG,"看看 初始请求地址 = "+url);
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Looper.prepare();
                Toast.makeText(activity, "服务器或网络异常,请联系管理员", Toast.LENGTH_LONG).show();
                Looper.loop();
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                gsonBuilder = new GsonBuilder();
                gson = gsonBuilder.create();
                json = response.body().string();
                Object o = gson.fromJson(json, (Class<Object>) obj);

                Log.e(TAG,"看看 初始请求地址 = ");
                getOkHttpData.getOkHttpData(json,o);
            }
        });

    }
}
