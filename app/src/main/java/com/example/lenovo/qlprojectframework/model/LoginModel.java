package com.example.lenovo.qlprojectframework.model;

import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.contract.MainContract;
import com.example.lenovo.qlprojectframework.net.RetrofitClient;

import retrofit2.Call;

/**
 * 登录Mode
 */
public class LoginModel implements MainContract.LoginModel {
    @Override
    public Call<LoginBean> login(String userName, String passWord) {
        return RetrofitClient.getIntent().getService().login(userName,passWord);
    }
}
