package com.example.bottomnavigationbar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavigationbar.Adapter.Staggeredadapter;
import com.example.bottomnavigationbar.Data.Pelukis;
import com.example.bottomnavigationbar.Data.PelukisData;

import java.util.ArrayList;

public class TwoFragment extends Fragment {

    RecyclerView recyclerView;
    private ArrayList<Pelukis> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerViewstragger);
        recyclerView.setHasFixedSize(true);

        recyclerView = view.findViewById(R.id.recyclerViewstragger);
        recyclerView.setHasFixedSize(true);

        list.addAll(PelukisData.getListData());
        showStragger();

        int spanCount = 2; // 2 columns
        int spacing = 20; // 50px
        boolean includeEdge = true;
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));

        super.onViewCreated(view, savedInstanceState);
    }

    private void showStragger() {
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        Staggeredadapter staggeredadapter = new Staggeredadapter(list);
        recyclerView.setAdapter(staggeredadapter);
    }
}