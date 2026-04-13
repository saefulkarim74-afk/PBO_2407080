package latihan_pbo.latihan1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM BANGUN DATAR ===");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {

            Segitiga sTiga = new Segitiga();

            System.out.print("Masukkan alas: ");
            sTiga.setAlas(input.nextDouble());

            System.out.print("Masukkan tinggi: ");
            sTiga.setTinggi(input.nextDouble());

            System.out.println("Luas Segitiga adalah: " + sTiga.hitungLuas());

        } else if (pilihan == 2) {

            Persegi p = new Persegi();

            System.out.print("Masukkan sisi: ");
            p.setSisi(input.nextDouble());

            System.out.println("Luas Persegi adalah: " + p.hitungLuas());

        } else if (pilihan == 3) {

            PersegiPanjang pp = new PersegiPanjang();

            System.out.print("Masukkan panjang: ");
            pp.setPanjang(input.nextDouble());

            System.out.print("Masukkan lebar: ");
            pp.setLebar(input.nextDouble());

            System.out.println("Luas Persegi Panjang adalah: " + pp.hitungLuas());

        } else if (pilihan == 4) {

            Lingkaran l = new Lingkaran();

            System.out.print("Masukkan jari-jari: ");
            l.setSisi(input.nextDouble());

            System.out.println("Luas Lingkaran adalah: " + l.hitungLuas());

        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}