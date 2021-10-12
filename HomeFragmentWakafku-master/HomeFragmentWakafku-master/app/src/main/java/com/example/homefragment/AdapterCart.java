package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCart extends RecyclerView.Adapter<AdapterCart.myviewholder>{

    ArrayList<DataModelCart> dataModelCarts;

    public AdapterCart(ArrayList<DataModelCart> dataModelCarts) {
        this.dataModelCarts = dataModelCarts;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_cart, parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.image.setImageResource(dataModelCarts.get(position).getImage());
        holder.txtCheckBox.setText(dataModelCarts.get(position).getTxtCheckBox());
        holder.nameProduct.setText(dataModelCarts.get(position).getNameProduct());
        holder.colorProduct.setText(dataModelCarts.get(position).getColorProduct());
        holder.sizeProduct.setText(dataModelCarts.get(position).getSizeProduct());
        holder.priceProduct.setText(dataModelCarts.get(position).getPriceProduct());
    }

    @Override
    public int getItemCount() {
        return dataModelCarts.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView txtCheckBox, nameProduct, colorProduct,sizeProduct, priceProduct;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img_cart_product);
            txtCheckBox = itemView.findViewById(R.id.selected_shop);
            nameProduct = itemView.findViewById(R.id.product_cart_name);
            colorProduct = itemView.findViewById(R.id.product_color_cart) ;
            sizeProduct = itemView.findViewById(R.id.cart_size_product);
            priceProduct = itemView.findViewById(R.id.price_product_cart);
        }
    }
}
