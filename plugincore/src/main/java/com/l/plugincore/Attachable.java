package com.l.plugincore;

import android.app.Activity;

interface Attachable<T> {
    public void attach(Activity proxy, PluginApk apk);
}
