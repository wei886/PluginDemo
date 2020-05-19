package com.pluginapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.l.plugincore.Constants
import com.l.plugincore.Constants.PLUGIN_CLASS_NAME
import com.l.plugincore.PluginManager
import java.io.File


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PluginManager.init( this)

        findViewById<View>(R.id.tv33).setOnClickListener(object :View.OnClickListener{
           override fun onClick(v: View?) {
               val intent = Intent()
               intent.putExtra(Constants.PACKAGE_NAME, "com.l.secondapp")
               intent.putExtra(Constants.PLUGIN_CLASS_NAME, "com.l.secondapp.MainActivity");
               //将secondapp-debug.apk 放到sd卡
               PluginManager.getInstance()
                   .loadApk(Environment.getExternalStorageDirectory().path + File.separator + "secondapp-debug.apk")
               PluginManager.getInstance().startActivity(intent)
           }
       })
    }
}
