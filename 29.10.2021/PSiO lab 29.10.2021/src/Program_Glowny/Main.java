package Program_Glowny;

import static Biblioteka.CosX.cosx;
import static Biblioteka.EX.e_potega_x;
import static Biblioteka.SinX.sinx;


public class Main {


    public static void main(String[] args) {

        int x = 5, n = 15; //x-zmienna do funkcji cosx i sinx oraz e^x(n-dokladnosc funkcji sinx)
        int podstawa = 2, wykladnik = 10;// zmienne do potęgi
        int liczba = 6; //zmienna do silni


        System.out.println("sin(" + x + ") = " + sinx(n, x)); //drukowanie wyniku sin(x)

        System.out.println("cos(" + x + ") = " + cosx(n, x));//drukowanie wyniku cos(x)

        System.out.println("e^" + x + " = " + e_potega_x(n, x));//drukowanie wyniku e^x!

        /*
        System.out.println("Silnia liczby " + liczba + " to: " + Funkcje.silnia(liczba));//drukowanie wyniku liczba!

        if(Funkcje.potega(podstawa, wykladnik)==0)
        System.out.println("To równanie nie ma wyniku!"); //0^0 nie jest wykonywalne!

        else System.out.println("Potęga o podstawie " + podstawa + " i wykładniku " + wykladnik + " ma wartość: " + Funkcje.potega(podstawa, wykladnik));
        */


    }
}
