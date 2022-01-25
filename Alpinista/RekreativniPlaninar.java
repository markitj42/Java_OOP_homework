package Alpinista;

public class RekreativniPlaninar extends Planinar{
    protected int tezinaOpreme;
    protected String nazivOkruga;
    protected int maksimalniUspon;

    public RekreativniPlaninar(String imePrezime, int tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
        super(imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina nazivPlanine) {
        double umanjenjeUspona = this.tezinaOpreme * 50;

        return (this.maksimalniUspon - umanjenjeUspona) > nazivPlanine.getVisinaPlanine();
    }

    @Override
    public String toString() {
        return "Rekreativac id: " + getIdentifikacioniBr() + "\n" + "Ime i prezime: " + getImePrezime() + "\n" + "Okrug: " + this.nazivOkruga;
    }
}
