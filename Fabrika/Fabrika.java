package Fabrika;

import java.util.HashMap;
import java.util.Map;

public class Fabrika implements RadSaMapom, ProsecnaZarada{
    protected String naziv;
    protected Map<String, Zaposleni> zaposleni = new HashMap<>();

    public Fabrika(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public double prosek() {
        if(zaposleni.isEmpty()) {
            System.out.println("Lista je prazna");
            return 0;
        }
        double prosecnaSuma = 0;
        for (Zaposleni z : zaposleni.values()) {
            prosecnaSuma += z.getMesecnaZarada();
        }
        return prosecnaSuma/zaposleni.size();
    }

    @Override
    public boolean zaposli(Zaposleni z) {
        if (zaposleni.containsKey(z.getJmbg())) {
            System.out.println("Neuspesno zaposlenje");
            return false;
        }
        zaposleni.put(z.getJmbg(), z);
        System.out.println("Uspesno zaposlenje");
        return true;
    }

    @Override
    public Zaposleni otpusti(String jmbg, double plata) {
        Zaposleni otpusteni = null;
        for (Zaposleni z : zaposleni.values()) {
            if (z.getJmbg().equals(jmbg) && z.getMesecnaZarada() > plata) {
                otpusteni = z;
                zaposleni.remove(z.getJmbg());
                return otpusteni;
            }
        }
        return null;
    }

    @Override
    public String ispisiJmbgZaposlenih() {
        StringBuilder sb = new StringBuilder();
        String jmbgZaposlenih = null;
        for (String jmbg : this.zaposleni.keySet()) {
            sb.append(jmbg).append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Fabrika: " + naziv + "\n" + "Zaposleni: " + zaposleni + "\n";
    }
}
