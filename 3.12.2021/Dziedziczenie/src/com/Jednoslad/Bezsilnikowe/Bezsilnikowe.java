package com.Jednoslad.Bezsilnikowe;

import com.Jednoslad.*;

abstract public class Bezsilnikowe extends Jednoslad {

    public Bezsilnikowe() {
        super();
    }

    public Bezsilnikowe(String model, String kolor, int ilosc_kol, boolean czy_brudny) {
        super(model, kolor, ilosc_kol, czy_brudny);
    }

    public void napraw_jednoslad_bezsilnikowy() {
        Mechanik.mycie(this);
        Mechanik.wymianaOgumienia(this);
    }

}
