package com.company;

public class Platanie {
    public static Macierz platanie(Macierz a, Macierz b) { //macierz A to macierz, którą plączemy przy uzyciu macierzy B

        Macierz c = new Macierz(a.get_wiersze(), a.get_kolumny());
        double srednia, wagi;   //kod dziala tak, ze uwzglednia juz wartosci po modyfikacji wartosci poprzedzajacych! osobny kod to macierz c

        int bx = (b.get_wiersze() - 1) / 2;
        int by = (b.get_kolumny() - 1) / 2;
        int x;

        for (int i = 0; i < a.get_wiersze(); i++) {
            for (int j = 0; j < a.get_kolumny(); j++) {

                srednia = 0;
                wagi = 0;
                x = a.get_element((i), (j));

                for (int k = 0; k < b.get_wiersze(); k++) {
                    if ((i - bx < 0) || (i + bx >= a.get_wiersze())) {
                        c.set_element(i,j,a.get_element(i,j));
                        break;
                    }
                    if ((j - by < 0) || (j + by >= a.get_kolumny())) {
                        c.set_element(i,j,a.get_element(i,j));
                        break;
                    }
                    for (int l = 0; l < b.get_kolumny(); l++) {
                        if(bx==k && bx==l) srednia+=x*b.get_element(k, l);
                        else srednia += b.get_element(k, l) * a.get_element((i - bx + k), (j - by + l));
                        wagi += b.get_element(k, l);
                    }
                    //a.set_element(i, j, srednia / wagi);
                    c.set_element(i, j, srednia / wagi);
                }
            }
        }
        return c;
    }
}
