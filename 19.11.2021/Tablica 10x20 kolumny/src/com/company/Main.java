package com.company;

import static com.company.Tablica_dwuwymiarowa.*;

public class Main {

    public static void main(String[] args) {
        double[][] tab = new double[10][20];

        generate_random_elements(tab);
        System.out.println("tablica przed sortowaniem:");
        view_elements(tab);

        tab=bubble_sort_columns(tab);

        System.out.println("tablica po sortowaniu:");
        view_elements(tab);

    }
}
