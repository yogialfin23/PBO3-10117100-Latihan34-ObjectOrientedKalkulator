package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi : program ini berisi program untuk menampilkan penjumlahan,
 * pengurangan,perkalian seperti pada kalkulator. angka di inputkan oleh user
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Kalkulator kalutor = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka Ke-1 : ");
        kalutor.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka Ke-2 : ");
        kalutor.value2 = scn.nextDouble();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan\t: "+kalutor.tambahBilangan());
        System.out.println("Hasil Pengurangan\t: "+kalutor.kurangBiangan());
        System.out.println("Hasil Perkalian\t\t: "+kalutor.kaliBilangan());
        System.out.println("Hasil Pembagian\t\t: "+df.format(kalutor.bagiBilangan()));
        System.out.println("Hasil Sisa\t\t\t: "+kalutor.sisaBilangan());

    }
}
