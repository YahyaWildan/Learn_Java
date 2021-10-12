package com.example.lifecycleandroid.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivityConstraintLayoutBinding;

public class ConstraintLayoutActivity extends AppCompatActivity {

    ActivityConstraintLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConstraintLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}