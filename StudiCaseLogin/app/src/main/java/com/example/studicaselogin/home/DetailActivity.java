package com.example.studicaselogin.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.studicaselogin.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int gambar = getIntent().getIntExtra("gambar",0);
        String rate = getIntent().getStringExtra("rate");
        String judul = getIntent().getStringExtra("judul");
        binding.gambarGame.setImageDrawable(getResources().getDrawable(gambar));
        binding.starRate.setText(rate);
        binding.judulGame.setText(judul);
    }
}