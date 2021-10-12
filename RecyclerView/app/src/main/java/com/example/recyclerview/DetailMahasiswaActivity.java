package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMahasiswaActivity extends AppCompatActivity {

    ImageView img;
    TextView namaS, nimS, kelasS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mahasiswa);


        img = (ImageView) findViewById(R.id.imgDetail);
        namaS = (TextView) findViewById(R.id.txtNama);
        nimS = (TextView) findViewById(R.id.txtNim);
        kelasS = (TextView) findViewById(R.id.txtKelas);
        getData();
    }

    private void getData() {
        int gambar = getIntent().getIntExtra("image",0);
        String nama = getIntent().getStringExtra("nama");
        String nim = getIntent().getStringExtra("nim");
        String kelas = getIntent().getStringExtra("kelas");

        img.setImageDrawable(getResources().getDrawable(gambar));
        namaS.setText(nama);
        nimS.setText(nim);
        kelasS.setText(kelas);

    }
}