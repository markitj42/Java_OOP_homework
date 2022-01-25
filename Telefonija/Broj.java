package Telefonija;

import java.util.Objects;

public class Broj {
    protected String kodDrzave;
    protected String pozivniBroj;
    protected String broj;
    protected boolean fiksniBroj;

    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksniBroj) {
        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksniBroj = fiksniBroj;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean isFiksniBroj() {
        return fiksniBroj;
    }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Broj broj1)) return false;
        return fiksniBroj == broj1.fiksniBroj && kodDrzave.equals(broj1.kodDrzave) && pozivniBroj.equals(broj1.pozivniBroj) && broj.equals(broj1.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kodDrzave, pozivniBroj, broj, fiksniBroj);
    }

    public static boolean proveriDaLiStringSadrziSamoNumerike(String string) {
        boolean jesteBroj = true;
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                jesteBroj = false;
            }
        }
        return jesteBroj;
    }

    public static boolean proveriBroj(String kodDrzave, String pozivniBroj, String broj) {
        return kodDrzave != null && kodDrzave.length() == 3 && proveriDaLiStringSadrziSamoNumerike(kodDrzave)
                && pozivniBroj != null && pozivniBroj.length() == 2 && proveriDaLiStringSadrziSamoNumerike(pozivniBroj)
                && broj != null && (broj.length() == 7 || broj.length() == 8) && proveriDaLiStringSadrziSamoNumerike(broj);
    }

    @Override
    public String toString() {
        return "+" + kodDrzave + " " + pozivniBroj + " " + broj;
    }
}
