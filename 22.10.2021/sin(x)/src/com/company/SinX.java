package com.company;


public class SinX {

    public static double Sin(int n, int x) {

        double k = 1;
        double suma = x;
        double temp = x;

        while (k <= n) {
            temp *= (x * x * (-1)) / ((2 * k) * (2 * k + 1));
            suma = suma + temp;

            k++;
        }

        return (suma);
    }

    public static void main(String[] args) {
        
        int n = 20, x = 8;

        System.out.println(Sin(n, x));
    }

}
