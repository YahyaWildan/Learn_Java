package com.example.knowinglifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.knowinglifecycle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private EditText inputData;
    public static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        inputData = (EditText) findViewById(R.id.inputKomentar);

//        savedInstanceState.putString("data", binding.inputKomentar.getText().toString());
//        binding.inputKomentar.setText(savedInstanceState.getString("data"));

    }
}