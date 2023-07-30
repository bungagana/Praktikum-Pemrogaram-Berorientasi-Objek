package com.Bunga_Laelatul_Muna.PBO.Pertemuan7.Guided;
//Bunga Laelatul Muna
//21102010

public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
            // Program yang benar
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            // Program yang salah
        }
    }
}