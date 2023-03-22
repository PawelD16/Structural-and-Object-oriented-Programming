package com.company;

import static com.company.Array_functions.*;

public class Main {

    public static void main(String[] args) {
    double[] tab=new double[10];

    generate_random_elements(tab);

    System.out.println("Tablica przed sortowaniem:");
    view_elements(tab);

    bubble_sort(tab);

    System.out.println("\n\nTablica po sortowaniu:");
    view_elements(tab);

    }
}
