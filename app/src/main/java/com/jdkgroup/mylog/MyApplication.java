package com.jdkgroup.mylog;

import android.app.Application;

import com.jdkgroup.customview.AppLog;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppLog.init(this);
        AppLog.showLogs(BuildConfig.DEBUG);
    }
}
