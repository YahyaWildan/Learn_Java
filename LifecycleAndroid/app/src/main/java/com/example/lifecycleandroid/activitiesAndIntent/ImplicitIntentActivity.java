package com.example.lifecycleandroid.activitiesAndIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.lifecycleandroid.databinding.ActivityImplicitIntentBinding;

public class ImplicitIntentActivity extends AppCompatActivity {

    ActivityImplicitIntentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImplicitIntentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGoToGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}