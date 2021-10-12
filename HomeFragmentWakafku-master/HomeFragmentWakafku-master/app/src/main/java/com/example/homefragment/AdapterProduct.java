package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.myviewholder> {
    ArrayList<DataModelProduct> dataModelProducts;

    public AdapterProduct(ArrayList<DataModelProduct> dataModelProducts) {
        this.dataModelProducts = dataModelProducts;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_product, parent,false);
        return new AdapterProduct.myviewholder(view);    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(dataModelProducts.get(position).getImage());
        holder.name_product.setText(dataModelProducts.get(position).getName_product());
        holder.price_product.setText(dataModelProducts.get(position).getPrice_product());
    }

    @Override
    public int getItemCount() {
        return dataModelProducts.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name_product;
        TextView price_product;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_product);
            name_product = itemView.findViewById(R.id.txt_name_product);
            price_product = itemView.findViewById(R.id.txt_price_product);
        }
    }
}
