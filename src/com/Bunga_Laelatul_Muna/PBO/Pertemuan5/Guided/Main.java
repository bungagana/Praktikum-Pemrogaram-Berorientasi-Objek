package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.Guided;

public class Main {
    public static void main(String[] args) {
        Mobil mb = new Mobil();

        mb.nama = "Lamborghini";
        mb.jmlRoda = 4;
        mb.jmlPintu = 7 ;
        mb.jenisBensin= "Avtur";

        mb.Belok();
        mb.ShowInfo();
    }
}
