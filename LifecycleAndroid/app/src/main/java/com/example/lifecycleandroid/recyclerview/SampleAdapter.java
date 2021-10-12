package com.example.lifecycleandroid.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifecycleandroid.databinding.ItemSampleBinding;

import java.util.ArrayList;

public class SampleAdapter extends RecyclerView.Adapter<SampleViewHolder> {

    private ArrayList<String> data;
    private Context context;

    public SampleAdapter(ArrayList<String> data, Context context) {
        this.data = data;
    }

    @Override
    public SampleViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        ItemSampleBinding binding = ItemSampleBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new SampleViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SampleViewHolder holder, int position) {
        String name = data.get(position);
        String address = data.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
