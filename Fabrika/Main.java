package Fabrika;

public class Main {
    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika("Plazma");

        /*Zaposleni z1 = new Zaposleni("3012995770031", "Marko", "Ilic", 1500, false);
        Zaposleni z2 = new Zaposleni("3020998770045", "Anja", "Romanic", 2000, false);
        Zaposleni z3 = new Zaposleni("7264848948848", "Pera", "Stankovic", 3000, false);*/

        fabrika.zaposli(new Zaposleni("3012995770031", "Marko", "Ilic", 1500, false));
        fabrika.zaposli(new Zaposleni("3020998770045", "Anja", "Romanic", 2000, false));
        fabrika.zaposli(new Zaposleni("7264848948848", "Pera", "Stankovic", 3000, false));

        System.out.println(fabrika.prosek());
        System.out.println(fabrika);
        fabrika.otpusti("3012995770031",1000);
        System.out.println(fabrika);
    }
}
