package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterKajian extends RecyclerView.Adapter<AdapterKajian.myviewholder_kajian>{

    ArrayList<DataModelKajian> dataholder_kajian;

    public AdapterKajian(ArrayList<DataModelKajian> dataholder_kajian) {
        this.dataholder_kajian = dataholder_kajian;
    }

    @NonNull
    @Override
    public myviewholder_kajian onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view   = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_kajian,parent, false);
        return new myviewholder_kajian(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder_kajian holder, int position) {
        holder.img.setImageResource(dataholder_kajian.get(position).getImage_kajian());
    }

    @Override
    public int getItemCount() {
        return dataholder_kajian.size();
    }

    class myviewholder_kajian extends RecyclerView.ViewHolder{
        ImageView img;

        public myviewholder_kajian(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_kajian);

        }
    }
}
