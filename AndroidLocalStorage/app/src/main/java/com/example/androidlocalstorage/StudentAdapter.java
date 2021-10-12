package com.example.androidlocalstorage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidlocalstorage.data.Student;
import com.example.androidlocalstorage.databinding.ItemStudentBinding;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private List<Student> data;
    private Context context;

    public StudentAdapter(List<Student> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemStudentBinding binding = ItemStudentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new StudentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student item = data.get(position);
        holder.setDataToView(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
