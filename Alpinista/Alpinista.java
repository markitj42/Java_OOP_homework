package Alpinista;

public class Alpinista extends Planinar{
    protected int poeni;

    public Alpinista(String imePrezime, int poeni) {
        super(imePrezime);
        this.poeni = poeni;
    }

    @Override
    public double clanarina() {
       int popust = this.poeni * 50;
       return 1500 - popust;
    }

    @Override
    public boolean uspesanUspon(Planina nazivPlanine) {
        return nazivPlanine.getVisinaPlanine() < 4000;
    }

    @Override
    public String toString() {
        return "Alpinista id: " + getIdentifikacioniBr() + "\n" + "Ime i prezime: " + getImePrezime() + "\n" + "Broj poena: " + this.poeni;
    }
}
