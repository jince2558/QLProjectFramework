package com.example.lenovo.qlprojectframework.net;

import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.bean.MainBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 网络请求
 *
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public interface NetWorkService {
    /**
     * 登录页面
     *
     * @param username
     * @param password
     * @return
     */
    @GET("router?v=1.0&method=bjnk.system.login")
    Observable<LoginBean> login(@Query("userName") String username,
                                @Query("password") String password);
//http://210.73.87.74:8997/bjnkprovider/router?v=1.0&method=bjnk.system.home

    /**
     * 主页请求
     *
     * @return
     */
    @GET("router?v=1.0&method=bjnk.system.home")
    Observable<MainBean> mainRequest();

}
