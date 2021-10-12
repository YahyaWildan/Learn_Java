package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiwaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        recyclerView = findViewById(R.id.recyclerview);

        mahasiswaAdapter = new MahasiwaAdapter(mahasiswaArrayList,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);

    }
    public void getData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_foreground,"yahya","01","1A"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_foreground,"yahya","02","1A"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_foreground,"yahya","03","1A"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_foreground,"yahya","04","1A"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_foreground,"yahya","05","1A"));
    }
}