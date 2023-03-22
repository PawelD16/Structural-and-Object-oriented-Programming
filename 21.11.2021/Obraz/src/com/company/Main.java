package com.company;

import com.company.Platanie.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator=new Random();
        Macierz a = new Macierz(5, 5);
        Macierz c=new Macierz (5, 5);
        Macierz b = new Macierz(3, 3);

        int[] taba=new int[a.get_wiersze()*a.get_kolumny()];

        for(int i=0;i< taba.length;i++){
            taba[i]=generator.nextInt(255);
        }

        int[] tabb = {1, 250, 1, 1, 1, 30, 1 ,1 ,1};


        System.out.println("Macierz A:");
        a.wypelnianie_macierzy(taba);
        a.wypisz_macierz();

        System.out.println("\nMacierz B:");
        b.wypelnianie_macierzy(tabb);
        b.wypisz_macierz();

        System.out.println("\nWynik platania macierzy:");
        c=Platanie.platanie(a, b);
        //a.wypisz_macierz();
        c.wypisz_macierz();
    }
}
