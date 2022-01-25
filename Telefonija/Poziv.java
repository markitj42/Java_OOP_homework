package Telefonija;

public class Poziv extends Usluga{
    protected int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    @Override
    public double cenaUsluge() {
        if ((brojOd != null && brojKa != null) && !brojOd.equals(brojKa)) {
            if (trajanjeUSekundama % 60 == 0) {
                return trajanjeUSekundama/60 *10;
            } else {
                return (trajanjeUSekundama/60 + 1) * 10;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Trajanje poziva: " + trajanjeUSekundama/60 + ":" + trajanjeUSekundama%60;
    }
}
