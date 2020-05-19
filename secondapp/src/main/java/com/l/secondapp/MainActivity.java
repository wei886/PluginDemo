package com.l.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.l.plugincore.PluginActivity;

public class MainActivity extends PluginActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("weihan","onCreate:");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View viewById = findViewById(R.id.tv11);
        Log.e("weihan","onCreate:1111");

        findViewById(R.id.tv11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mProxyActivity,"ddddddddd",Toast.LENGTH_SHORT).show();
            }
        });
//        Log.e("weihan","view:"+viewById);

    }
}
