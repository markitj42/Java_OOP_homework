package Atleticar;

public class Skakac extends Atleticar{

    public Skakac(String ime, String prezime, int rezultatNaTakmicenju) {
        super(ime, prezime, rezultatNaTakmicenju);
    }

    @Override
    // vraca true ako je skakac bolji od prosledjenog skakaca
    // ako nije vraca false
    public boolean daLiJeBoljiRezultat(Atleticar atleticarSaKojimUporedjujemo) {
        return atleticarSaKojimUporedjujemo instanceof Skakac && this.getRezultatNaTakmicenju() > atleticarSaKojimUporedjujemo.getRezultatNaTakmicenju();
    }

}
