package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vivo extends AppCompatActivity {
ImageView vivoy12;
ImageView vivov20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivo);
        vivoy12 = findViewById(R.id.vivoy12);
        vivoy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vivo.this, vivoy12.class));
            }
        });
        vivov20 = findViewById(R.id.vivov20);
        vivov20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vivo.this, vivov20.class));
            }
        });
    }
}