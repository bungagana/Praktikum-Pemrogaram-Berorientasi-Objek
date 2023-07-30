package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guided2;

public class Relasi {
    public static void main(String[] args) {
        Perusahaan Per = new Perusahaan("Nusantara Jaya");
        Pegawai Peg1, Peg2, Peg3;
        Peg1 = new Pegawai("P001", "Rudi");
        Peg2 = new Pegawai("P002", "Agus");
        Peg3 = new Pegawai("P003", "Andi");

        //Relasi antara class peg dan per

        Per.insertPegawai(Peg1);
        Per.insertPegawai(Peg2);
        Per.insertPegawai(Peg3);
        System.out.println();
        Per.tampilPer();
    }
}
