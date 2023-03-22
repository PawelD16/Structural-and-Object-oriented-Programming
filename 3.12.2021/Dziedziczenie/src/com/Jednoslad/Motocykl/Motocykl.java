package com.Jednoslad.Motocykl;

import com.Jednoslad.*;

public class Motocykl extends Jednoslad {

    private Cylinder[] silnik;

    public Motocykl() {
        super("Yamaha MT07", "Biała", 2, false);
        this.silnik = new Cylinder[2];
    }

    public Motocykl(String model, String kolor, boolean czy_brudny, Cylinder[] silnik) {
        super(model, kolor, 2, czy_brudny);
        this.silnik = silnik;
    }

    public void get_stan() {
        super.get_stan();
        int x=0;
        for(int i=0;i< silnik.length;i++){
            x+=silnik[i].get_pojemnosc();
        }

        System.out.print("Silnik: " + silnik.length + " cylindorwy, " + silnik[0].get_ilosc_suwow() + " suw");
        System.out.println(" o pojemnosci " + x + "cc");
    }


    public void zmien_silnik(Cylinder[] silnik) {
        this.silnik = silnik;
    }

    public void dzwiek_silnika() {
        if (silnik != null) System.out.println("Brum, Brum");
        else System.out.println("Ten motocykl nie ma silnika!");
    }


}
