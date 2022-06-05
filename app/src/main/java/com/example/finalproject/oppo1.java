package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class oppo1 extends AppCompatActivity {
    //for upload data to database
    public EditText nama_user; EditText komentar;
    Button btnReview;
    DatabaseHelper dbHelper = new DatabaseHelper();
    public FirebaseFirestore db = FirebaseFirestore.getInstance();

    //for import data from database, i wish its going well
    //its not going well after 6 hours, but i do hope and optimize its gonna be well
    //hey, aku menyerah. fitur tampilkan review tidak bisa diadakan. sedih but its okay, we did our best
    RecyclerView recyclerView;
    MyAdapter myAdapter;
    ArrayList<Review> list;
    ProgressDialog progressDialog;


    String merk = "oppo";
    String model = "reno7";

    CollectionReference reviewCollection = db.collection("handphone").document("merk").collection(merk).document(model).collection("review");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppo1);

        //for insert to db
        nama_user = findViewById(R.id.username);
        komentar = findViewById(R.id.review);
        btnReview = findViewById(R.id.btnreview);

//        //i dunno what is this
//        ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setCancelable(false);
//        progressDialog.setMessage("Fetching data...");
//        progressDialog.show();

//        //db to app
//        recyclerView = findViewById(R.id.recycleview);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        //db sudah ada di atas
//        list = new ArrayList<Review>();
//        myAdapter = new MyAdapter(oppo1.this,list);
//        recyclerView.setAdapter(myAdapter);
//
//        EventChangeListener();


        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaUser = nama_user.getText().toString();
                String bomentar = komentar.getText().toString();
//                dbHelper.buatReview(merk, model, "Ini nama", "Ini Isi");
                dbHelper.buatReview(merk, model, namaUser, bomentar);
            }
        });
    }

//    private void EventChangeListener(){
//        db.collection("users")
//                .addSnapshotListener(new EventListener<QuerySnapshot>() {
//                    @Override
//                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
//                        if (error != null){
//                            if(progressDialog.isShowing()){
//                                progressDialog.dismiss();
//                            }
//                            Log.e("Firestore error", error.getMessage());
//                            return;
//                        }
//                        myAdapter.notifyDataSetChanged();
//                        if(progressDialog.isShowing()){
//                            progressDialog.dismiss();
//                        }
//                    }
//                });
//    }
}