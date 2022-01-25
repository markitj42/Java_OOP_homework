package Flase;

public class StaklenaFlasa extends Flasa{
    //protected double cenaSaKaucijom;

    public StaklenaFlasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstaPica vrstaPica) {
        super(nalepnica, cenaBezKaucije, zapremina, vrstaPica);
        if (zapremina < 0.5) {
            this.cenaSaKaucijom= (cenaBezKaucije + cenaBezKaucije * 0.05);
        } else {
            this.cenaSaKaucijom = (cenaBezKaucije + cenaBezKaucije * 0.10);
        }
    }

    @Override
    public String toString() {
        return "Nalepnica: " + super.nalepnica +  "\n" + "Cena sa kaucijom: " + cenaSaKaucijom + "\n" + "Zapremina: " + zapremina + "\n" + "Vrsta pica: " + vrstaPica + "\n" + "Vrsta ambalaze: Staklena";
    }
}
