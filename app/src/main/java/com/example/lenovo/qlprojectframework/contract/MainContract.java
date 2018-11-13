package com.example.lenovo.qlprojectframework.contract;

import com.example.lenovo.qlprojectframework.bean.LoginBean;

import retrofit2.Call;

public interface MainContract {
    interface LoginModel{
        Call<LoginBean> login(String userName, String passWord);
    }


}
