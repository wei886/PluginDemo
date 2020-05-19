package com.l.plugincore;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public abstract class PluginActivity extends Activity implements Pluginable, Attachable<Activity> {
    public final static String TAG = PluginActivity.class.getSimpleName();
    protected Activity mProxyActivity;
    private Resources mResources;
    PluginApk mPluginApk;

    @Override
    public void attach(Activity proxy, PluginApk apk) {
        mProxyActivity = proxy;
        mPluginApk = apk;
        mResources = apk.pluginRes;
    }

    @Override
    public void setContentView(int layoutResID) {
        Log.e("weihan","setContentView-- ");
        mProxyActivity.setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        Log.e("weihan","setContentView--1 ");
        mProxyActivity.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        mProxyActivity.setContentView(view, params);
    }


    @Override
    public View findViewById(int id) {
        View viewById = mProxyActivity.findViewById(id);
        Log.e("weihan","findViewById--1 777 "+ viewById);
        return viewById;
    }

    @Override
    public Resources getResources() {
        return mResources;
    }

    @Override
    public WindowManager getWindowManager() {
        return mProxyActivity.getWindowManager();
    }

    @Override
    public ClassLoader getClassLoader() {
        return mProxyActivity.getClassLoader();
    }

    @Override
    public Context getApplicationContext() {
        return mProxyActivity.getApplicationContext();
    }

    @Override
    public MenuInflater getMenuInflater() {
        return mProxyActivity.getMenuInflater();
    }


    @Override
    public Window getWindow() {
        return mProxyActivity.getWindow();
    }

    @Override
    public Intent getIntent() {
        return mProxyActivity.getIntent();
    }

    @Override
    public LayoutInflater getLayoutInflater() {
        return mProxyActivity.getLayoutInflater();
    }

    @Override
    public String getPackageName() {
        return mPluginApk.packageInfo.packageName;
    }

    @SuppressLint("MissingSuperCall")

    @Override
    public void onCreate(Bundle bundle) {
//         super.onCreate(bundle);

        Log.e("weihan","onCreate-- ");
    }

    @SuppressLint("MissingSuperCall")

    @Override
    public void onStart() {
//        super.onStart();
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onResume() {
//        super.onResume();
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onStop() {
    }

    @SuppressLint("MissingSuperCall")

    @Override
    public void onPause() {
//        super.onPause();
    }

    @SuppressLint("MissingSuperCall")

    @Override
    public void onDestroy() {
//        super.onDestroy();
    }

    @Override
    public void toast_() {
        Log.e("weihan","mProxyActivity:"+mProxyActivity);
//        Toast.makeText(mProxyActivity,"dddddd",Toast.LENGTH_SHORT).show();
    }
}
