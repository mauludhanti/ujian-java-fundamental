package com.juaracoding.ujianjf.dhantiujian1jf.ujian1;

public class Soal5 {
    public static void main(String[] args) {
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};
        int price = 0;

        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": Rp" + hargaTiket[i]);
            price += hargaTiket[i];
        }

        System.out.println("\nTotal harga tiket: Rp" + price);
    }
}
