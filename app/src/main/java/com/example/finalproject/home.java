package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home extends AppCompatActivity {
ImageView gambaroppo;
ImageView gambarvivo;
ImageView selengkapnya;
ImageView laptoplenovo;
ImageView laptopasus;
ImageView selengkapnya1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gambaroppo = findViewById(R.id.gambaroppo);
        gambaroppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,hp_oppo.class));
            }
        });
        gambarvivo = findViewById(R.id.gambarvivo);
        gambarvivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,Vivo.class));
            }
        });
        selengkapnya = findViewById(R.id.selengkapnya);
        selengkapnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,asus.class));
            }
        });
        laptoplenovo = findViewById(R.id.laptoplenovo);
        laptoplenovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,laptop_lenovo.class));
            }
        });
        laptopasus = findViewById(R.id.laptopasus);
        laptopasus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,laptop_asus.class));
            }
        });
        selengkapnya1 = findViewById(R.id.selengkapnya1);
        selengkapnya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,all_laptop.class));
            }
        });
    }
}