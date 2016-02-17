package com.cgtrc.bym.openchina.Base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/**
 * Created by BYM on 2016/2/17.
 */
@SuppressLint("InflateParams")
public class BaseApplication extends Application{
    private static String PREF_NAME = "creativelocker.pref";
    private static String LAST_REFRESH_TIME = "last_refresh_time.pref";
    static Context _context;
    static Resources _resource;

}
