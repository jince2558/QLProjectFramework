package com.example.lenovo.qlprojectframework.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.lenovo.qlprojectframework.MainActivity;
import com.example.lenovo.qlprojectframework.R;
import com.example.lenovo.qlprojectframework.base.BaseActivity;
import com.example.lenovo.qlprojectframework.bean.LoginBean;
import com.example.lenovo.qlprojectframework.contract.LoginContract;
import com.example.lenovo.qlprojectframework.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements View.OnClickListener, LoginContract.View {
    private static final String TAG = LoginActivity.class.getSimpleName();
    @BindView(R.id.load_user)
    EditText mUserNameEdit;
    @BindView(R.id.load_password)
    EditText mPassWordEdit;
    @BindView(R.id.load_rembercheckbox)
    CheckBox mCheckBox;
    Button mLoginBtn;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        mLoginBtn = ((Button) findViewById(R.id.loadac_bt_load));
        mLoginBtn.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        presenter = new LoginPresenter();
        presenter.attach(this);
    }

    @Override
    public void onClick(View v) {
        presenter.login(mUserNameEdit.getText().toString(), mPassWordEdit.getText().toString());
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(Throwable throwable) {
        Log.e(TAG, "onError = " + throwable);
    }

    @Override
    public void onSuccess(Object o) {
        LoginBean result = (LoginBean) o;
        Log.e(TAG,"查看结果 = "+ result.getMsg());

        startActivity(MainActivity.class);
    }
}
