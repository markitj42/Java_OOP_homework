package Lokali_oop;

import java.util.ArrayList;

public class TEST {
    public static void main(String[] args) {

        Kuca kuca = new Kuca("Panticeva", 40, 1, 4);
        Zgrada zgrada = new Zgrada("Sindjeliceva", 500, 2, 35);
        Lokal lokal = new Lokal("Karadjordjeva", 120, 3);

        ArrayList<Objekat> listaObjekata = new ArrayList<>();
        PoreskaUprava valjevo = new PoreskaUprava("Valjevo", listaObjekata);
        valjevo.dodajObjekat(kuca);
        valjevo.dodajObjekat(zgrada);
        valjevo.dodajObjekat(lokal);

        valjevo.ukupanPorez();
        System.out.println("Najveci porez: "+ "\n" + valjevo.najveciPorez().racunajPorez());
        System.out.println("Najmanji porez: "+ "\n" + valjevo.najmanjiPorez().racunajPorez());


    }
}
