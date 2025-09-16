/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m3_tugas5;
import java.util.Scanner;

/**
 *
 * @author AKHYAN
 */

// Kelas abstrak
abstract class Rekening {
    protected String nomor;
    protected double saldo;

    public Rekening(String nomor, double saldoAwal) {
        this.nomor = nomor;
        this.saldo = saldoAwal;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor: " + jumlah + " | Saldo: " + saldo);
    }

    public abstract void tarik(double jumlah);
}

// Tabungan
class RekeningTabungan extends Rekening {
    public RekeningTabungan(String nomor, double saldoAwal) {
        super(nomor, saldoAwal);
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik: " + jumlah + " | Saldo: " + saldo);
        } else {
            System.out.println("Saldo tabungan tidak cukup.");
        }
    }
}

// Giro
class RekeningGiro extends Rekening {
    public RekeningGiro(String nomor, double saldoAwal) {
        super(nomor, saldoAwal);
    }

    public void tarik(double jumlah) {
        saldo -= jumlah;
        System.out.println("Tarik giro: " + jumlah + " | Saldo: " + saldo);
    }
}

// Deposito
class RekeningDeposito extends Rekening {
    private boolean jatuhTempo;

    public RekeningDeposito(String nomor, double saldoAwal, boolean jatuhTempo) {
        super(nomor, saldoAwal);
        this.jatuhTempo = jatuhTempo;
    }

    public void tarik(double jumlah) {
        if (jatuhTempo && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik deposito: " + jumlah + " | Saldo: " + saldo);
        } else {
            System.out.println("Tidak bisa tarik. Deposito belum jatuh tempo.");
        }
    }
}

// Program utama
public class MainRekening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih rekening: 1.Tabungan  2.Giro  3.Deposito");
        int pilih = sc.nextInt();

        Rekening r;
        if (pilih == 1) r = new RekeningTabungan("T001", 1000000);
        else if (pilih == 2) r = new RekeningGiro("G001", 500000);
        else r = new RekeningDeposito("D001", 2000000, false);

        r.setor(500000);
        r.tarik(300000);

        sc.close();
    }
}

