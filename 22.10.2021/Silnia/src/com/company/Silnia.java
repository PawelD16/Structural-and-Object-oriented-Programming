package com.company;

public class Silnia {

    public static void main(String[] args) {
        int n = 6;                                  //n to liczba podnoszona do potegi
        if (n == 0 || n == 1) System.out.println(1);
        else {
            for (int i = n - 1; i > 1; i--) {
                n *= i;
            }

            System.out.println(n);
        }
    }
}
