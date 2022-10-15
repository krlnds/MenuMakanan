package com.karlina.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    private MakananAdapter adaptermakanan;
    private ArrayList<Makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        adaptermakanan = new MakananAdapter(makananArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adaptermakanan);
    }

    void addData() {

        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan("Ikan Gurame bakar", "Grilled fresh-water carp fish", 75000, R.drawable.ikanbakar1));
        makananArrayList.add(new Makanan("Ikan Nila Goreng Siram Saus", "Fried fresh-water Tilapia fish served with tangy sweet and sour sauce", 65000, R.drawable.ikanbakar2));
        makananArrayList.add(new Makanan("Ikan Kerapu Goreng", "Fried fres-hwater grouper", 95000, R.drawable.ikanbakar3));
        makananArrayList.add(new Makanan("Ikan Nila Acar", "Cooked fish with vegetables", 105000, R.drawable.ikanbakar4));
        makananArrayList.add(new Makanan("Ikan Nila Goreng", "Deep fried fresh-water tilapia fish", 125000, R.drawable.ikanbakar5));
        makananArrayList.add(new Makanan("Kepiting Saus Thailand", "Fresh crab drizzled with delicious Thai sauce ", 150000, R.drawable.kepiting));
        makananArrayList.add(new Makanan("Udang Saus asam Manis", "Fresh prawns drizzled with sweet and sour sauce", 55000, R.drawable.udang));
        makananArrayList.add(new Makanan("Tumis Kangkung", "saute water spinach ", 35000, R.drawable.kangkung));
        makananArrayList.add(new Makanan("Jus Jeruk", "Orange Juice ", 28000, R.drawable.jeruk));
        makananArrayList.add(new Makanan("Jus Semangka", "Watermelon Juice ", 26000, R.drawable.semangka));
        makananArrayList.add(new Makanan("Jus Strawberry", "Strawberry Juice ", 24000, R.drawable.stawberry));
        makananArrayList.add(new Makanan("Es Teh", "Ice Tea ", 15000, R.drawable.esteh));
        makananArrayList.add(new Makanan("Air Mineral", "Ice Water ", 10000, R.drawable.airputih));


    }

}