package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.Guided;

import java.util.Scanner;

public class Mobil extends Kendaraan{
    Scanner input =new Scanner(System.in);
    int jmlPintu;
    String jenisBensin;

    public Mobil(){};
    public Mobil(int jmlPintu, String jenisBensin){
        this.jmlPintu = jmlPintu;
        this.jenisBensin = jenisBensin;
    }

    public Mobil(String nama, int jmlRoda, int jmlPintu, String jenisBensin){
        super(nama, jmlRoda);
        this.jmlPintu = jmlPintu;
        this.jenisBensin = jenisBensin;
    }

    public void Belok(){
        System.out.println("Harap masukan arah: ");
        String Belok = input.nextLine();
        System.out.println("Belok ke " + Belok);
    }

    public void extraInfo(){
        System.out.println("Jumlah Pintu: " + jmlPintu);
        System.out.println("Jenis Bensin: " + jenisBensin);
    }
}
