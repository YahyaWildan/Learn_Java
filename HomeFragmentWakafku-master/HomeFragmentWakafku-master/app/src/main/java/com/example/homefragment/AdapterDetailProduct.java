package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDetailProduct extends RecyclerView.Adapter<AdapterDetailProduct.myviewholder>{

    ArrayList<DataModelDetailProduct> dataModelDetailProducts;

    public AdapterDetailProduct(ArrayList<DataModelDetailProduct> dataModelDetailProducts) {
        this.dataModelDetailProducts = dataModelDetailProducts;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.layout_item_image_detail_product,parent,false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.setSlideImageData(dataModelDetailProducts.get(position));
    }

    @Override
    public int getItemCount() {
        return dataModelDetailProducts.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView image;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_detail_product);
        }
        void setSlideImageData(DataModelDetailProduct dataModelDetailProduct){
            image.setImageResource(dataModelDetailProduct.getImg());
        }
    }
}
