package Pertemuan4;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Sebuah Bilangan: ");
        int bilangan = input.nextInt();
        
        if(bilangan % 2 == 0) {
            System.out.println(bilangan + " Adalah Bilangan Genap");
        } else {
            System.out.println(bilangan + " Adalah Bilangan Ganjil");
        }
        
        
    }
}
