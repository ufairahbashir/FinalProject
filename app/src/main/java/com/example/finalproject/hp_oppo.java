package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hp_oppo extends AppCompatActivity {
ImageView reno7;
ImageView reno7z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp_oppo);
        reno7 = findViewById(R.id.reno7);
        reno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hp_oppo.this,oppo1.class));
            }
        });
        reno7z = findViewById(R.id.reno7z);
        reno7z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hp_oppo.this,oppo2.class));
            }
        });
    }
}