package com.Bunga_Laelatul_Muna.PBO.RELASIKELAS_21102010.ASOSIASI_2110210;

import java.util.List;
import java.util.Scanner;

public class Main_2010 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Mengambil input jenis pohon dan usia pohon
    System.out.print("Masukkan jenis pohon: ");
    String jenisPohon_2010 = scanner.nextLine();
    System.out.print("Masukkan usia pohon: ");
    int usiaPohon_2010 = scanner.nextInt();
    scanner.nextLine(); // Membersihkan newline

    // Membuat objek Pohon
    Pohon_2010 pohon = new Pohon_2010(jenisPohon_2010, usiaPohon_2010);

    // Menambahkan daun ke pohon
    boolean tambahDaun = true;
    while (tambahDaun) {
        System.out.print("Masukkan jenis daun: ");
        String jenisDaun = scanner.nextLine();
        System.out.print("Masukkan warna daun: ");
        String warnaDaun = scanner.nextLine();

        pohon.tambahDaun(jenisDaun, warnaDaun);

        System.out.print("Tambah daun lagi? (ya/tidak): ");
        String jawaban = scanner.nextLine();
        if (jawaban.equalsIgnoreCase("tidak")) {
            tambahDaun = false;
        }
    }

    // Menampilkan informasi pohon dan daun
    System.out.println("Jenis Pohon: " + pohon.getJenisPohon());
    System.out.println("Usia Pohon: " + pohon.getUsiaPohon());
    System.out.println("Memiliki Daun:");

    List<Daun_2010> daunList = pohon.getDaunList();
    for (Daun_2010 daun : daunList) {
        System.out.println("Jenis Daun: " + daun.getJenis_2010());
        System.out.println("Warna Daun: " + daun.getWarna_2010());
    }
}
}

