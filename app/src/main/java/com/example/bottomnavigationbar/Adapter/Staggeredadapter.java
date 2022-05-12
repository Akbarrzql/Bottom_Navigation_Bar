package com.example.bottomnavigationbar.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigationbar.Data.Pelukis;
import com.example.bottomnavigationbar.R;

import java.util.ArrayList;

public class Staggeredadapter extends RecyclerView.Adapter<Staggeredadapter.ViewHolder> {

    private ArrayList<Pelukis> listGambar;

    public Staggeredadapter(ArrayList<Pelukis> listGambar){
        this.listGambar = listGambar;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.staggered_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.img.setImageResource(listGambar.get(position).getGambarkarya());
    }

    @Override
    public int getItemCount() {
        return listGambar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView);
        }
    }
}

