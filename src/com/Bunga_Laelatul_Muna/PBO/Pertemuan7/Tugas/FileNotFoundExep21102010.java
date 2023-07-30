package com.Bunga_Laelatul_Muna.PBO.Pertemuan7.Tugas;
//Bunga Laelatul Muna
//21102010
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExep21102010 {
    public static void main(String[] args) {
        try {
            File file = new File("Ada.txt"); // Mencoba membuka file yang tidak ada
            Scanner scanner = new Scanner(file);

            System.out.println("File ditemukan. Program berjalan dengan benar.");
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi FileNotFoundException: " + e.getMessage());
            System.out.println("File tidak ditemukan. Program mengalami kesalahan.");
        }
    }
}
