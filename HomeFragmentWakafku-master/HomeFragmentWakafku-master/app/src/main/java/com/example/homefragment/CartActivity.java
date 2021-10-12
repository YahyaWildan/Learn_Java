package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<DataModelCart> dataModelCarts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView = findViewById(R.id.recycler_view_cart_product);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataModelCarts = new ArrayList<>();
        DataModelCart product1 = new DataModelCart(R.drawable.product1, "Toko Mukena", "Mukena Chan", "Merah", "L", "69.000");
        dataModelCarts.add(product1);

        recyclerView.setAdapter(new AdapterCart(dataModelCarts));
    }
}