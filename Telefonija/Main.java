package Telefonija;

public class Main {
    public static void main(String[] args) {

        Broj perinBroj = new Broj("381", "64", "3508921", false);
        Broj zikinBroj = new Broj("381", "63", "2403060", false);
        Korisnik pera = new Korisnik("Petar", "Ostojic", perinBroj);
        Korisnik zika = new Korisnik("Zika", "Stosic", zikinBroj);

        pera.posaljiPoruku(zikinBroj, "Desi Ziko kad cemo na pivo???");
        zika.posaljiPoruku(perinBroj, "Eo Pero kucam neke jave, moze sutra!");
        pera.posaljiPoruku(zikinBroj, "Sutra u 2 !");

        //zika.pozovi(perinBroj, 180);
        pera.pozovi(zikinBroj, 130);

        System.out.println(pera);
        System.out.println("Ukupna cena usluga: " +pera.cenaSvihUsluga() + " rsd");
        System.out.println(Broj.proveriBroj("381", "54", "12345678"));
    }
}
