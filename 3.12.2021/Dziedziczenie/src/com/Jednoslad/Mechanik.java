package com.Jednoslad;

public class Mechanik {

    public static void mycie(Jednoslad j) {
        if (!j.get_czy_brudny()) System.out.println("\nJednoslad jest juz czysty!");
        else {
            j.set_czy_brudny(false);
            System.out.println("\nMycie " + j.get_model() + "...już umyty!");
        }
    }

    public static void wymianaOgumienia(Jednoslad j) {

        if (j.get_stan_ogumenia() > 70) System.out.println("\nOgumienie w dobrym stanie: "+j.get_stan_ogumenia()+"%");
        else {
            j.set_stan_ogumenia(100);
            if (j.get_ilosc_kol() == 1) System.out.println("\nOpona " + j.get_model() + " wymieniona");
            else System.out.println("\nOpony " + j.get_model() + " wymienione");
        }
    }

    public static void lakierowanie(Jednoslad j, String kolor) {
        if (j.get_kolor() == kolor) System.out.println("\n"+j.get_model() + " juz ma taki kolor!");
        else {
            j.set_kolor(kolor);
            System.out.println("\nPrzemalowywanie " + j.get_model() + " na kolor " + kolor);
        }
    }


}
