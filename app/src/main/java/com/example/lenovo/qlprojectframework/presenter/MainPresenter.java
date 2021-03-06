package com.example.lenovo.qlprojectframework.presenter;


import com.example.lenovo.qlprojectframework.base.BasePresenter;
import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.bean.MainBean;
import com.example.lenovo.qlprojectframework.contract.LoginContract;
import com.example.lenovo.qlprojectframework.contract.MainContract;
import com.example.lenovo.qlprojectframework.model.LoginModel;
import com.example.lenovo.qlprojectframework.model.MainModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    MainModel model;

    public MainPresenter() {
        model = new MainModel();
    }

    @Override
    public void mainRequest() {
        mView.showLoading();
        model.mainRequest()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MainBean>() {
                    @Override
                    public void accept(MainBean o) throws Exception {
                        mView.onSuccess(o);
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
