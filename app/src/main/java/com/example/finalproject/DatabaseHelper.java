package com.example.finalproject;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DatabaseHelper {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public void buatReview(String merk, String model, String nama_user, String review) {
        CollectionReference colRef = db.collection("handphone").document("merk").collection(merk).document(model).collection("review");

        Map<String, Object> komen = new HashMap<>();
        komen.put("nama_user", nama_user);
        komen.put("komentar", review);

        colRef.add(komen)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }
}
