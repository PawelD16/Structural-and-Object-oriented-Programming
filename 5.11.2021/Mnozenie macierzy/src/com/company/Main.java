package com.company;

class Macierz {

    private int wiersze;
    private int kolumny;

    private double[][] macierz;

    public Macierz() { //tworzy macierz 3 x 3 wypelniona zerami (wartosc podstawowa)

        macierz = new double[3][3];

        wiersze = 3;
        kolumny = 3;
    }

    public Macierz(int wiersze, int kolumny) { //tworzy macierz m x n wypelniona zerami (wartosc podstawowa)

        this.wiersze = wiersze;
        this.kolumny = kolumny;

        macierz = new double[wiersze][kolumny];

    }

    public void wypelnianie_macierzy(double[] tablica_liczb_uzytkownika) { //wypelnia macierz numerami z tablicy, która wypelnia uzytkownik

        if (tablica_liczb_uzytkownika.length == ((macierz.length) * (macierz[0].length))) { //musi starczyc liczb aby wypelnic macierz!

            int iterator = 0;

            for (int i = 0; i < macierz.length; i++) {
                for (int j = 0; j < macierz[i].length; j++) {
                    macierz[i][j] = tablica_liczb_uzytkownika[iterator];

                    iterator++;
                }
            }
        } else System.out.println("Uzytkownik podal zla ilosc liczb! Macierz zostaje zerowa!");
    }

    public void wypisz_macierz() {

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.print(macierz[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    public int get_wiersze() {

        return wiersze;
    }

    public int get_kolumny() {

        return kolumny;
    }

    public double get_element(int w, int k) {

        return macierz[w][k];
    }

    public void setadd_element(int w, int k, double wartosc) {

        macierz[w][k] += wartosc;
    }


    public static void mnozenie_macierzy(Macierz a, Macierz b) { //tworzy macierz c (jezeli to mozliwe) o odpowednich wymiarach i liczy jej elementy

        if (a.get_kolumny() != b.get_wiersze()) System.out.println("Tych macierzy nie da sie pomnozyc!");
        else {
            Macierz c = new Macierz(a.get_wiersze(), b.get_kolumny());

            for (int i = 0; i < a.get_wiersze(); i++) {
                for (int j = 0; j < b.get_kolumny(); j++) {
                    for (int k = 0; k < b.get_wiersze(); k++) {
                        c.setadd_element(i, j, a.get_element(i, k) * b.get_element(k, j));
                    }
                }
            }
            c.wypisz_macierz();
        }

    }
}

public class Main {

    public static void main(String[] args) {

        Macierz a = new Macierz(2, 3);
        Macierz b = new Macierz(3, 4);

        double[] taba = {1, 2, 0, 1, 3, 3};

        double[] tabb = {0, 3, 2, 1, 1, 6, 4, 1, 1, 2, 0, 1};


        System.out.println("Macierz A:");
        a.wypelnianie_macierzy(taba);
        a.wypisz_macierz();

        System.out.println("\nMacierz B:");
        b.wypelnianie_macierzy(tabb);
        b.wypisz_macierz();

        System.out.println("\nWynik mnozenia macierzy:");
        Macierz.mnozenie_macierzy(a, b);
    }
}
