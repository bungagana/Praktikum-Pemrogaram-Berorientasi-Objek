package com.Bunga_Laelatul_Muna.PBO.Pertemuan7.Tugas;

public class ClassCastExep21102010 {
    public static void main(String[] args) {
        try {
            Object nim = new Integer(21102010);
            String str = (String) nim; //Melakukan penugasan yg tidak valid, inisialisais awal int tp di suruh str
            System.out.println(str);
            // Program yang benar
        } catch (ClassCastException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            // Program yang salah
        }
    }
}