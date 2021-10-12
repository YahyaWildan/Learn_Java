package com.example.homefragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterFavoriteProduct extends RecyclerView.Adapter<AdapterFavoriteProduct.myviewholder>{

    ArrayList<DataModelFavoriteProduct> dataModelFavoriteProducts;
    Context context;

    public AdapterFavoriteProduct(ArrayList<DataModelFavoriteProduct> dataModelFavoriteProducts) {
        this.dataModelFavoriteProducts = dataModelFavoriteProducts;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_favorite, parent, false);
        return new AdapterFavoriteProduct.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.image.setImageResource(dataModelFavoriteProducts.get(position).getImage_favorite());
        holder.name_product.setText(dataModelFavoriteProducts.get(position).getName_product());
        holder.color_product.setText(dataModelFavoriteProducts.get(position).getColor_product());
        holder.size_product.setText(dataModelFavoriteProducts.get(position).getSize_product());
        holder.price_product.setText(dataModelFavoriteProducts.get(position).getPrice_harga());


    }

    @Override
    public int getItemCount() {
        return dataModelFavoriteProducts.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name_product, color_product, size_product, price_product;
        Button actoinCart;

        public myviewholder(@NonNull View itemView ) {
            super(itemView);
            image = itemView.findViewById(R.id.img_favorite_product);

            name_product = itemView.findViewById(R.id.product_favorite_name);
            color_product = itemView.findViewById(R.id.color_product);
            size_product = itemView.findViewById(R.id.size_product);
            price_product = itemView.findViewById(R.id.price_product);
            context = itemView.getContext();
            actoinCart = itemView.findViewById(R.id.actionAddCart);
            actoinCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   context.startActivity(new Intent(context, CartActivity.class));
                }
            });

        }
    }
}
