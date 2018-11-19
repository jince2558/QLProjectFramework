package com.example.lenovo.qlprojectframework.model;

import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.contract.MainContract;
import com.example.lenovo.qlprojectframework.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * 登录Mode
 */
public class LoginModel implements MainContract.LoginModel {
    @Override
    public Observable<LoginBean> login(String userName, String passWord) {
        return RetrofitClient.getIntent().getService().login(userName,passWord);
    }
}
