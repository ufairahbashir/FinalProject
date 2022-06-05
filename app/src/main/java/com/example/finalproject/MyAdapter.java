package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import io.reactivex.rxjava3.annotations.NonNull;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    ArrayList<Review> list;

    public MyAdapter (Context context, ArrayList<Review> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.review_item,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull MyViewHolder holder, int position) {
        Review review = list.get(position);
        holder.UserNama.setText(review.getNama_user());
        holder.UserKomentar.setText(review.getKomentar());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView UserNama, UserKomentar;
        public MyViewHolder (@NonNull View itemView){
            super(itemView);
            UserNama = itemView.findViewById(R.id.userkomentar);
            UserKomentar = itemView.findViewById(R.id.userreview);
        }
    }
}
