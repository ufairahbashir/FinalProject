package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class laptop_lenovo extends AppCompatActivity {

    private ImageView legioni5; ImageView thinkpade14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_lenovo);


        legioni5 = findViewById(R.id.lenovo_legion_51_pro);
        legioni5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laptop_lenovo.this,desk_lenovo_legioni5.class));
            }
        });

        thinkpade14 = findViewById(R.id.lenovo_thinkpad_e14);
        thinkpade14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laptop_lenovo.this,desk_lenovo_tpe14.class));
            }
        });
    }
}