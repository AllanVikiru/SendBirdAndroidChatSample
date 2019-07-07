package com.example.chatsample.main;

import android.app.Application;

import com.example.chatsample.utils.PreferenceUtils;
import com.sendbird.android.SendBird;

public class BaseApplication extends Application {

    private static final String APP_ID = "996BCC20-975F-4CE9-83E0-7FC58DF51B01"; // US-1 Demo
    public static final String VERSION = "3.0.40";

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(getApplicationContext());

        SendBird.init(APP_ID, getApplicationContext());
    }
}