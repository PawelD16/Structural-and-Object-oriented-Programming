package com.company.Osoby;

public class PracownikUczelni extends Pracownik {

    private static final long serialVersionUID = -2192468678253558709L;
    private String stanowisko;

    public PracownikUczelni() {
        super();
        this.stanowisko = "Brak infoamcji";
    }

    public PracownikUczelni(String imie, String nazwisko, String PESEL, String lataDoswiadcznenia, String stanowisko) {
        super(imie, nazwisko, PESEL, Integer.parseInt(lataDoswiadcznenia));
        this.stanowisko = stanowisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public static String getDaneDoWpisania(){
        return "Imie:,Nazwisko:,PESEL:,Lata doświadczenia:,Stanowisko:";
    }

    @Override
    public String toString() {
        return super.toString() + "\nStanowisko: " + stanowisko;
    }

}
