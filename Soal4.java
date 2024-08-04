package com.juaracoding.ujianjf.dhantiujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film[] = new String[5];

        System.out.println("Daftar film bioskop ");


        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ":");
            film[i] = scanner.nextLine();
        }

        System.out.println("\nNama-nama film yang ingin Anda tonton:");

        for (int j = 0; j < film.length; j++) {
            System.out.println((j + 1) + ". " + film[j]);
        }

    }
}
