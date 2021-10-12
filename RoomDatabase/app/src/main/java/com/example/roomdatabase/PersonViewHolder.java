package com.example.roomdatabase;

import androidx.recyclerview.widget.RecyclerView;

import com.example.roomdatabase.data.Person;
import com.example.roomdatabase.databinding.ItemPersonBinding;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    ItemPersonBinding binding;

    public PersonViewHolder(ItemPersonBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void setDataValue(Person item) {
        binding.tvName.setText(item.getName());
        binding.tvAge.setText(item.getAge());
        binding.tvHobi.setText(item.getHobi());
        binding.tvEmail.setText(item.getEmail());
    }
}
