package com.company.Interakcja;

import com.company.Kursy;
import com.company.Osoby.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AsystentKreacji {

    private final static String[] daneDlaKlas = {Student.getDaneDoWpisania(), PracownikUczelni_NaukowoDydaktyczny.getDaneDoWpisania(), PracownikUczelni.getDaneDoWpisania()};

    public static void wpiszNowaOsobe(ArrayList<Osoba> listaOsob) {

        int Opcja;
        String[] dane;
        @SuppressWarnings("resource")
        Scanner czytnik = new Scanner(System.in);
        WypisywaczInformacji.komunikatyOsobyDoWyboru();
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
                        dane = AsystentKreacji.czytajDaneDoTworzeniaOsob(1);
                        listaOsob.add(new Student(dane[0], dane[1], dane[2], dane[3], dane[4], dane[5]));
                        break;
                    case 2:
                        dane = AsystentKreacji.czytajDaneDoTworzeniaOsob(2);
                        listaOsob.add(new PracownikUczelni_NaukowoDydaktyczny(dane[0], dane[1], dane[2], dane[3], dane[4]));
                        break;

                    case 3:
                        dane = AsystentKreacji.czytajDaneDoTworzeniaOsob(3);
                        listaOsob.add(new PracownikUczelni(dane[0], dane[1], dane[2], dane[3], dane[4]));
                        break;

                    default: {
                        System.out.println("Niepoprawny wybór");
                        break;
                    }

                }
            } else {
                System.out.println("Powrót do poprzedniego menu");
                break;
            }
            WypisywaczInformacji.komunikatyOsobyDoWyboru();
        }
    }

    public static void wpiszNowyKurs(ArrayList<Osoba> listaOsob){

        int wybor = AsystentKreacji.czytajKomuDodacKurs(listaOsob);
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj kurs do dodania");
        String[] tokeny = Kursy.getDaneDoWpisania().split(",");
        String[] dane = new String[tokeny.length];

        for(int i=0;i< tokeny.length;i++){
            System.out.println(tokeny[i]);
            dane[i]=czytnik.nextLine();
        }
        ((MaKursy)listaOsob.get(wybor)).zapisyNaKursy(new Kursy(dane[0],dane[1]));
    }

    public static String[] czytajDaneDoTworzeniaOsob(int wybor) {
        String[] tokeny = daneDlaKlas[wybor - 1].split(",");
        String[] dane = new String[tokeny.length];
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj dane:");
        for (int i = 0; i < tokeny.length; i++) {
            System.out.print(tokeny[i]);
            dane[i]=czytnik.nextLine();
        }
        return dane;
    }

    public static int czytajKomuDodacKurs(ArrayList<Osoba> listaOsob){
        Scanner czytnik = new Scanner(System.in);

        System.out.println("Osoba, której dodany zostanie kurs:");
        for (int i = 0; i < listaOsob.size(); i++) {
            if(listaOsob.get(i) instanceof MaKursy) System.out.println("\n\n"+i+":\n" + listaOsob.get(i));
        }
        return czytnik.nextInt();
    }

}
