package com.company;

import java.util.Random;

class Array_functions {
`
    static double[] generate_random_elements(double[] tab){

        Random generator=new Random();

        for(int i=0;i< tab.length;i++){
            tab[i]=generator.nextDouble()*101;
            if(Math.random()<0.5) tab[i]*=-1;
        }

        return tab;
    }

    static void view_elements(double[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println("tablica ["+i+"] = "+tab[i]);
        }
    }

    static double[] bubble_sort(double[] tab) {

        double swapper = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    swapper = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = swapper;
                }
            }
        }
        return tab;
    }
}
