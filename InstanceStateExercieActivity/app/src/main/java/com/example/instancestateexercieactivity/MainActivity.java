package com.example.instancestateexercieactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.instancestateexercieactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int count = 0;
    String KEY_COUNT = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCount.setOnClickListener(view -> {
            count = Integer.parseInt(binding.tvCount.getText().toString());
            count += 1;

            binding.tvCount.setText(String.valueOf(count));
        });
        if (savedInstanceState != null) {
            String count = savedInstanceState.getString(KEY_COUNT);
            binding.tvCount.setText(count);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "Saved count = " +
                binding.tvCount.getText().toString(), Toast.LENGTH_SHORT).show();
        outState.putString(KEY_COUNT, String.valueOf(binding.tvCount.getText()));
    }

}