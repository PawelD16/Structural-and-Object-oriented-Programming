package com.company.Interakcja;

import com.company.Osoby.*;
import java.util.ArrayList;

public abstract class WypisywaczInformacji {

    private final static String[] listaStwarzalnychKlas = {"Student", "Pracownik Uczelni Naukowo-Dydaktyczny", "Inny pracownik uczelni"};

    public static void komunikatyMenuGlownego() {
        System.out.println("\n\nMenu glowne: ");
        System.out.println("1 : Wyświelt informacje o wszystkich");
        System.out.println("2 : Wyszukaj po nazwisku");
        System.out.println("3 : Wyszukaj studenta po numerze indeksu");
        System.out.println("4 : Wyszukaj pracownika naukowo-dydaktycznego po wartości dorobku");
        System.out.println("5 : Wyszukaj pracownika administracyjnego po stanowisku");
        System.out.println("6 : Dodaj osoby");
        System.out.println("7 : Dodaj i przypisz kursy");
        System.out.println("0 : Wyjście");
    }

    public static void komunikatyOsobyDoWyboru() {
        System.out.println("Prosze wybrac osobe do dodania:");
        for (int i = 0; i < listaStwarzalnychKlas.length; i++) {
            System.out.println((i + 1) + " : " + listaStwarzalnychKlas[i]);
        }
        System.out.println("0 : Powrót");
    }

    public static void wypiszWszystkich(ArrayList<Osoba> listaOsob) {
        for (int i = 0; i < listaOsob.size(); i++) {
            System.out.println("\n\n" + listaOsob.get(i));
        }
    }

    public static void wypiszPoNazwisku(ArrayList<Osoba> listaOsob, String podaneNazwisko) {

        for (int i = 0; i < listaOsob.size(); i++) {
            if ((listaOsob.get(i)).getNazwisko().equals(podaneNazwisko))
                System.out.println("\n\n" + listaOsob.get(i));
        }
    }

    public static void wypiszPoIndeksie(ArrayList<Osoba> listaOsob, String indeks) {
        for (int i = 0; i < listaOsob.size(); i++) {
            if (listaOsob.get(i) instanceof Student && ((Student) listaOsob.get(i)).getIndeks().equals(indeks))
                System.out.println("\n\n" + listaOsob.get(i));
        }
    }

    public static void wypiszPoDorobku(ArrayList<Osoba> listaOsob, String dorobek) {
        int dorobekInt;

        try{
            dorobekInt=Integer.parseInt(dorobek);
        }
        catch (Exception e){
            dorobekInt=-1;
        }

        for (int i = 0; i < listaOsob.size(); i++) {
            if (listaOsob.get(i) instanceof PracownikUczelni_NaukowoDydaktyczny && (((PracownikUczelni_NaukowoDydaktyczny) listaOsob.get(i)).getDorobek()) == dorobekInt)
                System.out.println("\n\n" + listaOsob.get(i));
        }
    }

    public static void wypiszPoStanowisku(ArrayList<Osoba> listaOsob, String stanowisko) {
        for (int i = 0; i < listaOsob.size(); i++) {
            if (listaOsob.get(i) instanceof PracownikUczelni && (((PracownikUczelni) listaOsob.get(i)).getStanowisko()).equals(stanowisko))
                System.out.println("\n\n" + listaOsob.get(i));
        }
    }
}
