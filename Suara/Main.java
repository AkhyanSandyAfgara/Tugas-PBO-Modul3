/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suara;

/**
 *
 * @author AKHYAN
 */
public class Main {// Program utama
    public static void main(String[] args) {
        // Membuat array Hewan dengan 1 elemen, isinya objek Burung
        Hewan[] hewan = {new Burung() };

        // Loop untuk memanggil method suara() pada setiap objek dalam array
        for (Hewan h : hewan) {
            // Karena objek sebenarnya adalah Burung,
            // maka suara() milik Burung yang dipanggil
            h.suara();
        }
    }
}
