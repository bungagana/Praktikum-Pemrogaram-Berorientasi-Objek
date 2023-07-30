package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.Guided;

public class Kendaraan {
    //Atribut
    String nama;
    int jmlRoda;

    //Constructor
    public Kendaraan(){}
    public Kendaraan(String nama, int jmlRoda){
        this.nama = nama;
        this.jmlRoda = jmlRoda;
    }

    //Methode
    public void ShowInfo(){
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Jumlah Roda: "+ jmlRoda);

        extraInfo();
    }

    public void  extraInfo(){};
}
