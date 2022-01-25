package Flase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Nalepnica nalepnica1 = new Nalepnica("Pivo");
        Nalepnica nalepnica2 = new Nalepnica("Voda Knjaz");
        StaklenaFlasa valjevsko = new StaklenaFlasa(nalepnica1, 150, 0.5, VrstaPica.ALKOHOLNO);
        PlasticnaFlasa knjaz = new PlasticnaFlasa(nalepnica2, 60, 0.3, VrstaPica.BEZALKOHOLNO);
        StaklenaFlasa zajecarsko = new StaklenaFlasa(nalepnica1, 130, 0.6, VrstaPica.ALKOHOLNO);

        List<Flasa> listaFlasa = new ArrayList<>();
        listaFlasa.add(valjevsko);
        listaFlasa.add(knjaz);
        listaFlasa.add(zajecarsko);

        double ukupnaCenaSaKaucijom = 0;
        for (Flasa flasa : listaFlasa) {
            ukupnaCenaSaKaucijom += flasa.getCenaSaKaucijom();
            if (flasa.nalepnica.identifikator == 1) {
                System.out.println(flasa);
                System.out.println();
            }
        }
        System.out.println("Ukupna cena sa kaucijom je: " + ukupnaCenaSaKaucijom);
    }
}
