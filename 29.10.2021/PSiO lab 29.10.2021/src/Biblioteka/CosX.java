package Biblioteka;

public class CosX {

    public static double cosx(int n, int x) {

        double suma = 1;
        double licznik = 1, mianownik = 1;
        int k = 1;

        while (k <= n) {

            licznik *= x * x * (-1);
            mianownik *= (2 * k - 1) * (2 * k);
            suma += licznik / mianownik;

            k++;
        }

        return suma;
    }
}
