package com.example.studicaselogin.home;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studicaselogin.databinding.ItemViewGamesBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    private ArrayList<GamesModel> data;
    private Context context;

    public HomeAdapter(ArrayList<GamesModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public HomeViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        ItemViewGamesBinding view = ItemViewGamesBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        GamesModel item = data.get(position);
        holder.setDataInView(context,item);
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
            intent.putExtra("rate",item.getStarRate());
            intent.putExtra("judul",item.getTittleGame());
            intent.putExtra("gambar",item.getImage());
            holder.itemView.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
