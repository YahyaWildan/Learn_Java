package com.example.lifecycleandroid.activityLifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.lifecycleandroid.R;
import com.example.lifecycleandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TestLifecycleMain", "onCreate Runn");
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGoToSecond.setOnClickListener(view -> {
//            Intent intent = new Intent(this,SecondActivity.class);
//            startActivity(intent);

            startActivity(new Intent(this, SecondActivity.class));
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TestLifecycleMain", "onStart Run");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TestLifecycleMain", "onResume Runn");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TestLifecycleMain", "onPause Runn");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TestLifecycleMain", "onStop Runn");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TestLifecycleMain", "onDestroy Runn");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TestLifecycleMain", "onRestart: ");
    }
}