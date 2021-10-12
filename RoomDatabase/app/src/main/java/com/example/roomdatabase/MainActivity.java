package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.roomdatabase.data.Person;
import com.example.roomdatabase.data.PersonDatabase;
import com.example.roomdatabase.databinding.ActivityMainBinding;
import com.example.roomdatabase.util.AppExecutors;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    PersonDatabase personDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        personDatabase = PersonDatabase.getInstance(this);

        binding.fabAdd.setOnClickListener(view -> {
            startActivity(new Intent(this, AddPersonActivity.class));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        AppExecutors.getInstance().diskIO().execute(() -> {
            List<Person> persons = personDatabase.personDao().getAllPerson();
            runOnUiThread(() -> {
                if (persons.size() > 0) {
                    PersonAdapter personAdapter = new PersonAdapter(persons, MainActivity.this);
                    binding.rvPerson.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    binding.rvPerson.setAdapter(personAdapter);
                }
            });
        });
    }
}