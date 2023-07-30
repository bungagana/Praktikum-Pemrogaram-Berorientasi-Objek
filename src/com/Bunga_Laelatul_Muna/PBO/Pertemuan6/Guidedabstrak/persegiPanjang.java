package com.Bunga_Laelatul_Muna.PBO.Pertemuan6.Guidedabstrak;

public class persegiPanjang extends kelasabstrak {
    private double panjang;
    private double lebar;

    public persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
}
