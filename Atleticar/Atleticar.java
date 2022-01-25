package Atleticar;

public abstract class Atleticar {
    private String ime;
    private String prezime;
    private int rezultatNaTakmicenju;

    public Atleticar(String ime, String prezime, int rezultatNaTakmicenju) {
        this.ime = ime;
        this.prezime = prezime;
        this.rezultatNaTakmicenju = rezultatNaTakmicenju;
    }

    @Override
    public String toString() {

        return "Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + "\n" + "Rezultat: " + getRezultatNaTakmicenju();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getRezultatNaTakmicenju() {
        return rezultatNaTakmicenju;
    }

    public abstract boolean daLiJeBoljiRezultat(Atleticar atleticar);


}
