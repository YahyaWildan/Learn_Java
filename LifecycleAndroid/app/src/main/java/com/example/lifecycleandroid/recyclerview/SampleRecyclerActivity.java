package com.example.lifecycleandroid.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.lifecycleandroid.databinding.ActivitySampleRecyclerBinding;

import java.util.ArrayList;

public class SampleRecyclerActivity extends AppCompatActivity {

    ActivitySampleRecyclerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySampleRecyclerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<String> data = new ArrayList<>();
        data.add("Avenger");
        data.add("Captain America");
        data.add("Spiderman");
        data.add("Hulk");
        data.add("Superman");

        SampleAdapter adapter = new SampleAdapter(data, this);
        binding.rvHero.setLayoutManager(new LinearLayoutManager(this));
        binding.rvHero.setAdapter(adapter);

    }
}