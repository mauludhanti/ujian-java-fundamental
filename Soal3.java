package com.juaracoding.ujianjf.dhantiujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Apakah untuk Weekday atau Weekend? ");
        String hari = scanner.nextLine();

        // Harga tiket weekday dan weekend
        int hargaWeekday = 35000;
        int hargaWeekend = 45000;
        int hargaTiket = 0;

        // Menentukan harga tiket berdasarkan jenis hari
        if (hari.equals("weekday")) {
            hargaTiket = hargaWeekday;
        } else if (hari.equals("weekend")) {
            hargaTiket = hargaWeekend;
        } else {
            System.out.println("Input tidak valid.");
        }

        System.out.println("Masukkan jumlah tiket anda: ");
        int jumlahTiket = scanner.nextInt();

        // Menghitung total harga
        int totalHarga = hargaTiket * jumlahTiket;

        // Memberikan diskon jika jumlah tiket lebih dari 5
        if (jumlahTiket > 5) {
            totalHarga *= 0.1; // Diskon 10%
        }

        // Menampilkan total harga tiket
        System.out.println("Total harga tiket: " + totalHarga);

    }
}
