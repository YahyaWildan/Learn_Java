package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFragmentKajianFavorite extends RecyclerView.Adapter<AdapterFragmentKajianFavorite.myviewholder>{

    ArrayList<DataModelFragmentKajianFavorite> dataHolder;

    public AdapterFragmentKajianFavorite(ArrayList<DataModelFragmentKajianFavorite> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_fragment_kajian_favorite, parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(dataHolder.get(position).getImage_header());
        holder.txtTitle.setText(dataHolder.get(position).getTitle());
        holder.txtDesc.setText(dataHolder.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtTitle, txtDesc;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_fragment_kajian_favorite);
            txtTitle = itemView.findViewById(R.id.txt_title_fragment_kajian_favorite);
            txtDesc = itemView.findViewById(R.id.txt_description_fragment_kajian_favorite);
        }
    }
}
