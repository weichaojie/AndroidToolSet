package com.example.weichaojie.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


// 在ubuntu上运行时需要添加授权
// sudo chown weichaojie -R /dev/kvm

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: my first create an Activity !!!!!!!!");

        Button  button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, R.string.my_first_toast, Toast.LENGTH_SHORT);
                AlertDialog.Builder alertDlg = new AlertDialog.Builder(MainActivity.this).setTitle(R.string.warnning_tittle);
                alertDlg.create().show();
            }
        });
    }
}
