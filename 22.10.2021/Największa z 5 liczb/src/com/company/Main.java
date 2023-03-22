package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int x;

        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 100;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (tab[j] > tab[i]) {
                    x = tab[i];
                    tab[i] = tab[j];
                    tab[j] = x;
                }
            }
        }
        System.out.println(tab[0]);
    }

}
