package Flase;

public class Flasa {
    protected Nalepnica nalepnica;
    protected double cenaBezKaucije;
    protected double cenaSaKaucijom;
    protected double zapremina = 0.33;
    protected VrstaPica vrstaPica;

    public Flasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstaPica vrstaPica) {
        this.nalepnica = nalepnica;
        this.cenaBezKaucije = cenaBezKaucije;
        this.zapremina = zapremina;
        this.vrstaPica = vrstaPica;
    }

    public Nalepnica getNalepnica() {
        return nalepnica;
    }

    public double getCenaBezKaucije() {
        return cenaBezKaucije;
    }

    public double getZapremina() {
        return zapremina;
    }

    public VrstaPica getVrstaPica() {
        return vrstaPica;
    }

    public void setCenaBezKaucije(double cenaBezKaucije) {
        this.cenaBezKaucije = cenaBezKaucije;
    }

    public double getCenaSaKaucijom() {
        return cenaSaKaucijom;
    }

    @Override
    public String toString() {
        return "Nalepnica: " + "\n" + "Cena bez kaucije: " + cenaBezKaucije + "\n" + "Zapremina: " + zapremina + "\n" + "Vrsta pica: " + vrstaPica;
    }
}
