package com.Bunga_Laelatul_Muna.PBO.Pertemuan3.guided;
public class main {
    public static void main(String[] args) {
     /*   animal cat = new animal();
        animal ant = new animal();
        animal spider = new animal();
        // ========== Data Cat ========
        cat.name = "Kitty";
        cat.age = 3;
        // ========== Data Ant ========
        ant.name = "Scott";
        ant.age = 1;
        // ========== Data Spider ========
        spider.name = "Maguire";
        spider.age = 5;*/

    /*    //========== Tampil Data ========
        cat.tampildata();
        ant.tampildata();
        spider.tampildata();*/

        //========== ISI Data Dengan Parameter ========
        animal dog = new animal("Puppy", 4, "Black");

        //========== Tampil Data Berparameter ========
        dog.tampildata();

        //======= Uji Coba Get dan Set =======
        System.out.println("Dog's Name (Before) : " + dog.getName());
        dog.setName("Chedar");//ini kita ganti namanya
        System.out.println("Dog's Name (After) : " + dog.getName());
    }
}
