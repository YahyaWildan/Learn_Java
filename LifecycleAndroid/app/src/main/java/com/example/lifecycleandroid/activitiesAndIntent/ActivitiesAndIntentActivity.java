package com.example.lifecycleandroid.activitiesAndIntent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lifecycleandroid.databinding.ActivityActivitiesAndIntentBinding;

public class ActivitiesAndIntentActivity extends AppCompatActivity {

    ActivityActivitiesAndIntentBinding binding;
    int count = 0;
    String KEY_COUNT = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityActivitiesAndIntentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY_COUNT,0);
            binding.tvCount.setText(String.valueOf(count));
        }

        binding.tvCount.setText(String.valueOf(count));
        binding.btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1;
                binding.tvCount.setText(String.valueOf(count));
            }
        });

        binding.btnGoToExplicitIntent.setOnClickListener(view -> {
            Intent intentGoToExplicit = new Intent(this, ExplicitIntentActivity.class);
            intentGoToExplicit.putExtra("dataCount", count);
            startActivity(intentGoToExplicit);
//            startActivity(new Intent(this, ExplicitIntentActivity.class));
        });
        binding.btnGoToImplicitIntent.setOnClickListener(view -> {
            startActivity(new Intent(this, ImplicitIntentActivity.class));
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
    }
}