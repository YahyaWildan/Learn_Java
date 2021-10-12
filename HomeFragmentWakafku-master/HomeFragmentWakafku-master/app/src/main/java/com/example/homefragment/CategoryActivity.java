package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {
    ImageView imageViewSearch, icon_back_action;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        imageViewSearch = findViewById(R.id.category_search);
       imageViewSearch.setOnClickListener(v -> {
           startActivity(new Intent(getApplicationContext(), SearchActivity.class));
       });

       icon_back_action = findViewById(R.id.category_back);
       icon_back_action.setOnClickListener(v -> {
           startActivity(new Intent(getApplicationContext(), MainActivity.class));
       });
    }
}