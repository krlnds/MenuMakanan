package com.karlina.menumakanan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvNama;
    TextView tvDesc;
    TextView tvHarga;
    ImageView tvGambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.txt_nama_makanan);
        tvDesc = findViewById(R.id.txt_desc_makanan);
        tvHarga = findViewById(R.id.txt_harga_makanan);
        tvGambar = findViewById(R.id.iv_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String namaMakanan = getIntent().getStringExtra("nama_makanan");
        String descMakanan = getIntent().getStringExtra("desc_makanan");
        int hargaMakanan = getIntent().getIntExtra("harga_makanan",0);
        tvNama.setText(namaMakanan);
        tvDesc.setText(descMakanan);
        tvHarga.setText("Rp. "+hargaMakanan);
        tvGambar.setImageResource(getIntent().getIntExtra("gambar_makanan",0));





    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }




}