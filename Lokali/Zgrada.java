package Lokali_oop;

public class Zgrada extends Objekat{
    protected int brojStanova;

    public Zgrada(String adresa, int povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {
        return koeficijent() * this.povrsina * this.brojStanova;
    }

    @Override
    public String toString() {
        return "Adresa: " + this.adresa + "\n" + "Povrsina: " + this.povrsina + "\n" + "Zona: " + this.zona + "\n" + "Broj stanova: " + this.brojStanova;
    }
}
