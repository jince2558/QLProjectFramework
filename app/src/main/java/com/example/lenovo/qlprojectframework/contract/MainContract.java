package com.example.lenovo.qlprojectframework.contract;

import com.example.lenovo.qlprojectframework.base.BaseView;
import com.example.lenovo.qlprojectframework.bean.LoginBean;

import io.reactivex.Observable;

public interface MainContract {
    interface LoginModel {
        Observable<LoginBean> login(String userName, String passWord);
    }

    interface View extends BaseView {
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError(Throwable throwable);

        void onSuccess(Object o);
    }

    interface Presenter {
        void login(String userName, String passWord);
    }

}
