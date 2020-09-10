package com.dust.helper;

import android.app.Application;
import android.os.Build;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        disableAPIDialog();
    }


    //*** 反射 禁止弹窗*/
/*    private void disableAPIDialog(){
        if (Build.VERSION.SDK_INT < 28)return;
        try {
            Class clazz = Class.forName("android.app.ActivityThread");
            Method currentActivityThread = clazz.getDeclaredMethod("currentActivityThread");
            currentActivityThread.setAccessible(true);
            Object activityThread = currentActivityThread.invoke(null);
            Field mHiddenApiWarningShown = clazz.getDeclaredField("mHiddenApiWarningShown");
            mHiddenApiWarningShown.setAccessible(true);
            mHiddenApiWarningShown.setBoolean(activityThread, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}
