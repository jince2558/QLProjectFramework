package com.example.lenovo.qlprojectframework.utils;

import android.app.Activity;

import com.example.lenovo.qlprojectframework.net.GetOkHttpData;
import com.example.lenovo.qlprojectframework.net.NetInterface;
import com.example.lenovo.qlprojectframework.net.OkhttpUtils;

/**
 * @author LMK
 * @create 2018/11/19
 * @Describe
 */
public class NetToo implements NetInterface {
    private static NetToo ourInstance;
    private NetInterface netInterface;

    public static NetToo getInstance(){
        if (ourInstance == null){
            synchronized (NetToo.class){
                if (ourInstance == null){
                    ourInstance = new NetToo();

                }
            }
        }
        return ourInstance;
    }
    public NetToo() {
        netInterface = new OkhttpUtils();
    }
    @Override
    public void startRequest(Activity activity, String url, GetOkHttpData getOkHttpData,Object o) {
        netInterface.startRequest(activity,url,getOkHttpData,o);
    }
}
