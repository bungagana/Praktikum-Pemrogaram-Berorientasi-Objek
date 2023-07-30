package com.Bunga_Laelatul_Muna.PBO.Pertemuan3.guided;

public class animal {

    //======= Atribut =======
    String name, color;
    int age;

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
    public  String getColor(){
        return  color;
    }
    public void  setColor(String color){
        this.color = color;
    }

    //======= Konstruktor ========
    public  animal(){}
    //======= Konstruktor Berparameter ========
    public  animal(String name, int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    //======= Method ========
    public  void  tampildata(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + " Tahun");
        System.out.println("Color : " + color);
        System.out.println();
    }
}
