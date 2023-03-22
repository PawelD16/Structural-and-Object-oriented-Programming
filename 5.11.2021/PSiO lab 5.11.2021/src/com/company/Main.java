package com.company;

import java.util.Random;

class Tablica {

    public void wypelnij_tablice(int[] tab) { //wypelnia tablice elementami 0-100

        Random generator = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = generator.nextInt(101);
            if (Math.random() < 0.5) tab[i] *= -1;
        }
    }

    public void wyswietl_talice(int[] tab) { //wyswietla elementy tablicy

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Tab[" + i + "] =" + tab[i]);

            if ((i + 1) % 10 == 0) System.out.print("\n");
            else System.out.print("\t");
        }
    }

    public void wyswietl_talice(int[] tab, int j) { //wyswietla elementy tablicy o podanej dlugosci (funckja przeciazona)

        for (int i = 0; i < j; i++) {
            System.out.print("Tab[" + i + "] =" + tab[i] + "\t");

            if ((i + 1) % 10 == 0) System.out.print("\n");
            else System.out.print("\t");
        }
    }

    public int maksymalna_wartosc(int[] tab) { //wyszukuje najwieksza wartosc tablicy

        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) max = tab[i];
        }

        return max;
    }

    public int minimalna_wartosc(int[] tab) { //wyszukuje najwieksza wartosc tablicy

        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) min = tab[i];
        }

        return min;
    }

    public double srednia(int[] tab) {

        double srednia = 0;

        for (int i = 0; i < tab.length; i++) {
            srednia += tab[i];
        }

        return srednia / tab.length;
    }

    public void parzyste_do_tablicy(int[] tab) {

        int[] tablica_parzystych = new int[tab.length]; //tablica na liczby parzyste
        int j = 0; //iterator powyzszej tablicy

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                tablica_parzystych[j] = tab[i];
                j++;
            }
        }

        wyswietl_talice(tablica_parzystych, j);
    }

}

public class Main {

    public static void main(String[] args) {

        int[] tab = new int[100];

        Tablica test = new Tablica();
        test.wypelnij_tablice(tab);

        System.out.println("Tablica:\n");
        test.wyswietl_talice(tab);

        System.out.println("\nMaksymalna wartosc tablicy = " + test.maksymalna_wartosc(tab) + "\n");
        System.out.println("\nMinimalna wartosc tablicy = " + test.minimalna_wartosc(tab) + "\n");
        System.out.println("\nSrednia wartosc tablicy = " + test.srednia(tab) + "\n");

        System.out.println("Tablica liczb parzystych:\n");

        test.parzyste_do_tablicy(tab);

    }
}
