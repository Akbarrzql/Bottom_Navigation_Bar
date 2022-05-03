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

public class PelukisAdapterCard extends RecyclerView.Adapter<PelukisAdapterCard.CardViewHolder> {

    private ArrayList<Pelukis> listPelukis;

    public PelukisAdapterCard(ArrayList<Pelukis> list) {
        this.listPelukis = list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.list_card_home, null);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.imgPelukis.setImageResource(listPelukis.get(position).getGambarkarya());
        holder.namaKarya.setText(listPelukis.get(position).getNamakarya());
        holder.namaPelukis.setText(listPelukis.get(position).getNamapelukis());
    }

    @Override
    public int getItemCount() {
        return listPelukis.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPelukis;
        TextView namaKarya, namaPelukis;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPelukis = itemView.findViewById(R.id.ImgKarya1);
            namaKarya = itemView.findViewById(R.id.NamaKarya1);
            namaPelukis = itemView.findViewById(R.id.NamaPelukis1);
        }
    }
}
