package Proizvod;

import java.time.LocalDate;
import java.util.Scanner;

public class test_proizvoda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Proizvod prehrambeni = new Prehrambeni("014va78", "hleb", 250, LocalDate.of(2022, 10, 30) );
        Proizvod televizor = new Tehnika("014va79", "Samsung", 250, 30.50);
        Proizvod pice = new Pice("014va80", "kafa", 100, "limenka");
        Proizvod vodka = new AlkoholnaPica("014va81", "Vodka", 580, 45, "staklena");
        Proizvod cocaCola = new Pice("014va82", "Coca-Cola", 120, "plasticna");

        Proizvod[] nizProizvoda = new Proizvod[] {prehrambeni, televizor, pice, vodka, cocaCola};

        Kupac kupac1 = new Kupac("Svetlana", "Stevic");
        Korpa korpa1 = new Korpa(kupac1);

        boolean kupovina = true;

        while(kupovina) {
            System.out.println("Unesite bar kod proizvoda koji zelite da dodate u korpu: ");
            String barKod = input.nextLine();
            boolean pronadjen = false;
            if (barKod.equals("zavrsi kupovinu")) {
                kupovina = false;
                break;
            }
            for (Proizvod proizvod : nizProizvoda) {
                if (barKod.equals(proizvod.getBarKod())) {
                    korpa1.dodajProizvod(proizvod);
                    System.out.println("Proizvod " + proizvod.getNaziv() + " je dodat u korpu.");
                    pronadjen = true;
                }
            }
            if (!pronadjen) {
                System.out.println("Uneli ste pogresan barkod");
            }
        }
        korpa1.ispisiRacun();



    }
}
