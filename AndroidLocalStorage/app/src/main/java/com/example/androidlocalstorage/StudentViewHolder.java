package com.example.androidlocalstorage;


import androidx.recyclerview.widget.RecyclerView;

import com.example.androidlocalstorage.data.Student;
import com.example.androidlocalstorage.databinding.ItemStudentBinding;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    ItemStudentBinding binding;

    public StudentViewHolder(ItemStudentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void setDataToView(Student item){
        binding.tvStudentName.setText(item.getFullname());
        binding.tvStudentEmail.setText(item.getEmail());
    }
}
