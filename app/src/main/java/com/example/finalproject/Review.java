package com.example.finalproject;

public class Review {
    String komentar;
    String nama_user;

    public Review () {

    }

    public Review(String komentar, String nama_user) {
        this.komentar = komentar;
        this.nama_user = nama_user;
    }

    public String getKomentar() {
        return komentar;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }
}