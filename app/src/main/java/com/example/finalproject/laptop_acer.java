package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class laptop_acer extends AppCompatActivity {
    private
    ImageView acerspin3;
    ImageView acerspin5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_acer);

        acerspin3 = findViewById(R.id.logo_acerspin3);
        acerspin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laptop_acer.this,desk_acer_spin_3.class));
            }
        });

        acerspin5 = findViewById(R.id.logo_acerspin5);
        acerspin5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laptop_acer.this,desk_acer_spin5.class));
            }
        });
    }
}