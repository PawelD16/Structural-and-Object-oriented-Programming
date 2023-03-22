package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        Macierz a = new Macierz();

        int[] tab = new int[25];


        for (int i = 0; i < 25; i++) {
            tab[i] = generator.nextInt(2);
        }

        /*
        for (int i = 0; i < 25; i++) {
            tab[i] = 0;
        }

        tab[5]=1;
        tab[0]=1;
        tab[6]=1;
        tab[1]=1;
        */
        System.out.println("Macierz A:");
        a.wypelnianie_macierzy(tab);
        a.wypisz_macierz();

        a.wypisz_relacje();
        a.wlasnosci();
    }
}
