package com.example.lifecycleandroid.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivityRelativeLayoutBinding;

public class RelativeLayoutActivity extends AppCompatActivity {

    ActivityRelativeLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityRelativeLayoutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}