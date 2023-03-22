package com.company;

public class Macierz {

        private int wiersze;
        private int kolumny;

        private int[][] macierz;

        public Macierz() { //tworzy macierz 3 x 3 wypelniona zerami (wartosc podstawowa)

            macierz = new int[3][3];

            wiersze = 3;
            kolumny = 3;
        }

        public Macierz(int wiersze, int kolumny) { //tworzy macierz m x n wypelniona zerami (wartosc podstawowa)

            this.wiersze = wiersze;
            this.kolumny = kolumny;

            macierz = new int[wiersze][kolumny];

        }

        public void wypelnianie_macierzy(int[] tablica_liczb_uzytkownika) { //wypelnia macierz numerami z tablicy, która wypelnia uzytkownik

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
                    System.out.print(macierz[i][j] +"\t");
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

        public int get_element(int w, int k){
            return macierz[w][k];
        }

        public void set_element(int w, int k, double wartosc) {

            this.macierz[w][k] = (int)wartosc;
        }

}
