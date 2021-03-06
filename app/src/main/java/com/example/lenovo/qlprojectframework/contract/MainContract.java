package com.example.lenovo.qlprojectframework.contract;

import com.example.lenovo.qlprojectframework.base.BaseView;
import com.example.lenovo.qlprojectframework.bean.MainBean;

import io.reactivex.Observable;

/**
 * @author LMK
 * @create 2018/11/22
 * @Describe
 */
public interface MainContract {
    interface MainModel {
        Observable<MainBean> mainRequest();
    }
    interface View extends BaseView {
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError(Throwable throwable);

        void onSuccess(MainBean O);
    }

    interface Presenter {
        void mainRequest();
    }

}
