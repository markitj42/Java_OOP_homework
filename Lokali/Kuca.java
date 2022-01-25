package Lokali_oop;

public class Kuca extends Objekat{
    protected int brojClanova;

    public Kuca(String adresa, int povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double racunajPorez() {
        return this.povrsina * koeficijent();
    }

    @Override
    public String toString() {
        return "Adresa: " + this.adresa + "\n" + "Povrsina: " + this.povrsina + "\n" + "Zona: " + this.zona + "\n" + "Broj clanova: " + this.brojClanova;
    }
}
