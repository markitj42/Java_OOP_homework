package Fabrika;

public interface RadSaMapom {

    public boolean zaposli(Zaposleni zaposleni);
    public Zaposleni otpusti(String jmbg, double plata);
    public String ispisiJmbgZaposlenih();
}
