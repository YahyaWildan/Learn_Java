package com.example.androidlocalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.androidlocalstorage.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    Preference preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        preference = Preference.getInstance(this);


        binding.btnLogin.setOnClickListener(v -> {
            preference.getEditor().putBoolean(Constant.PREF_IS_LOGIN, true);
            preference.getEditor().apply();

            startActivity(new Intent(this, MainActivity.class));
        });
    }
}