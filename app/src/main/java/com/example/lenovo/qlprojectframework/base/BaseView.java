package com.example.lenovo.qlprojectframework.base;

/**
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public  interface BaseView {
    /**
     *显示加载
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 数据获取错误
     * @param throwable
     */
    void onError(Throwable throwable);


}
