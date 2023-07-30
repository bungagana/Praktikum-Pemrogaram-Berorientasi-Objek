package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.LatihanKelas;

public class Buah {
    // Atribut
    String nama;
    int jumlah;

    // Constructor
    public Buah(){}
    public Buah(String nama, int jumlah){
        this.nama = nama;
        this.jumlah = jumlah;
    }

    // Method
    public void showInfo(){
        System.out.println("Nama buah : " + nama);
        System.out.println("Jumlah : " + jumlah);

        extraInfo();
    }

    public void extraInfo(){}
}