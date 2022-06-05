package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

import java.util.ArrayList;

public class ReviewAdapter extends FirestoreRecyclerAdapter<Review, ReviewAdapter.ReviewHolder> {

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */

    Context context;
    ArrayList<Review> list;

    public ReviewAdapter(@NonNull FirestoreRecyclerOptions<Review> options, Context context, ArrayList<Review> list) {
        super(options);
        this.context = context;
        this.list = list;
    }

    public ReviewAdapter(@NonNull FirestoreRecyclerOptions<Review> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ReviewHolder holder, int position, @NonNull Review model) {
        holder.UserNama.setText(model.getNama_user());
        holder.UserKomentar.setText(model.getKomentar());
    }

    @NonNull
    @Override
    public ReviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.review_item,
                parent, false);
        return new ReviewHolder(v);
    }

    @Override
    public int getItemCount(){
        return list.size();
    }

    public static class ReviewHolder extends RecyclerView.ViewHolder {
        TextView UserNama;
        TextView UserKomentar;

        public ReviewHolder(View itemView) {
            super(itemView);
            UserNama = itemView.findViewById(R.id.userkomentar);
            UserKomentar = itemView.findViewById(R.id.userreview);
        }
    }
}
