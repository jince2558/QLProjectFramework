package com.example.lenovo.qlprojectframework;

import android.os.Bundle;
import com.example.lenovo.qlprojectframework.base.BaseActivity;
import com.example.lenovo.qlprojectframework.bean.TestBean;
import com.example.lenovo.qlprojectframework.net.GetOkHttpData;
import com.example.lenovo.qlprojectframework.utils.NetToo;

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

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
        NetToo.getInstance().startRequest(this, "http://210.73.87.74:8997/bjnkprovider/router?v=1.0&method=bjnk.system.home", new GetOkHttpData() {
            @Override
            public void getOkHttpData(String data, Object o) {
            }
        }, TestBean.class);
    }


}
