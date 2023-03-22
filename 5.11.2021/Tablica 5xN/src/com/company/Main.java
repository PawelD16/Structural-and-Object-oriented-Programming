package com.company;

import java.util.Random;


class Tablice {

    private Tablice() {
    }

    public static double znajdz_maksimum(double[][] tablica) {
        double maksimum = tablica[0][0];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] > maksimum) maksimum = tablica[i][j];
            }
        }
        return maksimum;
    }

    public static void wyswietl_tablice(double[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print("Tab[" + i + "]" + "[" + j + "]" + "=" + tablica[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }


    public static void wypelnianie_tablicy(double[][] tablica) {
        Random generator = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = generator.nextInt(11);
            }
        }
    }

    public static void maksimum_na_wiersz(double[][] tablica) {

        double maksimum;

        for (int i = 0; i < tablica.length; i++) {

            maksimum = tablica[i][0];
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] > maksimum) maksimum = tablica[i][j];
            }
            System.out.println("Maksimum wiersza nr. " + i + " jest równe = " + maksimum);
        }
    }

    public static void srednia_na_wiersz(double[][] tablica) {

        double srednia;

        for (int i = 0; i < tablica.length; i++) {
            srednia = 0;

            for (int j = 0; j < tablica[i].length; j++) {
                srednia += tablica[i][j];
            }

            srednia /= (double) tablica[i].length;
            System.out.println("Srednia wiersza nr. " + i + " jest równa = " + srednia);
        }
    }

    public static double znajdz_srednia(double[][] tablica) {
        double srednia = 0;
        double iterator = 0;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                srednia += tablica[i][j];
                iterator++;
            }
        }
        srednia /= iterator;
        return srednia;
    }

}

public class Main {

    public static void main(String[] args) {

        double[][] tablica = new double[10][];

        Random generator = new Random();

        for(int i=0;i< tablica.length;i++) {
            tablica[i] = new double[generator.nextInt(10) + 1];
        }


        Tablice.wypelnianie_tablicy(tablica);
        Tablice.wyswietl_tablice(tablica);
        Tablice.maksimum_na_wiersz(tablica);
        Tablice.srednia_na_wiersz(tablica);

        System.out.println("\nSrednia calej tablicy = " + Tablice.znajdz_srednia(tablica));

        System.out.println("\nMaksimum calej tablicy = " + Tablice.znajdz_maksimum(tablica));

    }
}
