package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.Tugas;
// Bunga Laelatul Muna
// 21102010
public class Fish_2010 extends Animal_2010 {
    boolean canSwim;

    public Fish_2010(String name, String habitat, boolean canSwim) {
        super(name, habitat);
        this.canSwim = canSwim;
    }

    // ==== Polymorphism ====
    @Override
    public void move_2010() {
        if (canSwim) {
            System.out.println(name + " berenang");
        } else {
            System.out.println(name + " diam di tempat");
        }
    }

    @Override
    public void eat_2010() {
        System.out.println(name + " sedang mencari makanan di dasar laut");
    }
}
