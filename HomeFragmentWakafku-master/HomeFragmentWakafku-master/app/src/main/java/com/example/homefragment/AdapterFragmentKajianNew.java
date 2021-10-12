package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFragmentKajianNew extends RecyclerView.Adapter<AdapterFragmentKajianNew.myviewholderkajiannew>{

    ArrayList<DataModelFragmentKajianNew> dataModel;

    public AdapterFragmentKajianNew(ArrayList<DataModelFragmentKajianNew> dataModel) {
        this.dataModel = dataModel;
    }

    @NonNull
    @Override
    public myviewholderkajiannew onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_fragment_kajian_news, parent,false);
        return new myviewholderkajiannew(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholderkajiannew holder, int position) {
        holder.img.setImageResource(dataModel.get(position).getImageKajianNew());
        holder.txtTitle.setText(dataModel.get(position).getTitle());
        holder.txtDesc.setText(dataModel.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return dataModel.size();
    }

    class myviewholderkajiannew extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txtTitle, txtDesc;

        public myviewholderkajiannew(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image_fragment_kajian_new);
            txtTitle = itemView.findViewById(R.id.txt_title_fragment_kajian_new);
            txtDesc = itemView.findViewById(R.id.txt_description_fragment_kajian_new);
        }
    }
}
