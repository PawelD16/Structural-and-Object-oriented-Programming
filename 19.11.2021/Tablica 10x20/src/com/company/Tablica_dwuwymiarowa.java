package com.company;

import java.util.Random;

public class Tablica_dwuwymiarowa {


    static double[][] generate_random_elements(double[][] tab) {

        Random generator = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = generator.nextDouble() * 100;
                if (Math.random() < 0.5) tab[i][j] *= -1;
            }
        }

        return tab;
    }

    static void view_elements(double[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("tablica [" + i + "] = {");

            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]+",  ");
            }

            System.out.println("}");
        }
    }

    static double[][] bubble_sort(double[][] tab) {

        double swapper = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                for (int k = 0; k < tab[i].length - 1; k++) {
                    if (tab[i][k] > tab[i][k+1]) {
                        swapper = tab[i][k];
                        tab[i][k] = tab[i][k+1];
                        tab[i][k+1] = swapper;
                    }
                }
            }
        }
        return tab;
    }

}
