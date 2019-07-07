package com.example.chatsample.main;

import android.app.Application;

import com.example.chatsample.utils.PreferenceUtils;
import com.sendbird.android.SendBird;

public class BaseApplication extends Application {

    private static final String APP_ID = ""; // Enter your APP ID here after creating a new app in the SendBird dashboard
    public static final String VERSION = "3.0.40";

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(getApplicationContext());

        SendBird.init(APP_ID, getApplicationContext());
    }
}
