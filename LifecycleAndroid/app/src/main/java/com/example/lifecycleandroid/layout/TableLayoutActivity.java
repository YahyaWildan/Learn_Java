package com.example.lifecycleandroid.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivityTableLayoutBinding;

public class TableLayoutActivity extends AppCompatActivity {

    ActivityTableLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityTableLayoutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}