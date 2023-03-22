package Biblioteka;

public class SinX {

    public static double sinx(int n, int x) {

        double k = 1;
        double suma = x;
        double temp = x; //inny sposób uzyskania licznik/mianownik

        while (k <= n) {
            temp *= (x * x * (-1)) / ((2 * k) * (2 * k + 1));
            suma = suma + temp;

            k++;
        }

        return (suma);
    }
}
