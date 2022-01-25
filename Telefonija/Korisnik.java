package Telefonija;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {
    protected int id;
    protected static int inkrementujId =0;
    protected String ime;
    protected String prezime;
    protected Broj brojKorisnika;
    protected List<Usluga> istorijaUsluga = new ArrayList<>();

    public Korisnik(String ime, String prezime, Broj broj) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojKorisnika = broj;
        inkrementujId++;
        this.id = inkrementujId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Broj getBrojKorisnika() {
        return brojKorisnika;
    }

    public void setBrojKorisnika(Broj brojKorisnika) {
        this.brojKorisnika = brojKorisnika;
    }

    public List<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    public void posaljiPoruku(Broj brojNaKojiSaljemo, String tekstPoruke) {
        Poruka poruka = new Poruka(brojKorisnika, brojNaKojiSaljemo, tekstPoruke);
        istorijaUsluga.add(poruka);
    }

    public void pozovi(Broj brojKojiTrebaPozvati, int trajanjePoziva) {
        Poziv poziv = new Poziv(brojKorisnika, brojKojiTrebaPozvati, trajanjePoziva);
        istorijaUsluga.add(poziv);
    }

    public double cenaSvihUsluga() {
        double ukupnaCena = 0;
        for (Usluga usluga : istorijaUsluga) {
            ukupnaCena += usluga.cenaUsluge();
        }
        return ukupnaCena;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + brojKorisnika + "\n" + "Istorija usluga:" + "\n" + istorijaUsluga;
    }
}
