package com.company.Osoby;

import com.company.Kursy;
import java.util.ArrayList;

public class Student extends Osoba implements MaKursy{

    private static final long serialVersionUID = 2635326096052072598L;
    private String kierunek;
    private String indeks;
    private int ktorySemestr;
    private ArrayList<Kursy> kursy;

public Student(){
    super();
    this.indeks = "000000";
    this.kierunek = "Brak informacji";
    this.ktorySemestr = 0;
    this.kursy = new ArrayList<>();
}
    public Student(String imie, String nazwisko, String PESEL, String kierunek, String indeks, int ktorySemestr, ArrayList<Kursy> kursy) {
        super(imie, nazwisko, PESEL);
        this.indeks = indeks;
        this.kierunek = kierunek;
        this.ktorySemestr = ktorySemestr;
        this.kursy = kursy;
    }

    public Student(String imie, String nazwisko, String PESEL, String kierunek, String indeks, String ktorySemestr) {
        super(imie, nazwisko, PESEL);
        this.indeks = indeks;
        this.kierunek = kierunek;
        this.ktorySemestr = Integer.parseInt(ktorySemestr);
        this.kursy = new ArrayList<>();
    }

    public void zapisyNaKursy(Kursy kurs) {
        this.kursy.add(kurs);
    }

    @Override
    public String toString() {
        return super.toString() + "\nKierunek:" + kierunek + "\nSemestr:" + ktorySemestr + "\nIndeks:" + indeks + "\nLista kursow: " + kursy;
    }

    //Gettery
    public String getIndeks() {
        return indeks;
    }

    public static String getDaneDoWpisania(){
    return "Imie:,Nazwisko:,PESEL:,kierunek:,indeks:,Numer semestru:";
    }

}
