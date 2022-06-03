package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class all_laptop extends AppCompatActivity {
ImageView lenovoo;
ImageView asuss;
ImageView acerr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_laptop);
        lenovoo = findViewById(R.id.lenovoo);
        lenovoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(all_laptop.this,laptop_lenovo.class));
            }
        });
        asuss = findViewById(R.id.asuss);
        asuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(all_laptop.this,laptop_asus.class));
            }
        });
        acerr = findViewById(R.id.acerr);
        acerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(all_laptop.this,laptop_acer.class));
            }
        });
    }
}