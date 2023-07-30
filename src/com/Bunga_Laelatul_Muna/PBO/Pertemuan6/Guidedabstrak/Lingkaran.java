package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guidedabstrak;

public class Lingkaran extends kelasabstrak {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
