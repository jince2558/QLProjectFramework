package com.example.lenovo.qlprojectframework.net;

import android.app.Activity;

/**
 * @author LMK
 * @create 2018/11/19
 * @Describe
 */
public interface NetInterface {
    void startRequest(Activity activity, String url,GetOkHttpData getOkHttpData,Object o);
}
