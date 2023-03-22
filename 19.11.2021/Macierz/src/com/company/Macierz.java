package com.company;

class Macierz {

    private int wiersze;
    private int kolumny;

    private int[][] macierz;


    public Macierz() {
        macierz = new int[5][5];

        wiersze = 5;
        kolumny = 5;
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
            System.out.print("|");
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.print(macierz[i][j] + "  ");
            }
            System.out.print("|\n");
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


    public void wypisz_relacje() {

        int[][] tab = new int[25][2];
        int iterator = 0;

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                if (macierz[i][j] == 1) {
                    tab[iterator][0] = i + 1;
                    tab[iterator][1] = j + 1;

                    iterator++;
                }
            }
        }

        System.out.print("Relacja = {");

        for (int i = 0; i < iterator; i++) {

            System.out.print("<" + tab[i][0] + ";" + tab[i][1] + ">,");
        }
        System.out.print("}");

    }



    public void wlasnosci(){

        //zwrotnosc
        int sprawdzanie, czy_zwrotne=1, suma=0;

        for(int i=0;i< macierz.length;i++){
            sprawdzanie=0;
            for(int j=0;j<macierz[i].length;j++){
                if(macierz[i][j]==1 || macierz [j][i]==1) {
                    sprawdzanie++;
                    suma++;
                }
            }
            if(!(sprawdzanie==0 || macierz[i][i]==1) || suma==0) czy_zwrotne=0;
        }
        if(czy_zwrotne==1) System.out.println("\nRelacja jest zwrotna!");
        else System.out.println("\nRelacja nie jest zwrotna!");

        //przeciwzwrotnosc
        int czy_przeciwzwrotne=1;

        for(int i=0;i< macierz.length;i++){
            if(macierz[i][i]==1) {
                czy_przeciwzwrotne = 0;
                break;
            }
        }

        if(czy_przeciwzwrotne==1) System.out.println("\nRelacja jest przeciwzwrotna!");
        else System.out.println("\nRelacja nie jest przeciwzwrotna!");


        //symetria
        int czy_symetryczne=1;

        for(int i=0;i< macierz.length;i++){

            for(int j=0;j<macierz[i].length;j++){
                if(!(macierz[i][j]==macierz [j][i])) {
                    czy_symetryczne=0;
                    break;
                }
            }
        }
        if(czy_symetryczne==1) System.out.println("\nRelacja jest symetryczna!");
        else System.out.println("\nRelacja nie jest symetryczna!");

        //przeciwsymetria
        int czy_przeciwsymetryczne=1;

        for(int i=0;i< macierz.length;i++){

            for(int j=0;j<macierz[i].length;j++){
                if(i==j && macierz [i][i]==1) czy_przeciwsymetryczne=0;
                if(i!=j && (macierz[i][j]==1 && macierz [j][i]==1)) czy_przeciwsymetryczne=0;
            }
        }
        if(czy_przeciwsymetryczne==1) System.out.println("\nRelacja jest przeciwsymetryczna!");
        else System.out.println("\nRelacja nie jest przeciwsymetryczna!");
    }

}
