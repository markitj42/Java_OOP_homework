package Lokali_oop;

public abstract class Objekat {
    protected String adresa;
    protected int povrsina;
    protected int zona;
    protected double porez = 0.0;

    public Objekat(String adresa, int povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }
    public String getAdresa() {
        return adresa;
    }

    public int getPovrsina() {
        return povrsina;
    }

    public int getZona() {
        return zona;
    }

    public double getPorez() {
        return porez;
    }

    public double koeficijent() {
        if (zona == 1) {
            return 1.4;
        } else if (zona == 2) {
            return 1.1;
        } else {
            return 1.05;
        }
    }

    public abstract double racunajPorez();

    /*@Override
    public int compare(Objekat o, Objekat o2) {
        Objekat obj1 = (Objekat) o;
        Objekat obj2 = (Objekat) o2;

        return
    }*/

    @Override
    public String toString() {
        return "Adresa: " + this.adresa + "\n" + "Povrsina: " + this.povrsina + "\n" + "Zona: " + this.zona + "\n" + "Porez: " + this.porez;
    }

}
