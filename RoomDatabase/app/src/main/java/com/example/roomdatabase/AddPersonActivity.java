package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.roomdatabase.data.Person;
import com.example.roomdatabase.data.PersonDatabase;
import com.example.roomdatabase.databinding.ActivityAddPersonBinding;
import com.example.roomdatabase.util.AppExecutors;

public class AddPersonActivity extends AppCompatActivity {

    ActivityAddPersonBinding binding;

    PersonDatabase personDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddPersonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        personDatabase = PersonDatabase.getInstance(this);
        binding.btnSubmit.setOnClickListener(v -> {
            Person newPerson = new Person();
            newPerson.setName(binding.etName.getText().toString());
            newPerson.setAge(binding.etAge.getText().toString());
            newPerson.setHobi(binding.etHobi.getText().toString());
            newPerson.setEmail(binding.etEmail.getText().toString());

            AppExecutors.getInstance().diskIO().execute(() -> {
                Long result = personDatabase.personDao().insert(newPerson);
                runOnUiThread(() -> {
                    if (result != 0) {
                        Toast.makeText(AddPersonActivity.this, "Add Person Success "
                                , Toast.LENGTH_LONG).show();
                        startActivity(new Intent(this, MainActivity.class));
                    } else {
                        Toast.makeText(AddPersonActivity.this, "Add Person Fail "
                                , Toast.LENGTH_LONG).show();
                    }
                });
            });
        });
    }
}