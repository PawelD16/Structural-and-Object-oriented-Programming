package com.company.Osoby;

public abstract class Pracownik extends Osoba{

    private int lataDoswiadczenia;

    public Pracownik(){
        super();
        this.lataDoswiadczenia=0;
    }

    public Pracownik(String imie, String nazwisko, String PESEL, int lataDoswiadczenia) {
        super(imie, nazwisko, PESEL);
        this.lataDoswiadczenia = lataDoswiadczenia;

    }

    @Override
    public String toString() {

        return super.toString() + "\nLata doswiadczenia: " + lataDoswiadczenia;
    }
}
