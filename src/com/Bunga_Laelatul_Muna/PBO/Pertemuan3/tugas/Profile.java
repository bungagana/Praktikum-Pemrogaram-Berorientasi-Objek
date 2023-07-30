package com.Bunga_Laelatul_Muna.PBO.Pertemuan3.tugas;

public class Profile {
        //======  attribute ======
        private String name;
        private int age;
        private String Nim;

        // ===== Atribut Get and Set Public ======
        public  String getName(){
            return  name;
        }
        public void  setName(String name){
            this.name = name;
        }
        public  int getAge(){
            return  age;
        }
        public void  setAge(int age){
            this.age = age;
        }
        public  String getNim(){
            return Nim ;
        }
        public void  setNim(String Nim){
            this.Nim = Nim;
        }

        //======= Konstruktor ========
        public  Profile(){}
        //======= Konstruktor Berparameter ========
        public  Profile(String name, int age,String Nim){
            this.name = name;
            this.age = age;
            this.Nim = Nim;
        }
        //======= Method ========
        public  void  tampildata(){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age + " Tahun");
            System.out.println("Nim : " + Nim);
            System.out.println();
        }
}


