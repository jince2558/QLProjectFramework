package com.example.lenovo.qlprojectframework.net;

import com.example.lenovo.qlprojectframework.bean.LoginBean;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 网络请求
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public interface NetWorkService {

    @GET("login")
    Call<LoginBean> login(@Query("username") String username,
                          @Query("password") String password);



}
