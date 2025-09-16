/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas3;

/**
 *
 * @author AKHYAN
 */
abstract class Kendaraan {
    // Metode abstrak (harus diimplementasikan oleh turunan)
    public abstract void nyalakanMesin();

    // Metode non-abstrak (langsung bisa dipakai)
    public void matikanMesin() {
        System.out.println("Mesin dimatikan.");
    }
}