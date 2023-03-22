package com.company;

import static com.company.Array_functions.*;

public class Main {

    public static void main(String[] args) {

        int n=10;
        int[] tab1 = new int[n];
        int[] tab2 = new int[n];
        int[] tab3 = new int[n];
        int[] tab4 = new int[n];
        int[] tab5 = new int[n];

        generate_random_elements(tab1);
        generate_random_elements(tab2);

        System.out.println("Tablica 1: ");
        view_elements(tab1);

        System.out.println("Tablica 2: ");
        view_elements(tab2);



    }
}
