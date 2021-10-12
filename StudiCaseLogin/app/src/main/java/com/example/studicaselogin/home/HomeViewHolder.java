package com.example.studicaselogin.home;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studicaselogin.databinding.ItemViewGamesBinding;

public class HomeViewHolder extends RecyclerView.ViewHolder {

    ItemViewGamesBinding binding;

    public HomeViewHolder(ItemViewGamesBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void setDataInView(Context context,GamesModel item) {
        binding.tvStarRate.setText(item.getStarRate());
        binding.imgGames.setImageDrawable(ContextCompat.getDrawable(context, item.getImage()));
        binding.tvTittle.setText(item.getTittleGame());
    }
}
