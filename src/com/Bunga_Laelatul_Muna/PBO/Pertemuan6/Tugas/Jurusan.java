//Bunga Laelatul Muna
//21102010
package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Tugas;
class Jurusan {
    private String nama;
    private Mahasiswa[] mahasiswas;

    public Jurusan(String nama, Mahasiswa[] mahasiswas) {
        this.nama = nama;
        this.mahasiswas = mahasiswas;
    }

    public String getNama() {
        return nama;
    }

    public Mahasiswa[] getMahasiswas() {
        return mahasiswas;
    }
}