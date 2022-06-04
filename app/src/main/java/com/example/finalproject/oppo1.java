package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static android.content.ContentValues.TAG;
import android.widget.TextView;
import android.widget.Toast;

public class oppo1 extends AppCompatActivity {

    public
    EditText nama_user; EditText komentar;
    Button btnReview;
    DatabaseHelper dbHelper = new DatabaseHelper();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo1);

//        view.findViewById(R.id.username);
        nama_user = findViewById(R.id.username);
        komentar = findViewById(R.id.review);

        String merk = "oppo";
        String model = "reno7";



        btnReview = findViewById(R.id.btnreview);
        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaUser = nama_user.getText().toString();
                String bomentar = komentar.getText().toString();
//                dbHelper.buatReview(merk, model, "Ini nama", "Ini Isi");
                dbHelper.buatReview(merk, model, namaUser, bomentar);
                Log.i(TAG, "Isi String namaUser = " + namaUser);
                Log.i(TAG, "Isi String Komentar = " + bomentar);

                if(namaUser == "" || bomentar == "") {
                    Toast.makeText(getApplicationContext(), "Isinya kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}