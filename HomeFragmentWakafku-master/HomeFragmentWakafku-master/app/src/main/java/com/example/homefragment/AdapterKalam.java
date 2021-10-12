package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class AdapterKalam extends RecyclerView.Adapter<AdapterKalam.myviewholder_kalam> {

    ArrayList<DataModelKalam> dataholderkalam;

    public AdapterKalam(ArrayList<DataModelKalam> dataholderkalam) {
        this.dataholderkalam = dataholderkalam;
    }

    @NonNull
    @Override
    public myviewholder_kalam onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_kalam, parent,false);
        return new myviewholder_kalam(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder_kalam holder, int position) {
        holder.img.setImageResource(dataholderkalam.get(position).getImg_kalam());

    }

    @Override
    public int getItemCount() {
        return dataholderkalam.size();
    }

    class myviewholder_kalam extends RecyclerView.ViewHolder {
        ImageView img;

        public myviewholder_kalam(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_kalam);
        }
    }


}
