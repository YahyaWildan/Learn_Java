package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAddressActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<DataModelListAddress> dataModelListAddresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_address);

        recyclerView = findViewById(R.id.recycler_view_list_address);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataModelListAddresses = new ArrayList<>();
        DataModelListAddress address1 = new DataModelListAddress("Rumah", "Tiara Widya Kusuma", "Jl. Kelud Raya No 32-34 Petompon,Gajah Mungkur, Semarang,50273");
        dataModelListAddresses.add(address1);
        DataModelListAddress address2 = new DataModelListAddress("Rumah", "Tiara Widya Kusuma", "Jl. Kelud Raya No 32-34 Petompon,Gajah Mungkur, Semarang,50273");
        dataModelListAddresses.add(address2);
        DataModelListAddress address3 = new DataModelListAddress("Rumah", "Tiara Widya Kusuma", "Jl. Kelud Raya No 32-34 Petompon,Gajah Mungkur, Semarang,50273");
        dataModelListAddresses.add(address3);
        DataModelListAddress address4 = new DataModelListAddress("Rumah", "Tiara Widya Kusuma", "Jl. Kelud Raya No 32-34 Petompon,Gajah Mungkur, Semarang,50273");
        dataModelListAddresses.add(address4);
        DataModelListAddress address5 = new DataModelListAddress("Rumah", "Tiara Widya Kusuma", "Jl. Kelud Raya No 32-34 Petompon,Gajah Mungkur, Semarang,50273");
        dataModelListAddresses.add(address5);
        DataModelListAddress address6 = new DataModelListAddress("Rumah", "Tiara Widya Kusuma", "Jl. Kelud Raya No 32-34 Petompon,Gajah Mungkur, Semarang,50273");
        dataModelListAddresses.add(address6);

        recyclerView.setAdapter(new AdapterListAddress(dataModelListAddresses));
    }
}