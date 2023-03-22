package com.company.Osoby;

import com.company.Kursy;

import java.util.ArrayList;

public class PracownikUczelni_NaukowoDydaktyczny extends Pracownik implements MaKursy{

    private static final long serialVersionUID = -4698331784065331651L;
    private ArrayList<Kursy> prowadzoneKursy;
    private int wartoscDorobku;

    public PracownikUczelni_NaukowoDydaktyczny(){
        super();
        this.prowadzoneKursy=new ArrayList<>();
        this.wartoscDorobku=0;
    }

    public PracownikUczelni_NaukowoDydaktyczny(String imie, String nazwisko, String PESEL, int lataDoswiadczenia, int wartoscDorobku, ArrayList<Kursy> prowadzoneKursy) {
        super(imie, nazwisko, PESEL, lataDoswiadczenia);
        this.prowadzoneKursy = prowadzoneKursy;
        this.wartoscDorobku = wartoscDorobku;
    }

    public PracownikUczelni_NaukowoDydaktyczny(String imie, String nazwisko, String PESEL, String lataDoswiadczenia, String wartoscDorobku) {
        super(imie, nazwisko, PESEL, Integer.parseInt(lataDoswiadczenia));
        this.prowadzoneKursy = new ArrayList<>();
        this.wartoscDorobku = Integer.parseInt(wartoscDorobku);

    }

    public int getDorobek() {
        return wartoscDorobku;
    }

    public static String getDaneDoWpisania(){
        return "Imie:,Nazwisko:,PESEL:,Lata doświadczenia:,Wartość dorobku naukowego:";
    }

    public void zapisyNaKursy(Kursy kurs) {
        prowadzoneKursy.add(kurs);
    }

    @Override
    public String toString() {
        return super.toString() + "\nWartosc dorobku: " + wartoscDorobku + "\nProwadzone kursy : " + prowadzoneKursy;
    }
}
