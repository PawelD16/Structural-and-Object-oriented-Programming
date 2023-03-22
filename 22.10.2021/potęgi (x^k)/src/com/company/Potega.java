package com.company;

public class Potega {

    public static void main(String[] args) {

        int x = 5, k = 4, pot = x; //x-podstawa potęgi, k-wykładnik potęgi

        if (k == 0 && x == 0) System.out.println("To równanie nie ma wyniku!");
        else if (k == 0) System.out.println(1);
        else {
            for (int i = 1; i < k; i++) {
                x *= pot;
            }

            System.out.println(x);
        }
    }
}
