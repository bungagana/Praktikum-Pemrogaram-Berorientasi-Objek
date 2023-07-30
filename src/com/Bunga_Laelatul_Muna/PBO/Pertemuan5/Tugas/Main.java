package com.Bunga_Laelatul_Muna.PBO.Pertemuan5.Tugas;
// Bunga Laelatul Muna
// 21102010
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal_2010> animals = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih binatang yang ingin ditambahkan:");
            System.out.println("1. Burung");
            System.out.println("2. Ikan");
            System.out.println("3. Selesai");

            System.out.print("Menu: ");
            int choice = input.nextInt();

            if (choice == 1) {
                Bird_2010 bird = createBird();
                animals.add(bird);
            } else if (choice == 2) {
                Fish_2010 fish = createFish();
                animals.add(fish);
            } else {
                break;
            }
        }

        for (Animal_2010 animal : animals) {
            System.out.println("Nama: " + animal.name);
            System.out.println("Habitat: " + animal.habitat);
            animal.move_2010();
            animal.eat_2010();
            System.out.println();
        }
    }

    public static Bird_2010 createBird() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama burung: ");
        String name = input.nextLine();

        System.out.print("Masukan habitat burung: ");
        String habitat = input.nextLine();

        System.out.print("Bisa terbang? (ya/tidak): ");
        String canFlyStr = input.nextLine();
        boolean canFly;
        if (canFlyStr.equalsIgnoreCase("ya")) {
            canFly = true;
        } else if (canFlyStr.equalsIgnoreCase("tidak")) {
            canFly = false;
        } else {
            System.out.println("Input tidak valid. Mengasumsikan tidak bisa terbang.");
            canFly = false;
        }

        return new Bird_2010(name, habitat, canFly);
    }

    public static Fish_2010 createFish() {
        Scanner input = new Scanner(System.in); System.out.print("Masukan nama ikan: ");
        String name = input.nextLine();

        System.out.print("Masukan habitat ikan: ");
        String habitat = input.nextLine();

        System.out.print("Bisa bernafas di air? (ya/tidak): ");
        String Canbreat_Str= input.nextLine();
        boolean CanBreath;
        if (Canbreat_Str.equalsIgnoreCase("ya")) {
            CanBreath = true;
        } else if (Canbreat_Str.equalsIgnoreCase("tidak")) {
            CanBreath = false;
        } else {
            System.out.println("Input tidak valid. Mengasumsikan tidak bisa terbang.");
            CanBreath = false;
        }

        return new Fish_2010(name, habitat, CanBreath);
    }
}

