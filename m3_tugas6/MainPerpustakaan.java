/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AKHYAN
 */

// Kelas induk
class Item {
    protected String judul;
    protected int tahunTerbit;

    public Item(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Tahun Terbit: " + tahunTerbit);
    }
}

// Buku
class Buku extends Item {
    private String pengarang;
    private int jumlahHalaman;

    public Buku(String judul, int tahunTerbit, String pengarang, int jumlahHalaman) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Buku - Judul: " + judul + ", Tahun: " + tahunTerbit +
                           ", Pengarang: " + pengarang + ", Halaman: " + jumlahHalaman);
    }
}

// Majalah
class Majalah extends Item {
    private int edisi;
    private int volume;

    public Majalah(String judul, int tahunTerbit, int edisi, int volume) {
        super(judul, tahunTerbit);
        this.edisi = edisi;
        this.volume = volume;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Majalah - Judul: " + judul + ", Tahun: " + tahunTerbit +
                           ", Edisi: " + edisi + ", Volume: " + volume);
    }
}

// DVD
class DVD extends Item {
    private int durasi;
    private String genre;

    public DVD(String judul, int tahunTerbit, int durasi, String genre) {
        super(judul, tahunTerbit);
        this.durasi = durasi;
        this.genre = genre;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("DVD - Judul: " + judul + ", Tahun: " + tahunTerbit +
                           ", Durasi: " + durasi + " menit, Genre: " + genre);
    }
}

// Program utama
public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> koleksi = new ArrayList<>();

        System.out.println("Masukkan jumlah item: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // buang newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPilih jenis item (1=Buku, 2=Majalah, 3=DVD): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Tahun terbit: ");
            int tahun = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Pengarang: ");
                String pengarang = sc.nextLine();
                System.out.print("Jumlah halaman: ");
                int halaman = sc.nextInt();
                sc.nextLine();
                koleksi.add(new Buku(judul, tahun, pengarang, halaman));
            } else if (pilihan == 2) {
                System.out.print("Edisi: ");
                int edisi = sc.nextInt();
                System.out.print("Volume: ");
                int volume = sc.nextInt();
                sc.nextLine();
                koleksi.add(new Majalah(judul, tahun, edisi, volume));
            } else {
                System.out.print("Durasi (menit): ");
                int durasi = sc.nextInt();
                sc.nextLine();
                System.out.print("Genre: ");
                String genre = sc.nextLine();
                koleksi.add(new DVD(judul, tahun, durasi, genre));
            }
        }

        System.out.println("\n=== Daftar Koleksi Perpustakaan ===");
        for (Item item : koleksi) {
            item.tampilkanInfo();
        }

        sc.close();
    }
}

