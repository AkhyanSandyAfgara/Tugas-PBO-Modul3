/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas4;
import java.util.Scanner;
/**
 *
 * @author AKHYAN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilih alat elektronik (1 = Televisi, 2 = Radio): ");
        int pilihan = sc.nextInt();

        AlatElektronik alat; // variabel interface

        if (pilihan == 1) {
            alat = new Televisi();
        } else if (pilihan == 2) {
            alat = new Radio();
        } else {
            System.out.println("Pilihan tidak valid.");
            sc.close();
            return;
        }

        // Panggil method dari objek yang dipilih
        alat.hidupkan();
        alat.matikan();

        sc.close();
    }
}