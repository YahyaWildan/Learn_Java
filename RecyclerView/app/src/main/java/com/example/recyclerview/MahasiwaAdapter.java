package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiwaAdapter extends RecyclerView.Adapter<MahasiwaAdapter.MahasiswaViewHolder>{

    private ArrayList<Mahasiswa> listMahasiswa;
    private Context context;

    public MahasiwaAdapter(ArrayList<Mahasiswa> listMahasiswa, Context context) {
        this.listMahasiswa = listMahasiswa;
        this.context = context;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {

        holder.img.setImageResource(listMahasiswa.get(position).getImage());
        holder.tvNama.setText(listMahasiswa.get(position).getNama());
        holder.tvNim.setText(listMahasiswa.get(position).getNim());
        holder.tvKelas.setText(listMahasiswa.get(position).getKelas());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailMahasiswaActivity.class);
                intent.putExtra("image", listMahasiswa.get(position).getImage());
                intent.putExtra("nama", listMahasiswa.get(position).getNama());
                intent.putExtra("nim", listMahasiswa.get(position).getNim());
                intent.putExtra("kelas", listMahasiswa.get(position).getKelas());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }


    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tvNama, tvNim, tvKelas;
        public MahasiswaViewHolder(View view){
            super(view);
            img = view.findViewById(R.id.imgsiswa);
            tvNama = view.findViewById(R.id.tv_nama);
            tvNim = view.findViewById(R.id.tv_nis);
            tvKelas = view.findViewById(R.id.tv_kelas);
        }
    }
}
