package com.Bunga_Laelatul_Muna.PBO.Pertemuan9.Guided;

public class Main {
    public static void main(String[] args) {
        Barang[] keranjang = new Barang[500];

        Barang[] etalase = {
                new Barang("indomie", 3000),
                new Barang("telur", 1800),
                new Barang("susu", 2000),
                new Barang("bola", 10000),
                new Barang("beras", 12000)
        };
        System.out.println("Jumlah barang di etalase: " + etalase.length);
        System.out.println("Daftar barang di etalase: ");

        int i = 1;
        for (Barang c : etalase) {
            System.out.println("Barang ke-" + i);
            c.ShowInfo();
            i++;
        }
    }
}


//// ================= BUAT INPUTAN USER ====================
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Masukkan jumlah barang di etalase: ");
//        int jumlahBarang = scanner.nextInt();
//
//        Barang[] etalase = new Barang[jumlahBarang];
//
//        for (int i = 0; i < jumlahBarang; i++) {
//            System.out.println("Barang ke-" + (i+1));
//            System.out.print("Masukkan nama barang: ");
//            String namaBarang = scanner.next();
//
//            System.out.print("Masukkan harga barang: ");
//            int hargaBarang = scanner.nextInt();
//
//            etalase[i] = new Barang(namaBarang, hargaBarang);
//        }
//
//        System.out.println("Daftar barang di etalase: ");
//
//        int i = 1;
//        for (Barang barang : etalase) {
//            System.out.println("Barang ke-" + i);
//            barang.ShowInfo();
//            i++;
//        }
//
//        scanner.close();
//    }
//}
