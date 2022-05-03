package com.example.bottomnavigationbar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bottomnavigationbar.Adapter.PelukisAdapterCard;
import com.example.bottomnavigationbar.Data.Pelukis;
import com.example.bottomnavigationbar.Data.PelukisData;

import java.util.ArrayList;

public class ThreeFragment extends Fragment {

    private RecyclerView rvKarya;
    private ArrayList<Pelukis> list = new ArrayList<>();
    SearchView searchView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        searchView = view.findViewById(R.id.searchView);

        rvKarya = view.findViewById(R.id.rvKarya);
        rvKarya.setHasFixedSize(true);


        list.addAll(PelukisData.getListData());
        showRecyclerList();

        searchView.setQueryHint("Cari Karya Seni");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                newText = newText.toLowerCase();
                ArrayList<Pelukis> newList = new ArrayList<>();
                for (Pelukis pelukis : list) {
                    String namaKarya = pelukis.getNamakarya().toLowerCase();
                    if (namaKarya.contains(newText)) {
                        newList.add(pelukis);
                    }
                }
                PelukisAdapterCard pelukisAdapterCard = new PelukisAdapterCard(newList);
                return false;
            }
        });

//        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
//            @Override
//            public boolean onClose() {
//                showRecyclerList();
//                return false;
//            }
//        });


        int spanCount = 1; // 1 columns
        int spacing = 20; // 50px
        boolean includeEdge = true;
        rvKarya.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
    }



//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
//        inflater.inflate(R.menu.menu_search, menu);
//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView searchView  = new SearchView(getActivity());
//        searchView.setQueryHint("Cari Karya Seni");
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                newText = newText.toLowerCase();
//                ArrayList<Pelukis> newList = new ArrayList<>();
//                for (Pelukis pelukis : list) {
//                    String namaKarya = pelukis.getNamakarya().toLowerCase();
//                    if (namaKarya.contains(newText)) {
//                        newList.add(pelukis);
//                    }
//                }
//                rvKarya.setLayoutManager(new LinearLayoutManager(getActivity()));
//                PelukisAdapterCard pelukisAdapterCard = new PelukisAdapterCard(newList);
//                rvKarya.setAdapter(pelukisAdapterCard);
//                return true;
//            }
//
//        });
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        setMode(item.getItemId());
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void setMode(int selectedMode) {
//        switch (selectedMode) {
//            case R.id.action_search:
//                break;
//        }
//    }

    private void showRecyclerList() {
        rvKarya.setLayoutManager(new LinearLayoutManager(getActivity()));
        PelukisAdapterCard pelukisAdapterCard = new PelukisAdapterCard(list);
        rvKarya.setAdapter(pelukisAdapterCard);
    }
}