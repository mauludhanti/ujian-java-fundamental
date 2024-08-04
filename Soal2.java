package com.juaracoding.ujianjf.dhantiujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.println("Masukkan nama film: ");
        String input = string.nextLine();

        //mengubah Nama Film menjadi huruf besar semua
        String namaFilmUpper = input.toUpperCase();
        System.out.println("Nama film dalam huruf besar: " +namaFilmUpper);

    }
}
