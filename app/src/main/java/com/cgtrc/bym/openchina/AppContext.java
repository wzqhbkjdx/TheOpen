package com.cgtrc.bym.openchina;

import android.annotation.SuppressLint;

import com.cgtrc.bym.openchina.Base.BaseApplication;

/**
 * Created by BYM on 2016/2/17.
 */

/**
 * 全局应用程序类：用于保存和调用全局应用配置及访问网络数据
 */
public class AppContext extends BaseApplication {
    
    public static final int PAGE_SIZE = 20;// 默认分页大小
    private static AppContext instance;
    private int loginUid;
    private boolean login;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        init();
        initLogin();
    }


    public void init(){

    }

    private void initLogin() {
    }

    public static AppContext getInstance() {
        return instance;
    }
}




















