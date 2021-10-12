package com.example.homefragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    RecyclerView recyclerViewKajian;
    RecyclerView recyclerViewKalam;

    ArrayList<DataModelBerita> dataBeritaHolder;
    ArrayList<DataModelKajian> dataKajianHolder;
    ArrayList<DataModelKalam> dataKalamHolder;


    LinearLayoutManager layoutManager;
    LinearLayoutManager layoutManager_kajian;
    LinearLayoutManager layoutManager_kalam;

    ConstraintLayout menuAlquran,menuTokoh, menuZiswah, menuAll, menu_coba_listen;

    public HomeFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.home_container_berita);
        recyclerViewKajian = view.findViewById(R.id.home_container_kajian);
        recyclerViewKalam = view.findViewById(R.id.home_container_kalam);



        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager_kajian = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager_kalam = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        menuAll = view.findViewById(R.id.home_menu_all);
        menuAll.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), CategoryActivity.class));
        });
        menu_coba_listen = view.findViewById(R.id.home_menu_alquran);
        menu_coba_listen.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), DetailProductActivity.class));
        });



        recyclerView.setLayoutManager(layoutManager);
        recyclerViewKajian.setLayoutManager(layoutManager_kajian);
        recyclerViewKalam.setLayoutManager(layoutManager_kalam);

        //Data Berita
        dataBeritaHolder = new ArrayList<>();
        DataModelBerita obj = new DataModelBerita(R.drawable.rectangle2, "NU Peduli Banjir Semarang", " Lorem ipsum dolor sit amet, dururu consectetur adipiscing elit. Non quis mi, et tristique sed", "21 Februari 2021");
        dataBeritaHolder.add(obj);
        DataModelBerita obj1 = new DataModelBerita(R.drawable.rectangle2, "NU Peduli Banjir Semarang", " Lorem ipsum dolor sit amet, dururu consectetur adipiscing elit. Non quis mi, et tristique sed", "21 Februari 2021");
        dataBeritaHolder.add(obj1);

        recyclerView.setAdapter(new AdapterBerita(dataBeritaHolder));

        //Data Kajian
        dataKajianHolder = new ArrayList<>();
        DataModelKajian obj_kajian = new DataModelKajian(R.drawable.kajian);
        dataKajianHolder.add(obj_kajian);
        DataModelKajian obj_kajian2 = new DataModelKajian(R.drawable.kajian2);
        dataKajianHolder.add(obj_kajian2);
        DataModelKajian obj_kajian3 = new DataModelKajian(R.drawable.kajian);
        dataKajianHolder.add(obj_kajian3);


        recyclerViewKajian.setAdapter(new AdapterKajian(dataKajianHolder));

//        Data Kalam
        dataKalamHolder = new ArrayList<>();
        DataModelKalam obj_kalam1 = new DataModelKalam(R.drawable.kalam);
        dataKalamHolder.add(obj_kalam1);
        DataModelKalam obj_kalam2 = new DataModelKalam(R.drawable.kalam);
        dataKalamHolder.add(obj_kalam2);
        DataModelKalam obj_kalam3 = new DataModelKalam(R.drawable.kalam);
        dataKalamHolder.add(obj_kalam3);

        recyclerViewKalam.setAdapter(new AdapterKalam(dataKalamHolder));


        return view;
    }
}