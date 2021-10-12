package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    RecyclerView recyclerViewFavorite;
    ArrayList<DataModelFavoriteProduct> dataModelFavoriteProducts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        recyclerViewFavorite = findViewById(R.id.recycler_view_favorite);
//        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewFavorite.setLayoutManager(new LinearLayoutManager(this));

        dataModelFavoriteProducts = new ArrayList<>();
        DataModelFavoriteProduct product1 = new DataModelFavoriteProduct(R.drawable.product1, "Rasty Tunik", "Navy", "M", "120.000");
        dataModelFavoriteProducts.add(product1);
        DataModelFavoriteProduct product2 = new DataModelFavoriteProduct(R.drawable.produc2, "Rasty Tunik", "Navy", "M", "120.000");
        dataModelFavoriteProducts.add(product2);
        DataModelFavoriteProduct product3 = new DataModelFavoriteProduct(R.drawable.product1, "Rasty Tunik", "Navy", "M", "120.000");
        dataModelFavoriteProducts.add(product3);
        DataModelFavoriteProduct product4 = new DataModelFavoriteProduct(R.drawable.product1, "Rasty Tunik", "Navy", "M", "120.000");
        dataModelFavoriteProducts.add(product4);
        DataModelFavoriteProduct product5 = new DataModelFavoriteProduct(R.drawable.product1, "Rasty Tunik", "Navy", "M", "120.000");
        dataModelFavoriteProducts.add(product5);

        recyclerViewFavorite.setAdapter(new AdapterFavoriteProduct(dataModelFavoriteProducts));

    }
}