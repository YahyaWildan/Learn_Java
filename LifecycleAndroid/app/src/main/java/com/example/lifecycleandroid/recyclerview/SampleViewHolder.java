package com.example.lifecycleandroid.recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifecycleandroid.databinding.ItemSampleBinding;

public class SampleViewHolder extends RecyclerView.ViewHolder {

    ItemSampleBinding binding;

    public SampleViewHolder(ItemSampleBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void setDataInView(HeroModel item, Context context){
        binding.tvName.setText(item.getName());
        binding.tvAddress.setText(item.getAddress());
    }

}
