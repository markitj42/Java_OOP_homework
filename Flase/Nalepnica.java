package Flase;

public class Nalepnica {
    protected String naziv;
    protected int identifikator;
    protected static int inkrementujId =0;

    public Nalepnica(String naziv) {
        this.naziv = naziv;
        inkrementujId++;
        this.identifikator = inkrementujId;
    }

    public int getIdentifikator() {
        return identifikator;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString() {
        return "ID: " + identifikator + "\n" + "Naziv: " + naziv;
    }
}
