package com.example.studicaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.studicaselogin.databinding.ActivityMainBinding;
import com.example.studicaselogin.home.HomeMainActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnLogin.setOnClickListener(view -> {
            startActivity(new Intent(this, HomeMainActivity.class));
        });
    }
}