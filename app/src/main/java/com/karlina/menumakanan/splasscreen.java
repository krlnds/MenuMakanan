package com.karlina.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splasscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent ccc = new Intent(splasscreen.this, MainActivity.class);
                startActivity(ccc);


            }
        },3000);
    }
}