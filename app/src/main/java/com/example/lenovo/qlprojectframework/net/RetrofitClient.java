package com.example.lenovo.qlprojectframework.net;

import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public class RetrofitClient {
    private NetWorkService ser;
    private static RetrofitClient retrofitClient;
    private String baseURL = "http://210.73.87.74:8997/bjnkprovider/";


    public static RetrofitClient getIntent() {
        if (retrofitClient == null) {
            synchronized (RetrofitClient.class) {
                if (retrofitClient == null) {
                    retrofitClient = new RetrofitClient();
                }
            }
        }
        return retrofitClient;
    }

    public NetWorkService getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                //支持gson解析器
                .addConverterFactory(GsonConverterFactory.create())
                //支持rxjava
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        ser = retrofit.create(NetWorkService.class);
        return ser;
    }

    /**
     * 设置拦截器
     *
     * @return
     */
    private Interceptor getInterceptor() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        //显示日志
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return interceptor;
    }

}
