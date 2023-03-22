package com.company;

import java.io.Serializable;

public class Kursy implements Serializable {
    private static final long serialVersionUID = 8294360561149107154L;
    private int iloscGodzin;
    private String nazwaKursu;

    public Kursy() {
        this.iloscGodzin = 0;
        this.nazwaKursu="Brak informacji";
    }

    public Kursy(String nazwaKursu, String iloscGodzin) {
        this.nazwaKursu = nazwaKursu;
        this.iloscGodzin = Integer.parseInt(iloscGodzin);
    }

    public static String getDaneDoWpisania(){
        return "Nazwa kursu:,Ilosc godzin:";
    }

    @Override
    public String toString() {
        return  "\nNazwa kursu: " + nazwaKursu + "\nIlość godzin: " + iloscGodzin;
    }
}
