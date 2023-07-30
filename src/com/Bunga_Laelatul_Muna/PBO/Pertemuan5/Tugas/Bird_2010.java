package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.Tugas;
// Bunga Laelatul Muna
// 21102010

public class Bird_2010 extends Animal_2010 {
    boolean canFly;

    public Bird_2010(String name, String habitat, boolean canFly) {
        super(name, habitat);
        this.canFly = canFly;
    }
/* ===  Implementasi Polymoprhism ====
        Ini adalah salah satu contoh dari konsep polymorphism,
        di mana objek kelas Bird_2010 dapat merespon metode move_2010()
        dengan cara yang berbeda dari objek kelas Animal_2010.*/
    @Override
    public void move_2010() { //func move di inisialisasi berbeda dg yng ada di animal.
        if (canFly) {
            System.out.println(name + " terbang");
        } else {
            System.out.println(name + " berjalan");
        }
    }
    @Override
    public void eat_2010() {
        System.out.println(name + " sedang mencari makan");
    }

    public void chirp_2010() {
        System.out.println(name + " sedang berkicau");
    }
}
