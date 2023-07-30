package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guidedabstrak;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai sisi persegi: ");
        double sisiPersegi = scanner.nextDouble();
        Persegi persegi = new Persegi(sisiPersegi);

        System.out.print("Masukkan nilai panjang persegi panjang: ");
        double panjangPersegiPanjang = scanner.nextDouble();
        System.out.print("Masukkan nilai lebar persegi panjang: ");
        double lebarPersegiPanjang = scanner.nextDouble();
        persegiPanjang persegiPanjang = new persegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        System.out.print("Masukkan nilai jari-jari lingkaran: ");
        double jariJariLingkaran = scanner.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);

        scanner.close();

        System.out.println("Persegi");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());

        System.out.println("\nPersegi Panjang");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        System.out.println("\nLingkaran");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());
    }
}
