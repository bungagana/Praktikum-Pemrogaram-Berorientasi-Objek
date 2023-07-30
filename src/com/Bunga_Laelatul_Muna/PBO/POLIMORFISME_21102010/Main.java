package com.Bunga_Laelatul_Muna.PBO.POLIMORFISME_21102010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Data Asisten Praktikum
        System.out.print("Jumlah Data Asisten Praktikum :");
        int jumlahAsisten = input.nextInt();
        AsistemPraktikum_2010[] asistenArray = new AsistemPraktikum_2010[jumlahAsisten];
        for (int i = 0; i < jumlahAsisten; i++) {
            System.out.println("[Input Data Asisten Praktikum Ke - " + (i + 1) + "]");
            System.out.print("NIM : ");
            String nim = input.next();
            System.out.print("Nama : ");
            String nama = input.next();
            System.out.print("Gaji Pokok : ");
            double gajiPokok = input.nextDouble();
            System.out.print("Mata Kuliah : ");
            String mataKuliah = input.next();
            System.out.print("Jumlah Pertemuan : ");
            int jumlahPertemuan = input.nextInt();

            asistenArray[i] = new AsistemPraktikum_2010(nama, nim, gajiPokok, jumlahPertemuan, mataKuliah);
        }

        // Input Data Staff Lab
        System.out.print("Jumlah Data Staff Lab :");
        int jumlahStaffLab = input.nextInt();
        StaffLab_2010[] staffLabArray = new StaffLab_2010[jumlahStaffLab];
        for (int i = 0; i < jumlahStaffLab; i++) {
            System.out.println("[Input Data Staff Lab Ke - " + (i + 1) + "]");
            System.out.println("NIM : ");
            String nim = input.next();
            System.out.print("Nama : ");
            String nama = input.next();
            System.out.print("Gaji Pokok : ");
            double gajiPokok = input.nextDouble();
            System.out.print("Nama Lab : ");
            String namaLab = input.next();
            System.out.print("Jam Kerja : ");
            int jamKerja = input.nextInt();

            staffLabArray[i] = new StaffLab_2010(nama, nim, gajiPokok, jamKerja, namaLab);
        }

        System.out.println("****Data Mahasiswa Bekerja****");

        // Tampilkan Data Asisten Praktikum
        for (AsistemPraktikum_2010 asisten : asistenArray) {
            System.out.println(asisten.toString());
        }

        // Tampilkan Data Staff Lab
        for (StaffLab_2010 staffLab : staffLabArray) {
            System.out.println(staffLab.toString());
        }


    }
}
