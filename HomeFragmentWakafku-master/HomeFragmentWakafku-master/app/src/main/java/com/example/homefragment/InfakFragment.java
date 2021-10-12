package com.example.homefragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InfakFragment extends Fragment {
    public static InfakFragment getInstance() {
        InfakFragment infakFragment = new InfakFragment();
        return infakFragment;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_infak,container, false);
//        spinner infak
//        String [] values =
//                {"Pilih Jenis Infak",
//                        "Berbagi Berkah",
//                        "Berbagi Rezeki",
//                        };
//        Spinner spinner = (Spinner) view.findViewById(R.id.spinner_infak);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
//        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//
//        spinner.setAdapter(adapter);
        return view;
    }
}
