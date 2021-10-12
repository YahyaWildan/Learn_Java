package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.myviewholder_search>{
    ArrayList<DataModelSearch> dataHolderSearch;

    public AdapterSearch(ArrayList<DataModelSearch> dataHolderSearch) {
        this.dataHolderSearch = dataHolderSearch;
    }

    @NonNull
    @Override
    public myviewholder_search onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_search, parent,false);
        return new AdapterSearch.myviewholder_search(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder_search holder, int position) {
        holder.txt_search.setText(dataHolderSearch.get(position).getText_search());

    }

    @Override
    public int getItemCount() {
        return dataHolderSearch.size();
    }

    class myviewholder_search extends RecyclerView.ViewHolder {
        TextView txt_search;

        public myviewholder_search(@NonNull View itemView) {
            super(itemView);
            txt_search = itemView.findViewById(R.id.text_search);
        }
    }
}
