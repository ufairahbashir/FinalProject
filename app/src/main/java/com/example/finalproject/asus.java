package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class asus extends AppCompatActivity {
    ImageView zenfone;
    ImageView rog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);
        zenfone = findViewById(R.id.zenfone);
        zenfone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(asus.this,zenfone5s.class));
            }
        });
        rog = findViewById(R.id.rog);
        rog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(asus.this,rog5s.class));
            }
        });
    }
}