package com.example.roomdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.roomdatabase.data.Person;
import com.example.roomdatabase.databinding.ItemPersonBinding;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private List<Person> data;
    private Context context;

    public PersonAdapter(List<Person> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemPersonBinding binding =ItemPersonBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new PersonViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person item = data.get(position);
        holder.setDataValue(item);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
