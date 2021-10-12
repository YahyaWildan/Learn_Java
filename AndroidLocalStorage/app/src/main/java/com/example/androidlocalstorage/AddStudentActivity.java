package com.example.androidlocalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidlocalstorage.data.Student;
import com.example.androidlocalstorage.data.StudentDatabase;
import com.example.androidlocalstorage.databinding.ActivityAddStudentBinding;
import com.example.androidlocalstorage.util.AppExecutors;

public class AddStudentActivity extends AppCompatActivity {

    StudentDatabase studentDatabase;

    ActivityAddStudentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddStudentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        studentDatabase = StudentDatabase.getInstance(this);
        binding.btnSave.setOnClickListener(v -> {
            Student newStudent = new Student();
            newStudent.setFullname(binding.etName.getText().toString());
            newStudent.setEmail(binding.etEmail.getText().toString());

            AppExecutors.getInstance().diskIO().execute(() -> {
                Long result = studentDatabase.studentDao().insert(newStudent);
                runOnUiThread(() -> {
                    if (result != 0) {
                        Toast.makeText(AddStudentActivity.this, "Sukses Menambahkan " +
                                newStudent.getFullname(), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(AddStudentActivity.this, "Gagal Menambahkan " +
                                newStudent.getFullname(), Toast.LENGTH_LONG).show();
                    }
                });
            });
        });

    }
}