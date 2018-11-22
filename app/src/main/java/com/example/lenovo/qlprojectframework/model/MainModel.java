package com.example.lenovo.qlprojectframework.model;

import com.example.lenovo.qlprojectframework.bean.MainBean;
import com.example.lenovo.qlprojectframework.contract.MainContract;
import com.example.lenovo.qlprojectframework.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * @author LMK
 * @create 2018/11/22
 * @Describe
 */
public class MainModel implements MainContract.MainModel {

    @Override
    public Observable<MainBean> mainRequest() {
        return  RetrofitClient.getIntent().getService().mainRequest();
    }
}
