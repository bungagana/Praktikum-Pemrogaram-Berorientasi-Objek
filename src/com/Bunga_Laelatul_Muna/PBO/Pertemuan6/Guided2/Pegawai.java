package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guided2;

class Pegawai {
    private String nama;
    private  String NIP;
    public Pegawai()
    {
        System.out.println("Konstruktor pegaia dijalankan...");
    }
    public Pegawai (String NIP, String nama)
    {
        this.NIP = NIP;
        this.nama = nama;
        System.out.println("Konstruktor pegawai dijalankan....");
    }
    public void tampilpeg(){
        System.out.println("NIP: " + NIP + " , Nama : " + nama);
    }
}
