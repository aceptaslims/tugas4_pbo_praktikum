package Pertemuan4;

import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();
        
        System.out.println("Kode Golongan: ");
        System.out.println("1. Menikah");
        System.out.println("2. Belum Menikah");
        System.out.println("3. Cerai");
        System.out.println("4. Menikah dan punya anak");
        
        System.out.print("Masukan kode golongan (1-4): ");
        int gol = input.nextInt();
        
        double gajiPokok = 0;
        String keterangan = "";
        
        switch(gol) {
            case 1:
                keterangan = "Menikah";
                gajiPokok = 1200000;
                break;
            case 2:
                keterangan = "Belum Menikah";
                gajiPokok = 1500000;
                break;
            case 3:
                keterangan = "Cerai";
                gajiPokok = 1750000;
                break;
            case 4:
                keterangan = "Menikah Dan Punya Anak";
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode Golongan Salah!");
                return;
        }
        
        double tunjanganAnak = 0;
        if(gol == 4) {
            tunjanganAnak = 0.05 * gajiPokok;
        }
        
        double gajiBersih = gajiPokok + tunjanganAnak;
        
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan: Rp" + tunjanganAnak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
}
