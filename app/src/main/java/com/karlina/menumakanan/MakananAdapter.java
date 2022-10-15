package com.karlina.menumakanan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {

    private ArrayList<Makanan> datalist;


    public MakananAdapter(ArrayList<Makanan> datalist){
        this.datalist = datalist;
    }


    @NonNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from((parent.getContext()));
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new MakananAdapter.MakananViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MakananViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txt_nama_makanan.setText(datalist.get(position).getNama());
//      holder.txt_desc_makanan.setText(datalist.get(position).getDesc());
        holder.txt_harga_makanan.setText("Rp. " + datalist.get(position).getHarga());
        holder.iv_menu.setImageResource(datalist.get(position).getGambar());
        holder.cv_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),DetailActivity.class);
                myIntent.putExtra("nama_makanan", datalist.get(position).getNama());
                myIntent.putExtra("desc_makanan", datalist.get(position).getDesc());
                myIntent.putExtra("harga_makanan", datalist.get(position).getHarga());
                myIntent.putExtra("gambar_makanan", datalist.get(position).getGambar());
                view.getContext().startActivity(myIntent);

            }
        });


    }

    @Override

    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }


    public class MakananViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_nama_makanan, txt_desc_makanan, txt_harga_makanan;

        private ImageView iv_menu;

        private CardView cv_item;

        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nama_makanan = itemView.findViewById(R.id.txt_nama_makanan);
//          txt_desc_makanan = itemView.findViewById(R.id.txt_desc_makanan);
            txt_harga_makanan = itemView.findViewById(R.id.txt_harga_makanan);
            iv_menu = itemView.findViewById(R.id.iv_menu);
            cv_item = itemView.findViewById(R.id.cv_item);
        }
    }

}
;;