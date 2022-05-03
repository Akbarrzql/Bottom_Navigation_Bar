package com.example.bottomnavigationbar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigationbar.Adapter.PelukisAdapter;
import com.example.bottomnavigationbar.Data.Pelukis;
import com.example.bottomnavigationbar.Data.PelukisData;

import java.util.ArrayList;


public class fourFragment extends Fragment {

    private RecyclerView rvKarya;
    private ArrayList<Pelukis> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvKarya = view.findViewById(R.id.recyclerView);
        rvKarya.setHasFixedSize(true);


        rvKarya = view.findViewById(R.id.recyclerView);
        rvKarya.setHasFixedSize(true);

        list.addAll(PelukisData.getListData());
        showRecyclerGrid();

        int spanCount = 2; // 2 columns
        int spacing = 20; // 50px
        boolean includeEdge = true;
        rvKarya.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
    }

    private void showRecyclerGrid() {
        rvKarya.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        PelukisAdapter pelukisAdapter = new PelukisAdapter(list);
        rvKarya.setAdapter(pelukisAdapter);
    }
}