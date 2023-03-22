package com.company;

import java.util.Random;

class Array_functions {

    static void generate_random_elements(int[] tab) {

        Random generator = new Random();
        int x;
        int suma;

        for (int i = 0; i < tab.length; i++) {
            suma = 0;
            x = generator.nextInt(20);
            for (int j = 0; j < tab.length; j++) {
                if (x == tab[j]) {
                    suma++;
                }
            }
            if (suma == 0) tab[i] = x;
            else i--;
        }

    }


    static void view_elements(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }


    static int[] iloczyn_zbiorow(int[] tab1, int[] tab2) {
        int[] tab3 = new int[tab1.length];
        int powtorzenia;
        int x;

        for (int i = 0; i < tab1.length; i++) {
            x = tab1[i];
            powtorzenia = 0;

            for (int j = 0; j < tab2.length; j++)
                if (tab1[i] == tab2[j]) powtorzenia++;

            if (powtorzenia == 0) tab3[i] = tab1[i];
        }
    }

    static int[] suma_zbiorow(int[] tab1, int[] tab2) {
        int[] tab3 = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i] + tab2[i];
        }
        return tab3;
    }

    static int[] roznica_zbiorow(int[] tab1, int[] tab2) {
        int[] tab3 = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i] - tab2[i];
        }
        return tab3;
    }


}
