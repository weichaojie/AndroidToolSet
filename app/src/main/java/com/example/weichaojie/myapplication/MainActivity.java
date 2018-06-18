package com.example.weichaojie.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


// 在ubuntu上运行时需要添加授权
// sudo chown weichaojie -R /dev/kvm

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: my first create an Activity !!!!!!!!");
    }
}
