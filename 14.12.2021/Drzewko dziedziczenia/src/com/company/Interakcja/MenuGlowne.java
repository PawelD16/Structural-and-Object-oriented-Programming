package com.company.Interakcja;

import com.company.Osoby.Osoba;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuGlowne {

    public static void doDziela(ArrayList<Osoba> listaOsob) {

        int Opcja;
        @SuppressWarnings("resource")
        Scanner czytnik = new Scanner(System.in);
        WypisywaczInformacji.komunikatyMenuGlownego();
        while (czytnik.hasNext()) {

            try {
                Opcja = czytnik.nextInt();
            } catch (Exception e) {
                //e.printStackTrace();
                Opcja = -1;
            }

            czytnik.nextLine();
            if (Opcja != 0) {
                switch (Opcja) {
                    case 1:
                        WypisywaczInformacji.wypiszWszystkich(listaOsob);
                        break;
                    case 2:
                        System.out.println("Prosze podac nazwisko: ");
                        WypisywaczInformacji.wypiszPoNazwisku(listaOsob, czytnik.next());
                        break;

                    case 3:
                        System.out.println("Prosze podac numer indeksu: ");
                        WypisywaczInformacji.wypiszPoIndeksie(listaOsob, czytnik.next());
                        break;
                    case 4:
                        System.out.println("Prosze podac dorobek: ");
                        WypisywaczInformacji.wypiszPoDorobku(listaOsob, czytnik.next());
                        break;
                    case 5:
                        System.out.println("Prosze podac stanowisko: ");
                        WypisywaczInformacji.wypiszPoStanowisku(listaOsob, czytnik.nextLine());
                        break;
                    case 6:
                        AsystentKreacji.wpiszNowaOsobe(listaOsob);
                        break;
                    case 7:
                        AsystentKreacji.wpiszNowyKurs(listaOsob);
                        break;
                    default: {
                        System.out.println("Niepoprawny wybór");
                        break;
                    }

                }
            } else {
                System.out.println("Do widzenia!");
                break;
            }
            WypisywaczInformacji.komunikatyMenuGlownego();
        }
    }


}
