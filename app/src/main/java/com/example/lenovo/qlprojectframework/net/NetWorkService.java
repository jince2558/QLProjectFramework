package com.example.lenovo.qlprojectframework.net;

import com.example.lenovo.qlprojectframework.bean.LoginBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 网络请求
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public interface NetWorkService {

    @GET("router?v=1.0&method=bjnk.system.login")
    Observable<LoginBean> login(@Query("userName") String username,
                                @Query("password") String password);



}
