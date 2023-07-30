package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.LatihanKelas;


public class Monokotil extends Buah{
    // Atributr
    String warna;
    int jumlahBiji;

    // Constructor
    public Monokotil(){}
    // Overloading
    public Monokotil(String warna, int jumlahBiji){
        this.warna = warna;
        this.jumlahBiji = jumlahBiji;
    }
    public Monokotil(String nama, int jumlah, String warna, int jumlahBiji){
        super(nama, jumlah);
        this.warna = warna;
        this.jumlahBiji = jumlahBiji;
    }

    // Method
    // Overriding
    public void extraInfo(){
        System.out.println("Warna : " + warna);
        System.out.println("Jumlah Biji : " + jumlahBiji);
    }
}