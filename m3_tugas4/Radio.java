/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas4;

/**
 *
 * @author AKHYAN
 */
class Radio implements AlatElektronik {
    @Override
    public void hidupkan() {
        System.out.println("Radio dinyalakan... Memutar siaran musik.");
    }

    @Override
    public void matikan() {
        System.out.println("Radio dimatikan.");
    }
}
