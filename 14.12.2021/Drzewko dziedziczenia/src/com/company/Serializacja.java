package com.company;

import com.company.Osoby.Osoba;
import java.io.*;
import java.util.ArrayList;

public abstract class Serializacja {
    public static void zapiszElementy(ArrayList<Osoba> listaOsob) {
        try (ObjectOutputStream so = new ObjectOutputStream(new FileOutputStream("ListaOsob.ser"))) {
            so.writeObject(listaOsob);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public static ArrayList<Osoba> odczytajElementy() {
            ArrayList<Osoba> listaOsob;

            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("ListaOsob.ser"))) {
                listaOsob = (ArrayList<Osoba>) is.readObject();
                return listaOsob;

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }

    }

