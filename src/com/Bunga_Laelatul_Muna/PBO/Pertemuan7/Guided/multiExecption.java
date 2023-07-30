package com.Bunga_Laelatul_Muna.PBO.Pertemuan7.Guided;
import java.util.InputMismatchException;
import java.util.Scanner;

public class multiExecption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Masukan Bilangan: ");
            int bilangan = input.nextInt();

            System.out.println("Masukan pembagi: ");
            int pembagi = input.nextInt();
            int hasil = bilangan/pembagi;

            System.out.println(bilangan + " / "+ pembagi + " = " + hasil + " (dibulatkan)");
        }
        catch (ArithmeticException | InputMismatchException e){
            System.out.println("Error: Tidak dapat memproses");
        }
        System.out.println("Proses selesai");
    }
}
