package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DetailPesananActivity extends AppCompatActivity {

    Button actionPilihPembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesanan);

        actionPilihPembayaran = findViewById(R.id.action_pilih_pembayaran);
        actionPilihPembayaran.setOnClickListener(v ->
                startActivity(new Intent(getApplication(), ListAddressActivity.class)));
    }
}