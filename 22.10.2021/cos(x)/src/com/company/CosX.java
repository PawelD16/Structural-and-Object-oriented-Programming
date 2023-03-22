package com.company;

public class CosX {

    public static double Cos(int x) {

        double suma = 1;
        double licznik = 1, mianownik = 1;
        int k = 1;
        int dokladnosc = 2 * x; //zmienna "dokladnosc" 2 razy wieksza od "x" zapewnia wystarczającą dokładność wyniku

        while (k <= dokladnosc) {

            licznik *= x * x * (-1);
            mianownik *= (2 * k - 1) * (2 * k);
            suma += licznik / mianownik;

            k++;
        }

        return suma;
    }


    public static void main(String[] args) {

        int x = 7;

        System.out.println(Cos(x));

    }
}
