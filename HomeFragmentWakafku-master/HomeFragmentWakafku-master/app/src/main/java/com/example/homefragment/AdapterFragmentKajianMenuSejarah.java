package com.example.homefragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterFragmentKajianMenuSejarah extends RecyclerView.Adapter<AdapterFragmentKajianMenuSejarah.myvieholder>{

    ArrayList<DataModelFragmentKajianMenuSejarah> dataHolder;

    public AdapterFragmentKajianMenuSejarah(ArrayList<DataModelFragmentKajianMenuSejarah> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myvieholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_kajian_menu_sejarah, parent,false);
        return new myvieholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myvieholder holder, int position) {
        holder.img.setImageResource(dataHolder.get(position).getImage());
        holder.title.setText(dataHolder.get(position).getTxtTitle());
        holder.desc.setText(dataHolder.get(position).getTxtDesc());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

//    public void onCreateView(@NonNull LayoutInflater inflater, ViewGroup container Bundle savedIns)

    public AdapterFragmentKajianMenuSejarah(Context context, int id, KajianFragment fragment ){

    }

    class myvieholder extends RecyclerView.ViewHolder implements View.OnClickListener, PopupMenu.OnMenuItemClickListener{
        private static final String TAG = "MyViewHolder";

        ImageView img;
        ImageButton imgBtn;
        TextView title, desc;
        Context context;

        public myvieholder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            img = itemView.findViewById(R.id.image_kajian_menu_sejarah);
            title = itemView.findViewById(R.id.txt_title_kajian_menu_sejarah);
            desc = itemView.findViewById(R.id.txt_description_kajian_menu_sejarah);
            imgBtn = itemView.findViewById(R.id.btn_action_more_kajian_menu_sejarah);
            imgBtn.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }

        private void showPopupMenu(View view) {
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.inflate(R.menu.menu_popup_kajian_sejarah);
            popupMenu.setOnMenuItemClickListener(this);
            popupMenu.show();
        }
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_popup_listen_up:
                    Fragment listen = new ListenFragment();
//                    Log.d(TAG, "onMenuItemClick: action_popup_listen_up @ " + getAdapterPosition());
                    Intent intent = new Intent(context, DetailKajianActivity.class);
                    context.startActivity(intent);
                    return true;
                case R.id.action_popup_watch:
//                    Log.d(TAG, "onMenuItemClick: action_popup_watch @ " + getAdapterPosition());
                    Intent intentW = new Intent(context, DetailKajianActivity.class);
                    context.startActivity(intentW);
                    return true;
                default:
                    return false;
            }
        }
    }
}
