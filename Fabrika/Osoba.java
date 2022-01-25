package Fabrika;

public class Osoba {
    protected String jmbg;
    protected String ime;
    protected String prezime;

    public Osoba(String jmbg, String ime, String prezime) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    @Override
    public String toString() {
        return "Ime: " + ime + "\n" + "Prezime: " + prezime + "\n" + "Jmbg: " + jmbg;
    }
}
