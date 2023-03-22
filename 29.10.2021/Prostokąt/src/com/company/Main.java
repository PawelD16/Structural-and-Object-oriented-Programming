package com.company;

class Punkt {

    private double x, y;

    public Punkt() {
        x = 1;
        y = 1;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double get_y() {
        return y;
    }

    public double get_x() {
        return x;
    }
}

class Prostokat {

    private static int licznik = 1; //liczenie ilości prostokątów

    private Punkt a;
    private Punkt b;

    private double x, y; //długości boków prostokąta

    private int numer = licznik; //przypisywanie prostokątowi jego numeru

    public Prostokat() { //konstruktor domyślny

        a = new Punkt();
        b = new Punkt(2, 2);

        boki();
        licznik++;
    }

    public Prostokat(double ax, double ay, double bx, double by) { //konstruktor przeciążony

        a = new Punkt(ax, ay);
        b = new Punkt(bx, by);

        boki();
        licznik++;
    }

    private void boki() {

        x = Math.abs(a.get_x() - b.get_x());
        y = Math.abs(a.get_y() - b.get_y());
    }


    public void przekatna() { //metoda wyznacza przekątną prostokąta

        System.out.println("Przekątna prostokąta ma dlugosc: " + Math.sqrt(x * x + y * y));
    }

    public void pole() { //metoda wyznacza pole prostokąta

        System.out.println("Pole prostokąta to: " + x * y);
    }

    public void obwod() { //metoda wyznacza obwód prostokąta

        System.out.println("Obwód prostokąta to: " + (2 * x + 2 * y));
    }

    //Gettery
    //______________________________________
    public int get_numer() { //stała licznik mogłaby przypisać tym samym prostokątom ten sam numer, zależnie od kolejności tworzenia obiektów
        return numer;
    }

    public void get_punkty() { //drukowanie współrzędnych punktów A i B

        System.out.print("A(" + a.get_x() + ",");
        System.out.println(a.get_y() + ")");
        System.out.print("B(" + b.get_x() + ",");
        System.out.println(b.get_y() + ")");
    }
    //______________________________________

}

class Kolo {

    private Punkt s; //punkt środka kola
    private double r; //promień kola

    public Kolo() {
        s = new Punkt();
        r = 1;
    }

    public Kolo(double x, double y, double r) {
        s = new Punkt(x, y);
        this.r = r;
    }

    public void get_srodek() {
        System.out.print("Srodek okręgu znajduje się w punkcie: (" + s.get_x());
        System.out.print("," + s.get_y());
        System.out.println(")");
    }

    public void polekola() {
        System.out.println("Pole koła to: " + Math.PI * r * r);
    }

    public void obwodokregu() {
        System.out.println("Promien okregu to: " + Math.PI * 2 * r);
    }

    public double get_promien() {
        return r;
    }

    public void get_cwiartka() {
        if (s.get_x() > 0 && s.get_y() > 0) System.out.println("Srodek okręgu leży w 1 ćwiartce");

        else if (s.get_x() < 0 && s.get_y() > 0) System.out.println("Srodek okręgu leży w 2 ćwiartce");

        else if (s.get_x() < 0 && s.get_y() < 0) System.out.println("Srodek okręgu leży w 3 ćwiartce");

        else if (s.get_x() > 0 && s.get_y() < 0) System.out.println("Srodek okręgu leży w 4 ćwiartce");
        else System.out.println("Srodek nie lezy w zadnej cwiartce");
    }
}


public class Main {

    public static void main(String[] args) {

        double ax = 5, ay = 4;
        double bx = 2, by = 1;
        Prostokat p1;

        if ((ax - bx) == 0 || (ay - by) == 0) {

            p1 = new Prostokat();
        } else p1 = new Prostokat(ax, ay, bx, by);


        System.out.println("Prostokąt nr." + p1.get_numer() + ": ");

        p1.get_punkty();
        p1.pole();
        p1.przekatna();
        p1.obwod();


        double sx = 2, sy = 3;
        double r = 5;
        Kolo s1;

        if (r == 0) {

            s1 = new Kolo();
        } else s1 = new Kolo(sx, sy, r);


        System.out.println("Koło: ");
        s1.get_cwiartka();
        s1.get_srodek();
        s1.obwodokregu();
        s1.polekola();
    }
}
