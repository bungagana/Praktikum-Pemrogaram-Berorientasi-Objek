// 21102010
// Bunga Laelatul Muna

package com.Bunga_Laelatul_Muna.PBO.Pertemuan4.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        Prodi prodi1 = new Prodi("FIF", "Auliya Burhanudin", "Teknik Informatika", 500);
        Prodi prodi2 = new Prodi("FTTE", "Iwan Setiawan", "Teknik Elektro", 150);

        do {
            System.out.println("Pilih program studi yang ingin dilihat informasinya:");
            System.out.println("1. FIF");
            System.out.println("2. FTTE");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    prodi1.infoFakultas();
                    prodi1.infoProdi();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    prodi2.infoFakultas();
                    prodi2.infoProdi();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 0);
    }
}
