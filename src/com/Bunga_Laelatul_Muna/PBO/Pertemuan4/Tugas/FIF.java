//Bunga Laelatul Muna
// 21102010

package com.Bunga_Laelatul_Muna.PBO.Pertemuan4.Tugas;

public class FIF {
    private String namaFakultas;
    private String namaDekan;

    public void Fakultas(String namaFakultas, String namaDekan) {
        this.namaFakultas = namaFakultas;
        this.namaDekan = namaDekan;
    }

    public void infoFakultas() {
        System.out.println("Fakultas " + namaFakultas);
        System.out.println("Dekan " + namaDekan);
    }
}
