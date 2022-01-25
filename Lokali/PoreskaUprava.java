package Lokali_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PoreskaUprava {
    private String imeGrada;
    private List<Objekat> objekti = new ArrayList<Objekat>();

    public PoreskaUprava(String imeGrada, List<Objekat> objekti) {
        this.imeGrada = imeGrada;
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public void dodajObjekat(Objekat objekat) {
        this.objekti.add(objekat);
    }

    public void ukupanPorez() {
        double suma = 0;
        for (Objekat objekti : this.objekti) {
            suma += objekti.racunajPorez();
        }
        System.out.println("Ukupan porez: " + suma);
    }

    public Objekat najveciPorez() {
        Objekat najveci = this.objekti.get(0);
        for (Objekat objekat : this.objekti) {
            if (najveci.racunajPorez() < objekat.racunajPorez()) {
                najveci = objekat;
            }
        }
        return najveci;
    }

    public Objekat najmanjiPorez() {
        Objekat najmanji = this.objekti.get(0);
        for (Objekat objekat : this.objekti) {
            if (objekat.racunajPorez() < najmanji.racunajPorez()) {
                najmanji = objekat;
            }
        }
        return najmanji;
    }



    @Override
    public String toString() {
        return "PoreskaUprava{" +
                "imeGrada='" + this.imeGrada +
                    "objekti=" + "\n" + this.objekti.toString() +
                '}' ;
    }
}
