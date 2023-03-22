package com.Jednoslad.Motocykl;

public class Cylinder {
    private int ilosc_suwow;
    private int pojemnosc;

    public Cylinder() {
        this.ilosc_suwow = 4;
        this.pojemnosc = 175;
    }

    public Cylinder(int ilosc_suwow, int pojemnosc) {

        this.ilosc_suwow = ilosc_suwow;
        this.pojemnosc = pojemnosc;
    }

    public int get_ilosc_suwow(){
        return ilosc_suwow;
    }

    public int get_pojemnosc(){
        return pojemnosc;
    }

}
