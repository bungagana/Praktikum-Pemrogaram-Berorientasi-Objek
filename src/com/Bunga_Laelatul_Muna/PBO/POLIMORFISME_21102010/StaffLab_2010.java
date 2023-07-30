package com.Bunga_Laelatul_Muna.PBO.POLIMORFISME_21102010;

public class StaffLab_2010 extends StudentStaff_21102010 {
    String NamaLab_2010;
    int JamKerja_2010;

    public StaffLab_2010(String nama, String nim, double gajipokok, int jamKerja, String namalab) {
        super(nama, nim, gajipokok);
        this.NamaLab_2010 = nama;
        this.JamKerja_2010 = jamKerja;
    }

    @Override
    public double HitungTotalGaji_2010() {
        return GajiPokok_2010 + (JamKerja_2010 * 30000);
    }
    public String toString() {
        return "[Staff Lab]\nNIM: " + nim_2010 + "\nNama: " + nama_2010 + "\nGaji Pokok: " + GajiPokok_2010 +
                "\nNama Lab: " + NamaLab_2010 + "\nJam Kerja: " + JamKerja_2010 +
                "\nTotal Gaji: " + HitungTotalGaji_2010() + "\n";
    }
}