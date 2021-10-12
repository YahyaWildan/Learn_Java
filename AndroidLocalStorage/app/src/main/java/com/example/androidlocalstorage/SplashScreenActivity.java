package com.example.androidlocalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.example.androidlocalstorage.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {

    ActivitySplashScreenBinding binding;

    Preference preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        preference = Preference.getInstance(this);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            boolean isLogin = preference.getSharedPreferences().getBoolean(Constant.PREF_IS_LOGIN, false);

            Intent logIntent;

            if (isLogin) {
                logIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
            } else {
                logIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
            }
            startActivity(logIntent);
        }, 3000);
    }
}