package Fabrika;

public class Zaposleni extends Osoba{
    protected double mesecnaZarada;
    protected boolean odobrenGodisnji;

    public Zaposleni(String jmbg, String ime, String prezime, double mesecnaZarada, boolean odobrenGodisnji) {
        super(jmbg, ime, prezime);
        this.mesecnaZarada = mesecnaZarada;
        this.odobrenGodisnji = odobrenGodisnji;
    }

    public double getMesecnaZarada() {
        return mesecnaZarada;
    }

    @Override
    public String toString() {
        return "Ime: " + ime + "\n" + "Prezime: " + prezime + "\n" + "Jmbg: " + jmbg + "\n" + "Mesecna zarada: " + mesecnaZarada + "\n";
    }
}
