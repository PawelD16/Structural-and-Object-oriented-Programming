package com.Jednoslad.Bezsilnikowe;

public class Rower extends Bezsilnikowe {

    private String rodzaj_rowera;
    int ilosc_kol = 2;

    public Rower() {
        super();
        this.rodzaj_rowera = "Miejski";
    }

    public Rower(String model, String kolor, boolean czy_brudny, boolean czy_skladany, String rodzaj_rowera) {
        super(model, kolor, 2, czy_brudny);

        this.rodzaj_rowera = rodzaj_rowera;
    }

    public void get_stan() {
        super.get_stan();
        System.out.print("Rodzaj rowera: " + rodzaj_rowera);
    }

    public void pedaluj(){
        System.out.println("\nNie latwo przyspieszac na rowerze!");
    }

}
