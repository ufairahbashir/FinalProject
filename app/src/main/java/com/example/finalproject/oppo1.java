package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class oppo1 extends AppCompatActivity {

    public
    EditText nama_user; EditText komentar;
    Button btnReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo1);

        nama_user = findViewById(R.id.username);
        nama_user.setOnClickListener(new View.OnClickListener() {

        });

        komentar = findViewById(R.id.review);
        komentar.setOnClickListener(new View.OnClickListener() {

        });

        btnReview = findViewById(R.id.btnreview);
        btnReview.setOnClickListener(new View.OnClickListener() {

        });
    }
}