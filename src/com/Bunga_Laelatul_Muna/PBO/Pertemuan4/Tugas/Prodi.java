
//Bunga Laelatul Muna
// 21102010
package com.Bunga_Laelatul_Muna.PBO.Pertemuan4.Tugas;

public class Prodi  extends  FIF{
    private String namaProdi;
    private int jumlahMahasiswa;

    public Prodi(String namaFakultas, String namaDekan, String namaProdi, int jumlahMahasiswa) {
        Fakultas(namaFakultas, namaDekan);
        this.namaProdi = namaProdi;
        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    public void infoProdi() {
        System.out.println("Program Studi " + namaProdi);
        System.out.println("Jumlah Mahasiswa " + jumlahMahasiswa);
    }
}
