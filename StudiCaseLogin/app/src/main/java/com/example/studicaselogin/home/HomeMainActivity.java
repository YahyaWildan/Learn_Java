package com.example.studicaselogin.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.studicaselogin.R;
import com.example.studicaselogin.databinding.ActivityHomeMainBinding;

import java.util.ArrayList;

public class HomeMainActivity extends AppCompatActivity {

    ActivityHomeMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<GamesModel> game = new ArrayList<>();
        game.add(new GamesModel(R.drawable.placeholder_photo, "4.6", "Mobile Legend"));
        game.add(new GamesModel(R.drawable.placeholder_photo, "4.6", "Mobile "));
        game.add(new GamesModel(R.drawable.placeholder_photo, "4.6", "Legend"));
        game.add(new GamesModel(R.drawable.placeholder_photo, "4.6", "Mobile "));
        game.add(new GamesModel(R.drawable.placeholder_photo, "4.6", "Legend"));


        HomeAdapter adapter = new HomeAdapter(game,this);
        binding.rvGame.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rvGame.setAdapter(adapter);

    }
}