package com.example.lenovo.qlprojectframework.presenter;


import android.util.Log;

import com.example.lenovo.qlprojectframework.base.BasePresenter;
import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.contract.MainContract;
import com.example.lenovo.qlprojectframework.model.LoginModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    private LoginModel model;

    public MainPresenter() {
        model = new LoginModel();
    }

    @Override
    public void login(String userName, String passWord) {
        mView.showLoading();
        model.login(userName, passWord)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LoginBean>() {
                    @Override
                    public void accept(LoginBean loginBean) throws Exception {
                        mView.onSuccess(loginBean);
                        mView.hideLoading();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        mView.onError(throwable);
                    }
                });
    }


}
