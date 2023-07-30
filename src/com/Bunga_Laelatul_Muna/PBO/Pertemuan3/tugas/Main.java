package com.Bunga_Laelatul_Muna.PBO.Pertemuan3.tugas;

import com.Bunga_Laelatul_Muna.PBO.Pertemuan3.guided.animal;

public class Main {
    public static void main(String[] args) {
        //========== ISI Data Dengan Parameter ========
        Profile bunga_21102010 = new Profile("Bunga", 19, "21102010");

        //========== Tampil Data Berparameter ========
        bunga_21102010.tampildata();

        //======= Uji Coba Get dan Set =======
        System.out.println("Profile's Name (Before) : " + bunga_21102010.getName());
        bunga_21102010.setName("Bunga Laelatul Muna");//ini kita ganti namanya
        System.out.println("Profile's Name (After) : " + bunga_21102010.getName());
    }
}