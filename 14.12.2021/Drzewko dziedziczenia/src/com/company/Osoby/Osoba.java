package com.company.Osoby;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    private String imie;
    private String nazwisko;
    private String PESEL;
    private String plec;
    private String dataUrodzenia;

    public Osoba(){
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.PESEL = "00000000000";
        this.znajdzDateUrodzin(PESEL);
    }

    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        if(PESEL.length()==11) this.PESEL = PESEL;
        else {
            this.PESEL = "00000000000";
            System.out.println("Numer PESEL ma niepoprawną dlugość!, przypisano same zera!");
        }
        this.znajdzDateUrodzin(this.PESEL);
    }

    private void znajdzDateUrodzin(String PESEL) {
        int rokUrodzenia = 1900 + Integer.parseInt(PESEL.substring(0, 2));
        int miesiacUrodzenia = Integer.parseInt(PESEL.substring(2, 4));
        int dzienUrodzenia = Integer.parseInt(PESEL.substring(4, 6));
        int oznaczeniePlci = Integer.parseInt(PESEL.substring(10, 11));
        int iterator = 0;

        while (miesiacUrodzenia > 12) { //osoby urodzone do 2000 maja normalnie miesiace, osoby urodzone: 2000–2099 – dodajemy 20,2100–2199 – dodamy 40,2200–2299 – dodamy 60.
            miesiacUrodzenia -= 20;
            iterator++;
        }

        for (int i = 0; i < iterator; i++) { //dodawanie odpowiedniej ilosci lat, aby miec dobrą datę urodzenia
            rokUrodzenia += 100;
        }

        if (oznaczeniePlci % 2 == 0) this.plec = "Kobieta"; //liczby parzyste na 10 miejscu nr. PESEL oznaczają kobietę
        else this.plec = "Mężczyzna";

        this.dataUrodzenia = dzienUrodzenia + "-" + miesiacUrodzenia + "-" + rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "\nImie:" + imie + "\nNazwisko:" + nazwisko + "\nData urodzenia: " + dataUrodzenia;
    }


}
