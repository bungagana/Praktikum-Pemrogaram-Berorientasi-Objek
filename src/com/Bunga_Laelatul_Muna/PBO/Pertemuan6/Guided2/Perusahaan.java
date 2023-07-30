package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guided2;

class Perusahaan {
    private String namaper;
    private  Pegawai peg[]; //Agregasi antara pegawai dan perusahaan
    private int counter;

    public Perusahaan (String namaper)
    {
        this.namaper = namaper;
        counter = 0;
        peg = new Pegawai[3];
        System.out.println("Konstruktor perusahaan dijalankan");

    }
    //Relasi agresasi antara pegawai dan perusahaan
    public void insertPegawai (Pegawai p)
    {
        peg[counter] = p;
        counter++;
    } public void tampilPer()
    {
        System.out.println("Perusahaan " + namaper + " memiliki pegawai : " ) ;
        for (int i=0; i<counter; i++)
        {
            peg[i].tampilpeg();
        }
    }

}
