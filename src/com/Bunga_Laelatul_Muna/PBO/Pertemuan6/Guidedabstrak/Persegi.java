package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guidedabstrak;

public class Persegi extends kelasabstrak {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
