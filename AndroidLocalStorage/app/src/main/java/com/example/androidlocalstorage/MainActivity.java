package com.example.androidlocalstorage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androidlocalstorage.R;
import com.example.androidlocalstorage.data.Student;
import com.example.androidlocalstorage.data.StudentDatabase;
import com.example.androidlocalstorage.databinding.ActivityMainBinding;
import com.example.androidlocalstorage.util.AppExecutors;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    StudentDatabase studentDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        studentDatabase = StudentDatabase.getInstance(this);

        binding.fabAdd.setOnClickListener(view -> {
            startActivity(new Intent(this, AddStudentActivity.class));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        AppExecutors.getInstance().diskIO().execute(() -> {
            List<Student> students = studentDatabase.studentDao().getAllStudent();
            runOnUiThread(() -> {
                if (students.size() > 0) {
//                    Toast.makeText(MainActivity.this, String.valueOf(students.size()), Toast.LENGTH_LONG).show();
                    StudentAdapter studentAdapter = new StudentAdapter(students, MainActivity.this);
                    binding.rvStudent.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                    binding.rvStudent.setAdapter(studentAdapter);
                }
            });
        });
    }
}