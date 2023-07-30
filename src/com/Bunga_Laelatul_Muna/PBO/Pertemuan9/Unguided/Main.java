package com.Bunga_Laelatul_Muna.PBO.Pertemuan9.Unguided;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa Yang Akan Di Tambahkan: ");
        int JumlahMahasiswa = scanner.nextInt();
        scanner.nextLine();

        DataMahasiswa_21102010[] etalase = new DataMahasiswa_21102010[JumlahMahasiswa];

        for (int i = 0; i < JumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            String NamaMahasiswa = scanner.nextLine();

            System.out.print("Masukkan nim mahasiswa: ");
            String NimMahasiswa = scanner.next();
            scanner.nextLine();
            etalase[i] = new DataMahasiswa_21102010(NamaMahasiswa, NimMahasiswa);
        }

        System.out.println("\n============ Daftar Mahasiswa =============: ");

        int i = 1;
        for (DataMahasiswa_21102010 barang : etalase) {
            System.out.println("Mahasiswa ke-" + i);
            barang.ShowInfo();
            i++;
        }

    }
}
