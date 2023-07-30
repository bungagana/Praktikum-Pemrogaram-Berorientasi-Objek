package com.Bunga_Laelatul_Muna.PBO.POLIMORFISME_21102010;

public class StudentStaff_21102010 {
    String nim_2010, nama_2010;
    double GajiPokok_2010;

    public StudentStaff_21102010() {
    }
    public StudentStaff_21102010(String nama, String nim, double GajiPokok) {
        this.nim_2010 = nim;
        this.nama_2010 = nama;
        this.GajiPokok_2010 = GajiPokok;
    }

    public void TampilData_2010() {
    }

    public double HitungTotalGaji_2010() {
        return GajiPokok_2010;
    }

}
