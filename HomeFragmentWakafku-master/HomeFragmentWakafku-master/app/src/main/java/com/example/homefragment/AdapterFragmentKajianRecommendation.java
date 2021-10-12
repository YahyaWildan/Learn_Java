package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFragmentKajianRecommendation extends RecyclerView.Adapter<AdapterFragmentKajianRecommendation.myviewholder>{

    ArrayList<DataModelFragmentKajianRecommendation> dataHolder;

    public AdapterFragmentKajianRecommendation(ArrayList<DataModelFragmentKajianRecommendation> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_fragment_kajian_recommendation, parent, false);
        return new myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img_header.setImageResource(dataHolder.get(position).getImg_header());
        holder.txtTitle.setText(dataHolder.get(position).getTitle());
        holder.txtDesciption.setText(dataHolder.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        ImageView img_header;
        TextView txtTitle, txtDesciption;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img_header = itemView.findViewById(R.id.image_fragment_kajian_recommendation);
            txtTitle = itemView.findViewById(R.id.txt_title_fragment_kajian_recommendation);
            txtDesciption = itemView.findViewById(R.id.txt_description_fragment_kajian_recommendation);
        }
    }
}
