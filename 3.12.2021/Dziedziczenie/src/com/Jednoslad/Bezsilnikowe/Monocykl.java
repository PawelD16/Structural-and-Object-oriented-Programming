package com.Jednoslad.Bezsilnikowe;

public class Monocykl extends Bezsilnikowe {

    private String przeznaczenie;

    public Monocykl() {
        super("Qu-ax Luxus ", "Biały", 1, false);
        this.przeznaczenie = "dla poczatkujacych";
    }

    public Monocykl(String model, String kolor, boolean czy_brudny, String przeznaczenie) {
        super(model, kolor, 1, czy_brudny);
        this.przeznaczenie = przeznaczenie;
    }

    public void get_stan() {
        super.get_stan();
        System.out.println("Przeznaczenie monocykla: " + przeznaczenie);
    }

    public void triki() {
        this.set_czy_brudny(true);
        this.set_stan_ogumenia(0);
        System.out.println("\nTeraz przyda sie mechanik!");
    }
}
