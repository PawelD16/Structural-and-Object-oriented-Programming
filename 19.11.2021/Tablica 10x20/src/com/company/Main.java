package com.company;

import java.util.Random;

import static com.company.Tablica_dwuwymiarowa.*;

public class Main {

    public static void main(String[] args) {

	double [][] tab=new double[10][];
    Random generator= new Random();

    for(int i=0;i< tab.length;i++) {
        tab[i] = new double[generator.nextInt(10) + 1];
    }

    generate_random_elements(tab);
    System.out.println("tablica przed sortowaniem:");
    view_elements(tab);

    tab=bubble_sort(tab);
    System.out.println("tablica po sortowaniu:");
    view_elements(tab);

    }
}
