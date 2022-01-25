package Telefonija;

public class Poruka extends Usluga{
    protected String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    @Override
    public double cenaUsluge() {
        if ((brojOd != null && brojKa != null) && !brojOd.equals(brojKa) && !(brojOd.fiksniBroj) && !(brojKa.fiksniBroj)) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + tekstPoruke;
    }
}
