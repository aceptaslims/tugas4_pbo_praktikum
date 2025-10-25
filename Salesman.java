package Pertemuan4;

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan hari ini: ");
        double jual = input.nextDouble();

        double jasa, komisi, total;

        if (jual <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * jual;
        } else if (jual <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * jual;
        } else {
            jasa = 300000;
            komisi = 0.20 * jual;
        }

        total = jasa + komisi;

        System.out.println("Jasa: Rp" + jasa);
        System.out.println("Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + total);

     
    }
}

