package com.example.homefragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<DataModelProduct> dataModelProducts;

    public static ProductFragment getInstance(){
        ProductFragment productFragment = new ProductFragment();
        return productFragment;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product,container, false);
        recyclerView = view.findViewById(R.id.recylerview_product);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        dataModelProducts = new ArrayList<>();
        DataModelProduct product1 = new DataModelProduct(R.drawable.product1, "Gamis Santai Formal", "350.000");
        dataModelProducts.add(product1);
        DataModelProduct product2 = new DataModelProduct(R.drawable.product1, "Gamis Santai Formal", "350.000");
        dataModelProducts.add(product2);
        DataModelProduct product3 = new DataModelProduct(R.drawable.product1, "Gamis Santai Formal", "350.000");
        dataModelProducts.add(product3);
        DataModelProduct product4 = new DataModelProduct(R.drawable.product1, "Gamis Santai Formal", "350.000");
        dataModelProducts.add(product4);
        recyclerView.setAdapter(new AdapterProduct(dataModelProducts));



        return view;
    }
}

