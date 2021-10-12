package com.example.homefragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterListAddress extends RecyclerView.Adapter<AdapterListAddress.myviewholder>{

    ArrayList<DataModelListAddress> myholder;

    public AdapterListAddress(ArrayList<DataModelListAddress> myholder) {
        this.myholder = myholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_list_address, parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.labelName.setText(myholder.get(position).getLabelName());
        holder.recipientName.setText(myholder.get(position).getRecipient_name());
        holder.txtAddress.setText(myholder.get(position).getTxtAddress());
    }

    @Override
    public int getItemCount() {
        return myholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        TextView labelName, recipientName, txtAddress;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            labelName = itemView.findViewById(R.id.label_address);
            recipientName = itemView.findViewById(R.id.recipient_name);
            txtAddress = itemView.findViewById(R.id.txt_detail_address);
        }
    }
}
