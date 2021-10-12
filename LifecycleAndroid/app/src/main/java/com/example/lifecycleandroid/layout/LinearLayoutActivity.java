package com.example.lifecycleandroid.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivityLinearLayoutBinding;

public class LinearLayoutActivity extends AppCompatActivity {

    ActivityLinearLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLinearLayoutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}