package Atleticar;

public class Trkac extends Atleticar{

    public Trkac(String ime, String prezime, int rezultatNaTakmicenju) {
        super(ime, prezime, rezultatNaTakmicenju);
    }

    /**
     * @param atleticarSaKojimUporedjujemo
     * @return true ako trkac ima bolji rezultat od prosledjenog atleticara, false u suprotnom
     * prosledjeni atleticar mora biti tipa Trkac
     */
    @Override
    public boolean daLiJeBoljiRezultat(Atleticar atleticarSaKojimUporedjujemo) {
        return atleticarSaKojimUporedjujemo instanceof Trkac && this.getRezultatNaTakmicenju() < atleticarSaKojimUporedjujemo.getRezultatNaTakmicenju();
    }
}
