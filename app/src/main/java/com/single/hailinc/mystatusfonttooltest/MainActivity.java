package com.single.hailinc.mystatusfonttooltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.doctor.hailin.mylibrary.StatusUtil;
import com.doctor.hailin.mylibrary.Util.StatusBarHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarHelper.setStatusBarLightMode(this);//true 黑体 ，false 白体
    }
}
