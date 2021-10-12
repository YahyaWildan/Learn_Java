package com.example.lifecycleandroid.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivityStudiCaseBinding;

public class StudiCaseActivity extends AppCompatActivity {

    ActivityStudiCaseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudiCaseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}