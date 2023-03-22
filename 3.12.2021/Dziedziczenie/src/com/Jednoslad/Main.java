package com.Jednoslad;

import com.Jednoslad.Bezsilnikowe.*;
import com.Jednoslad.Motocykl.*;


public class Main {

    public static void main(String[] args) {

        Jednoslad[] tab = new Jednoslad[2];

        Cylinder[] silnik = new Cylinder[2];

        for(int i=0;i<silnik.length;i++){
            silnik[i]=new Cylinder(2,175);
        }

        tab[0] = new Motocykl("IFA 350BK Touring", "Biala", false, silnik);
        tab[0].jedz();
        tab[0].get_stan();
        tab[0].lakiernik("Czarna");
        tab[0].jedz();
        tab[0].hamuj();

        Cylinder[] silnik2 = new Cylinder[1];
        for(int i=0;i<silnik2.length;i++){
            silnik2[i]=new Cylinder(175,2);
        }


        Motocykl motocykl2 = new Motocykl("Romet Chart", "Niebieski", false, null);
        motocykl2.dzwiek_silnika();
        motocykl2.zmien_silnik(silnik2);
        motocykl2.dzwiek_silnika();


        tab[1] = new Rower();
        tab[1].get_stan();
        ((Rower) tab[1]).pedaluj();


        Bezsilnikowe monocykl1 = new Monocykl("Qu-ax Profi", "Żółty", true, "Freestyle");

        monocykl1.get_stan();
        ((Monocykl) monocykl1).triki();
        monocykl1.get_stan();
        monocykl1.napraw_jednoslad_bezsilnikowy();


    }
}
