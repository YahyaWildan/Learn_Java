package com.example.homefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KajianFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KajianFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    RecyclerView recyclerViewKajianNew;
    RecyclerView recyclerViewKajianRecommendation;
    RecyclerView recyclerViewKajianFavorite;
    RecyclerView recyclerViewKajianMenuSejarah;

    ArrayList<DataModelFragmentKajianNew> dataModelFragmentKajianNews;
    ArrayList<DataModelFragmentKajianRecommendation> dataModelFragmentKajianRecommendation;
    ArrayList<DataModelFragmentKajianFavorite> dataModelFragmentKajianFavorites;
    ArrayList<DataModelFragmentKajianMenuSejarah> dataModelFragmentKajianMenuSejarah;

    LinearLayoutManager linearLayoutKajianNew, linearLayoutKajianRecommendation,
            linearLayoutKajianfavorite, linearLayoutManagerKajianMenuSejarah;



    public KajianFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment KajianFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static KajianFragment newInstance(String param1, String param2) {
        KajianFragment fragment = new KajianFragment();
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
        View view =  inflater.inflate(R.layout.fragment_kajian, container, false);
        recyclerViewKajianNew = view.findViewById(R.id.kajian_container_news);
        recyclerViewKajianRecommendation = view.findViewById(R.id.kajian_container_recommendation);
        recyclerViewKajianFavorite = view.findViewById(R.id.kajian_container_favorite);
        recyclerViewKajianMenuSejarah = view.findViewById(R.id.kajian_container_navbar_sejarah);

        linearLayoutKajianNew = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        linearLayoutKajianRecommendation = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        linearLayoutKajianfavorite= new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManagerKajianMenuSejarah= new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerViewKajianNew.setLayoutManager(linearLayoutKajianNew);
        recyclerViewKajianRecommendation.setLayoutManager(linearLayoutKajianRecommendation);
        recyclerViewKajianFavorite.setLayoutManager(linearLayoutKajianfavorite);
        recyclerViewKajianMenuSejarah.setLayoutManager(linearLayoutManagerKajianMenuSejarah);

        dataModelFragmentKajianNews = new ArrayList<>();
        DataModelFragmentKajianNew dataKajianNews1 = new DataModelFragmentKajianNew(R.drawable.kajian, "Peringatan Hari Sa...", "NU Channel" );
        dataModelFragmentKajianNews.add(dataKajianNews1);
        DataModelFragmentKajianNew dataKajianNews2 = new DataModelFragmentKajianNew(R.drawable.kajian2, "Peringatan Hari Sa...", "NU Channel" );
        dataModelFragmentKajianNews.add(dataKajianNews2);
        DataModelFragmentKajianNew dataKajiannews3 = new DataModelFragmentKajianNew(R.drawable.kajian, "Peringatan Hari Sa...", "NU Channel" );
        dataModelFragmentKajianNews.add(dataKajiannews3);

        recyclerViewKajianNew.setAdapter(new AdapterFragmentKajianNew(dataModelFragmentKajianNews));


        dataModelFragmentKajianRecommendation = new ArrayList<>();
        DataModelFragmentKajianRecommendation dataKajianRecommendation1 = new DataModelFragmentKajianRecommendation(R.drawable.kajian2, "Peringatan Hari Sa...", "NU Channel");
        dataModelFragmentKajianRecommendation.add(dataKajianRecommendation1);
        DataModelFragmentKajianRecommendation dataKajianRecommendation2 = new DataModelFragmentKajianRecommendation(R.drawable.kajian, "Peringatan Hari Sa...", "NU Channel");
        dataModelFragmentKajianRecommendation.add(dataKajianRecommendation2);
        DataModelFragmentKajianRecommendation dataKajianRecommendation3 = new DataModelFragmentKajianRecommendation(R.drawable.kajian2, "Peringatan Hari Sa...", "NU Channel");
        dataModelFragmentKajianRecommendation.add(dataKajianRecommendation3);

        recyclerViewKajianRecommendation.setAdapter(new AdapterFragmentKajianRecommendation(dataModelFragmentKajianRecommendation));

        dataModelFragmentKajianFavorites = new ArrayList<>();
        DataModelFragmentKajianFavorite dataKajianFavorite1 = new DataModelFragmentKajianFavorite(R.drawable.kajian, "Peringatan Hari Sa...", "NU Channel");
        dataModelFragmentKajianFavorites.add(dataKajianFavorite1);
        DataModelFragmentKajianFavorite dataKajianFavorite2 = new DataModelFragmentKajianFavorite(R.drawable.kajian2, "Peringatan Hari Sa...", "NU Channel");
        dataModelFragmentKajianFavorites.add(dataKajianFavorite2);
        DataModelFragmentKajianFavorite dataKajianFavorite3 = new DataModelFragmentKajianFavorite(R.drawable.kajian, "Peringatan Hari Sa...", "NU Channel");
        dataModelFragmentKajianFavorites.add(dataKajianFavorite3);

        recyclerViewKajianFavorite.setAdapter(new AdapterFragmentKajianFavorite(dataModelFragmentKajianFavorites));

        dataModelFragmentKajianMenuSejarah = new ArrayList<>();
        DataModelFragmentKajianMenuSejarah dataKajianMenuSejarah1 = new DataModelFragmentKajianMenuSejarah(R.drawable.gusmuwafiq,
                "Gus Muwafiq : Ngaji Ilmu Tasawuf", "Gus Muwafiq Channel");
        dataModelFragmentKajianMenuSejarah.add(dataKajianMenuSejarah1);
        DataModelFragmentKajianMenuSejarah dataKajianMenuSejarah2 = new DataModelFragmentKajianMenuSejarah(R.drawable.gusmuwafiq,
                "Gus Muwafiq :Sanad Sebagai Praktik Praktik Keilmuan ...", "Gus Muwafiq Channel");
        dataModelFragmentKajianMenuSejarah.add(dataKajianMenuSejarah2);
        DataModelFragmentKajianMenuSejarah dataKajianMenuSejarah3 = new DataModelFragmentKajianMenuSejarah(R.drawable.gusmuwafiq,
                "Gus Muwafiq : Ngaji Ilmu Tasawuf", "Gus Muwafiq Channel");
        dataModelFragmentKajianMenuSejarah.add(dataKajianMenuSejarah3);

        recyclerViewKajianMenuSejarah.setAdapter(new AdapterFragmentKajianMenuSejarah(dataModelFragmentKajianMenuSejarah));


        return view;
    }
}