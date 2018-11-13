package com.example.lenovo.qlprojectframework.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.lenovo.qlprojectframework.R;
import com.example.lenovo.qlprojectframework.base.BaseActivity;

import butterknife.BindView;

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.load_user)
    EditText mUserNameEdit;
    @BindView(R.id.load_password)
    EditText mPassWordEdit;
    @BindView(R.id.load_rembercheckbox)
    CheckBox mCheckBox;
    @BindView(R.id.loadac_bt_load)
    Button mLoginBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        mLoginBtn.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {

    }
}
