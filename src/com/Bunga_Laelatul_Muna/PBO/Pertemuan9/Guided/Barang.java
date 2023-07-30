package com.Bunga_Laelatul_Muna.PBO.Pertemuan9.Guided;


public class Barang {
    String nama;
    int harga;

    public Barang(){}

    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void ShowInfo(){
        System.out.println("Nama  : " +nama);
        System.out.println("Harga : " +harga);
        System.out.println();
    }
}