package com.Bunga_Laelatul_Muna.PBO.RELASIKELAS_21102010.KOMPOSISI_21102010;

public class TugasBesar_2010 {
    private String judul_2010;
    private Mahasiswa_2010[] anggota_2010;
    private int nilai_2010;

    public TugasBesar_2010(String judul, int jumlahAnggota) {
        this.judul_2010 = judul;
        this.anggota_2010 = new Mahasiswa_2010[jumlahAnggota];
    }

    public String getJudul() {
        return judul_2010;
    }

    public Mahasiswa_2010[] getAnggota() {
        return anggota_2010;
    }

    public int getNilai() {
        return nilai_2010;
    }

    public void setNilai(int nilai) {
        this.nilai_2010 = nilai;
    }
}