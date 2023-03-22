package com.company;

import com.company.Interakcja.MenuGlowne;
import com.company.Osoby.Osoba;
import com.company.Osoby.PracownikUczelni;
import com.company.Osoby.PracownikUczelni_NaukowoDydaktyczny;
import com.company.Osoby.Student;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList<Osoba> listaOsob = new ArrayList();
        ArrayList<Osoba> listaOsob = Serializacja.odczytajElementy();
        /*
        Student st1 = new Student("Paweł", "Dudek", "02262700119", "Informatyka Stosowana", "266513", "1");
        PracownikUczelni_NaukowoDydaktyczny pund1 = new PracownikUczelni_NaukowoDydaktyczny("Ziemowit", "Oko", "68120112123", "25", "150");
        PracownikUczelni pu1 = new PracownikUczelni("Joanna", "Oko", "95102212340", "7", "Kierownik dzialu administracyjnego");
        listaOsob.add(st1);
        listaOsob.add(pund1);
        listaOsob.add(pu1);
        */
        MenuGlowne.doDziela(listaOsob);
        Serializacja.zapiszElementy(listaOsob);
    }
}
