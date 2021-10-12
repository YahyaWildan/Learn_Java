package com.example.lifecycleandroid.activityLifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.lifecycleandroid.activitiesAndIntent.ActivitiesAndIntentActivity;

import com.example.lifecycleandroid.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TestLifecycleSecond", "onCreate Runn");
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
        binding.btnGotoActivitiesAndIntent.setOnClickListener(view -> {
            startActivity(new Intent(this, ActivitiesAndIntentActivity.class));
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TestLifecycleSecond", "onStart Run");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TestLifecycleSecond", "onResume Runn");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TestLifecycleSecond", "onPause Runn");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TestLifecycleSecond", "onStop Runn");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TestLifecycleSecond", "onDestroy Runn");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TestLifecycleSecond", "onRestart: ");
    }
}