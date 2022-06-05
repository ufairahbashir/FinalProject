package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static android.content.ContentValues.TAG;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;


public class oppo1 extends AppCompatActivity {

    public EditText nama_user; EditText komentar;
    Button btnReview;
    DatabaseHelper dbHelper = new DatabaseHelper();
    public FirebaseFirestore db = FirebaseFirestore.getInstance();

    String merk = "oppo";
    String model = "reno7";

    CollectionReference reviewCollection = db.collection("handphone").document("merk").collection(merk).document(model).collection("review");
    public ReviewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo1);

        nama_user = findViewById(R.id.username);
        komentar = findViewById(R.id.review);
        btnReview = findViewById(R.id.btnreview);
        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaUser = nama_user.getText().toString();
                String bomentar = komentar.getText().toString();
//                dbHelper.buatReview(merk, model, "Ini nama", "Ini Isi");
                dbHelper.buatReview(merk, model, namaUser, bomentar);
            }
        });
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {

        Query query = reviewCollection;

        FirestoreRecyclerOptions<Review> options = new FirestoreRecyclerOptions.Builder<Review>()
                .setQuery(query, Review.class)
                .build();

        adapter = new ReviewAdapter(options);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}