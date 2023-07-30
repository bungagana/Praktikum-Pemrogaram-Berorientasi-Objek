package com.Bunga_Laelatul_Muna.PBO.RELASIKELAS_21102010.KOMPOSISI_21102010;

import java.util.Scanner;

public class Main_2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul Tugas Besar 1: ");
        String judulTB1_2010 = scanner.nextLine();
        System.out.print("Masukkan jumlah anggota Tugas Besar 1: ");
        int jumlahAnggotaTB1_2010 = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        // Membuat objek TugasBesar 1
        TugasBesar_2010 tb1 = new TugasBesar_2010(judulTB1_2010, jumlahAnggotaTB1_2010);


        System.out.print("Masukkan judul Tugas Besar 2: ");
        String judulTB2_2010 = scanner.nextLine();
        System.out.print("Masukkan jumlah anggota Tugas Besar 2: ");
        int jumlahAnggotaTB2_2010 = scanner.nextInt();
        scanner.nextLine();

        // Membuat objek TugasBesar 2
        TugasBesar_2010 tb2 = new TugasBesar_2010(judulTB2_2010, jumlahAnggotaTB2_2010);

        System.out.print("Masukkan nilai Tugas Besar 1: ");
        int nilaiTB1_2010 = scanner.nextInt();
        tb1.setNilai(nilaiTB1_2010);
        System.out.print("Masukkan nilai Tugas Besar 2: ");
        int nilaiTB2_2010 = scanner.nextInt();
        tb2.setNilai(nilaiTB2_2010);

        // ==== Menambahkan anggota mahasiswa ke tugas besar =====
        for (int i = 0; i < tb1.getAnggota().length; i++) {
            System.out.print("Masukkan nama anggota Tugas Besar 1 ke-" + (i + 1) + ": ");
            String namaAnggota_2010 = scanner.nextLine();
            System.out.print("Masukkan NPM anggota Tugas Besar 1 ke-" + (i + 1) + ": ");
            String npmAnggota_2010 = scanner.nextLine();
            System.out.print("Masukkan angkatan anggota Tugas Besar 1 ke-" + (i + 1) + ": ");
            String angkatanAnggota_2010 = scanner.nextLine();
            tb1.getAnggota()[i] = new Mahasiswa_2010(namaAnggota_2010, npmAnggota_2010, angkatanAnggota_2010);
        }

        for (int i = 0; i < tb2.getAnggota().length; i++) {
            System.out.print("Masukkan nama anggota Tugas Besar 2 ke-" + (i + 1) + ": ");
            String namaAnggota_2010 = scanner.nextLine();
            System.out.print("Masukkan NPM anggota Tugas Besar 2 ke-" + (i + 1) + ": ");
            String npmAnggota_2010 = scanner.nextLine();
            System.out.print("Masukkan angkatan anggota Tugas Besar 2 ke-" + (i + 1) + ": ");
            String angkatanAnggota_2010 = scanner.nextLine();
            tb2.getAnggota()[i] = new Mahasiswa_2010(namaAnggota_2010, npmAnggota_2010, angkatanAnggota_2010);
        }

        // ======= SHOW DETAIL TUGAS BESAR ======
        System.out.println("Tugas Besar 1:");
        System.out.println("Judul Tugas: " + tb1.getJudul());
        System.out.println("Nilai: " + tb1.getNilai());
        System.out.println("Jumlah Anggota: " + tb1.getAnggota().length);

        System.out.println("Tugas Besar 2:");
        System.out.println("Judul Tugas: " + tb2.getJudul());
        System.out.println("Nilai: " + tb2.getNilai());
        System.out.println("Jumlah Anggota: " + tb2.getAnggota().length);
    }
}