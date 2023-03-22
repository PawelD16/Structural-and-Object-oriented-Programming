package com.Jednoslad;

abstract public class Jednoslad {

    private boolean czy_brudny;
    private String kolor;
    private int ilosc_kol;
    private String model;
    private boolean czy_jedzie = false;
    private boolean czy_stoi = true;
    private int stan_ogumienia = (int) (Math.random() * 100);

    public Jednoslad() {

        this.czy_brudny = false;
        this.ilosc_kol = 2;
        this.model = "Wigry 3";
        this.kolor = "Czerwony";
    }

    public Jednoslad(String model, String kolor, int ilosc_kol, boolean czy_brudny) {

        this.czy_brudny = czy_brudny;
        this.ilosc_kol = ilosc_kol;
        this.model = model;
        this.kolor = kolor;
    }

    public void jedz() {
        if (czy_jedzie) System.out.println(this.kolor + " " + this.model + " nadal jedzie!\n");
        else {
            System.out.println(this.kolor + " " + this.model + " ruszyl!\n");
            czy_jedzie = true;
            czy_stoi = false;
        }
    }

    public void hamuj() {
        if (czy_stoi) System.out.println(this.kolor + " " + this.model + " juz stoi!\n");
        else {
            System.out.println(this.kolor + " " + this.model + " hamuje!\n");
            czy_stoi = true;
            czy_jedzie = false;
        }
    }

    public void set_czy_brudny(boolean czy_brudny) {
        this.czy_brudny = czy_brudny;
    }

    public boolean get_czy_brudny() {
        return czy_brudny;
    }

    public String get_model() {
        return model;
    }

    public int get_ilosc_kol() {
        return ilosc_kol;
    }

    public String get_kolor() {
        return kolor;
    }

    public void set_kolor(String kolor) {
        this.kolor = kolor;
    }

    public void get_stan() {
        System.out.println("\nModel: " + model);
        System.out.println("Kolor: " + kolor);
        System.out.println("Stan ogumienia: "+stan_ogumienia+"%");
    }

    public int get_stan_ogumenia() {
        return stan_ogumienia;
    }

    public void set_stan_ogumenia(int stan_ogumienia) {
        this.stan_ogumienia = stan_ogumienia;
    }

    public void lakiernik(String kolor) {
        Mechanik.lakierowanie(this, kolor);
    }


}
