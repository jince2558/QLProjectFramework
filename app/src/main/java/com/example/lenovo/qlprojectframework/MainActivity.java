package com.example.lenovo.qlprojectframework;

import android.os.Bundle;
import android.util.Log;

import com.example.lenovo.qlprojectframework.base.BaseActivity;
import com.example.lenovo.qlprojectframework.bean.MainBean;
import com.example.lenovo.qlprojectframework.bean.TestBean;
import com.example.lenovo.qlprojectframework.contract.MainContract;
import com.example.lenovo.qlprojectframework.net.GetOkHttpData;
import com.example.lenovo.qlprojectframework.presenter.MainPresenter;
import com.example.lenovo.qlprojectframework.utils.NetToo;

public class MainActivity extends BaseActivity implements MainContract.View {
    private static final String TAG = MainActivity.class.getSimpleName();
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        presenter = new MainPresenter();
        presenter.attach(this);
        presenter.mainRequest();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
    @Override
    public void onError(Throwable throwable) {

    }
    @Override
    public void onSuccess(MainBean O) {
        Log.e("结果 ", " === " + O.getData().getDate());
    }

}
