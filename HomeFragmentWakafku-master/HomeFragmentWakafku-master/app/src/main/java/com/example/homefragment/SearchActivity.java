package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    RecyclerView recyclerViewSearch;
    ArrayList<DataModelSearch> dataSearchHolder;

    ImageView icon_back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        icon_back = findViewById(R.id.search_back);
        icon_back.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        });

        recyclerViewSearch = findViewById(R.id.search_recyclerview);
        recyclerViewSearch.setLayoutManager(new GridLayoutManager(this,3));

        dataSearchHolder = new ArrayList<>();
        DataModelSearch data1 = new DataModelSearch("Q.S Al-Imran 188");
        dataSearchHolder.add(data1);
        DataModelSearch data2 = new DataModelSearch("Wakaf");
        dataSearchHolder.add(data2);


        recyclerViewSearch.setAdapter(new AdapterSearch(dataSearchHolder));

    }
}