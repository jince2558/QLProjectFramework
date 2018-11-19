package com.example.lenovo.qlprojectframework.base;

/**
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public class BasePresenter<T extends BaseView> {
    protected T mView;

    /**
     *绑定view
     * @param view
     */
    public void attach(T view){
        this.mView=view;
    }

    /**
     * 解除绑定
     */
    public void  detachView(){
        this.mView = null;

    }
    /**
     * View是否绑定
     *
     * @return
     */
    public boolean isViewAttached() {
        return mView != null;
    }


}
