package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class all_phone extends AppCompatActivity {
ImageView oppohp;
ImageView vivohp;
ImageView asushp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_phone);
        oppohp = findViewById(R.id.oppohp);
        oppohp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(all_phone.this,hp_oppo.class));
            }
        });
        vivohp = findViewById(R.id.vivohp);
        vivohp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(all_phone.this,Vivo.class));
            }
        });
        asushp = findViewById(R.id.asushp);
        asushp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(all_phone.this,asus.class));
            }
        });
    }
}