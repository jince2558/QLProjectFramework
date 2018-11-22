package com.example.lenovo.qlprojectframework.presenter;


import com.example.lenovo.qlprojectframework.base.BasePresenter;
import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.contract.LoginContract;
import com.example.lenovo.qlprojectframework.model.LoginModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    private LoginModel model;

    public LoginPresenter() {
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
