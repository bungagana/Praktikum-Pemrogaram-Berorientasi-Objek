package com.Bunga_Laelatul_Muna.PBO.Pertemuan7.Tugas;
//Bunga Laelatul Muna
//21102010

public class NullPointerExep21102010 {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();  // Akses method pada objek null
            System.out.println("Program berjalan dengan benar.");
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
            System.out.println("Program mengalami kesalahan.");
        }
    }
}

