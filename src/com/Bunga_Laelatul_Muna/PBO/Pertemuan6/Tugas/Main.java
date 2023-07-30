//Bunga Laelatul Muna
//21102010
package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Tugas;
public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("21102010", "Bunga Laelatul Muna");
        Mahasiswa mhs2 = new Mahasiswa("21102011", "Madu Sahara");

        // Membuat objek jurusan dengan asosiasi ke mahasiswa
        Mahasiswa[] mahasiswas = {mhs1, mhs2};
        Jurusan jurusan = new Jurusan("Teknik Informatika", mahasiswas);

        // Menampilkan informasi mahasiswa dalam jurusan
        System.out.println("Jurusan: " + jurusan.getNama());
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : jurusan.getMahasiswas()) {
            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
        }
    }
}