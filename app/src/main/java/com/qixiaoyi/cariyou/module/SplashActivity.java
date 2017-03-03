package com.qixiaoyi.cariyou.module;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.qixiaoyi.cariyou.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startActivity(new Intent(SplashActivity.this,RegisteredActivity.class));
    }

}