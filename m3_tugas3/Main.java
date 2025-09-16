/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas3;
import java.util.Scanner;
/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pilihan dari pengguna
        System.out.print("Pilih kendaraan (1 = Mobil, 2 = Motor): ");
        int pilihan = sc.nextInt();

        Kendaraan kendaraan; // variabel bertipe abstrak

        if (pilihan == 1) {
            kendaraan = new Mobil();
        } else if (pilihan == 2) {
            kendaraan = new Motor();
        } else {
            System.out.println("Pilihan tidak valid.");
            sc.close();
            return;
        }

        // Jalankan metode
        kendaraan.nyalakanMesin();
        kendaraan.matikanMesin();

        sc.close();
    }
}