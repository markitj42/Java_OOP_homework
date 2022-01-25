package Lokali_oop;

public class Lokal extends Objekat{

    public Lokal(String adresa, int povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double racunajPorez() {
        return koeficijent() * this.povrsina * 1.3;
    }

    @Override
    public String toString() {
        return "Adresa: " + this.adresa + "\n" + "Povrsina: " + this.povrsina + "\n" + "Zona: " + this.zona;
    }
}
