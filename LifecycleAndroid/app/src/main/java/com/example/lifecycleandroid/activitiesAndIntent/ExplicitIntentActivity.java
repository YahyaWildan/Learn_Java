package com.example.lifecycleandroid.activitiesAndIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivityExplicitIntentBinding;

public class ExplicitIntentActivity extends AppCompatActivity {

    ActivityExplicitIntentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExplicitIntentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int count = getIntent().getIntExtra("dataCount", 0);
        binding.tvCount.setText(String.valueOf(count));
        
    }
}