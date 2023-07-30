package com.Bunga_Laelatul_Muna.PBO.POLIMORFISME_21102010;

public class AsistemPraktikum_2010 extends StudentStaff_21102010 {
    String MataKuliah_2010;
    int JumlahPert_2010;

    public AsistemPraktikum_2010(String nama, String nim, double gajipokok, int jumlahpert, String matakuliah) {
        super(nama, nim, gajipokok);
        this.MataKuliah_2010 = matakuliah;
        this.JumlahPert_2010 = jumlahpert;
    }

    @Override
    public double HitungTotalGaji_2010() {
        return super.HitungTotalGaji_2010() + (JumlahPert_2010 * 20000);
    }
    public String toString() {
        return "[Staff Lab]\nNIM: " + nim_2010 + "\nNama: " + nama_2010 + "\nGaji Pokok: " + GajiPokok_2010 +
                "\nMata Kuliah: " + MataKuliah_2010 + "\nJumlah Pertemuan: " + JumlahPert_2010 +
                "\nTotal Gaji: " + HitungTotalGaji_2010() + "\n";
    }

}
