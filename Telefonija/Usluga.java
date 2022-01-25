package Telefonija;

public abstract class Usluga {
    protected Broj brojOd;
    protected Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    @Override
    public String toString() {
        return " " + brojOd + " " +  "->"+ " "+ brojKa;
    }

    public abstract double cenaUsluge();
}
