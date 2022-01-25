package Alpinista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Planina jastrebovac = new Planina("Jastrebovac", "Srbija", 1500);
        List<Planinar> planinari = new ArrayList<>();
        planinari.add(new RekreativniPlaninar("Marko Ilic", 20, "Shire", 2400));
        planinari.add(new RekreativniPlaninar("Petar Peric", 15, "Shire", 4500));
        planinari.add(new RekreativniPlaninar("Djura Milicic", 5, "Shire", 3100));
        planinari.add(new Alpinista("Milica Peric", 20));
        planinari.add(new Alpinista("Jovana Djukic", 5));
        planinari.add(new Alpinista("Slavica Stevic", 15));

        int zbirClanarina = 0;
        for (Planinar planinar : planinari) {
            System.out.println(planinar);
            System.out.println(planinar.uspesanUspon(jastrebovac));
            System.out.println();
            zbirClanarina += planinar.clanarina();
        }
        System.out.println();
        System.out.println("Zbir clanarina: " + zbirClanarina);
    }
}
