package Biblioteka;

public class EX {

    public static double e_potega_x(int n, int x) {
        int k = 1;
        double suma = 1, temp = 1;

        while (k <= n) {
            temp *= ((double) x / (double) k);
            suma += temp;

            k++;
        }

        return suma;
    }
}
