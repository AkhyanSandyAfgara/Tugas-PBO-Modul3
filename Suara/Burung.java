/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suara;

/**
 *
 * @author AKHYAN
 */
class Burung extends Hewan {// Kelas turunan Burung dari Hewan
    // Override method suara() agar sesuai dengan suara Burung
    @Override
    public void suara() {
        System.out.println("Cuit... Cuit...");
    }
}
