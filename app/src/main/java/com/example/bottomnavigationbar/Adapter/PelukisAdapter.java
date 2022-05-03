package com.example.bottomnavigationbar.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigationbar.Data.Pelukis;
import com.example.bottomnavigationbar.R;

import java.util.ArrayList;

public class PelukisAdapter extends RecyclerView.Adapter<PelukisAdapter.GridViewHolder> {

    private ArrayList<Pelukis> listPelukis;

    public PelukisAdapter(ArrayList<Pelukis> list) {
        this.listPelukis = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.list_card, null);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        holder.imgPhoto.setImageResource(listPelukis.get(position).getGambarkarya());
        holder.NamaKarya.setText(listPelukis.get(position).getNamakarya());
        holder.DeksripsiKarya.setText(listPelukis.get(position).getDeskripsikarya());
        holder.NamaPelukis.setText(listPelukis.get(position).getNamapelukis());

    }

    @Override
    public int getItemCount() {
        return listPelukis.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView NamaKarya, DeksripsiKarya, NamaPelukis;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ImgKarya);
            NamaKarya = itemView.findViewById(R.id.NamaKarya);
            DeksripsiKarya = itemView.findViewById(R.id.DeksripsiKarya);
            NamaPelukis = itemView.findViewById(R.id.NamaPelukis);
        }
    }
}

