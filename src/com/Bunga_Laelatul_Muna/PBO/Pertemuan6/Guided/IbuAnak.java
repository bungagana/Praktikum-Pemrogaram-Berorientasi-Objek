package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guided;
public class IbuAnak {
    public static void main(String[] args) {
        Manusia ibu1 = new Manusia("Budi", 30);
        Manusia anak1 = new Manusia("Ani", 4);
        Manusia ibu2 = new Manusia("Diana", 40);
        Manusia anak2 = new Manusia("Andi", 5, ibu2);

        //Relasi Antara manusia dengan manusia
        System.out.println("===================\n");
        ibu1.cetak();
        anak1.cetak();
        System.out.println("====================\n");
        ibu1.adopsi(anak1);
        ibu1.cetak();
        anak1.cetak();
        System.out.println("=======================\n");
        ibu2.cetak();
        anak2.cetak();

    }
}
