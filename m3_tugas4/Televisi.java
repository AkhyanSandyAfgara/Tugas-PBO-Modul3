/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas4;

/**
 *
 * @author AKHYAN
 */
class Televisi implements AlatElektronik {
    @Override
    public void hidupkan() {
        System.out.println("Televisi dinyalakan... Menampilkan gambar dan suara.");
    }

    @Override
    public void matikan() {
        System.out.println("Televisi dimatikan.");
    }
}