package com.Bunga_Laelatul_Muna.PBO.Pertemuan9.Unguided;

public class DataMahasiswa_21102010 {
    String nama_21102010;
    String nim_21102010;

    public DataMahasiswa_21102010(){}
    public DataMahasiswa_21102010(String nama, String nim){
        this.nama_21102010 = nama;
        this.nim_21102010 = nim;
    }
    public void ShowInfo(){
        System.out.println("Nama  : " +nama_21102010);
        System.out.println("Harga : " +nim_21102010);
        System.out.println();
    }
}