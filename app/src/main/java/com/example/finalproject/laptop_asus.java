package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class laptop_asus extends AppCompatActivity {

    private ImageView asus_zenbook_13; ImageView asus_zenbook_14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_asus);

        asus_zenbook_13 = findViewById(R.id.zenbook_13_flip);
        asus_zenbook_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laptop_asus.this,desk_asus_z13flip.class));
            }
        });

        asus_zenbook_14 = findViewById(R.id.zenbook_14_flip);
        asus_zenbook_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laptop_asus.this,desk_asus_z14flip.class));
            }
        });
    }
}