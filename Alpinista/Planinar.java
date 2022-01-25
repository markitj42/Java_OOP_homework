package Alpinista;

public abstract class Planinar {
    protected int identifikacioniBr = 0;
    protected String imePrezime;
    protected static int brojPlaninara = 0;

    public Planinar(String imePrezime) {
        this.imePrezime = imePrezime;
        brojPlaninara++;
        this.identifikacioniBr = brojPlaninara;
    }

    public int getIdentifikacioniBr() {
        return identifikacioniBr;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public abstract String toString();
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina nazivPlanine);
}
