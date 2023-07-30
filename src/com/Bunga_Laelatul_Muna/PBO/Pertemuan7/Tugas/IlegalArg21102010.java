package com.Bunga_Laelatul_Muna.PBO.Pertemuan7.Tugas;
public class IlegalArg21102010 {
    public static void main(String[] args) {
        try {
            int nim = 2102010;
            validateNim(nim);
            // Program yang benar
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            // Program yang salah
        }
    }

    public static void validateNim(int nim) {
        if (nim < 0) {
            throw new IllegalArgumentException("Nim tidak valid: " + nim);
        }
        System.out.println("Nim: " + nim);
    }
}
