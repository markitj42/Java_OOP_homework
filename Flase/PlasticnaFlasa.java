package Flase;

public class PlasticnaFlasa extends Flasa{


    public PlasticnaFlasa(Nalepnica nalepnica, double cenaBezKaucije, double zapremina, VrstaPica vrstaPica) {
        super(nalepnica, cenaBezKaucije, zapremina, vrstaPica);
        this.cenaSaKaucijom = cenaBezKaucije;
    }

    @Override
    public String toString() {
        return "Nalepnica: " + super.nalepnica +  "\n" + "Cena sa kaucijom: " + cenaSaKaucijom + "\n" + "Zapremina: " + zapremina + "\n" + "Vrsta pica: " + vrstaPica + "\n" + "Vrsta ambalaze: Plasticna";
    }
}
