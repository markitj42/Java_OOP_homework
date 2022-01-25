package Atleticar;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private TipDiscipline tipDiscipline;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String imeDiscipline, TipDiscipline tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        this.atleticari = new ArrayList<>();
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public TipDiscipline getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(TipDiscipline tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void addAtleticar(Atleticar atleticar) {
        if (atleticar instanceof Trkac && this.tipDiscipline.equals(TipDiscipline.TRKACKA)) {
            this.atleticari.add(atleticar);
        }
        else if (atleticar instanceof Skakac && this.tipDiscipline.equals(TipDiscipline.SKAKACKA)) {
            this.atleticari.add(atleticar);
        }
        else {
            System.out.println("eror");
        }
    }

    public void removeAtleticar(String ime, String prezime) {
        Atleticar atleticarToRemove = null;
        for (Atleticar atleticar : this.atleticari) {
            if (atleticar.getIme().equals(ime) && atleticar.getPrezime().equals(prezime)) {
                atleticarToRemove = atleticar;
            }
        }
        if (atleticarToRemove != null ) {
            this.atleticari.remove(atleticarToRemove);
        }
        //TODO throw exception if not found
    }

    private Atleticar najboljiRezultat() {
        Atleticar najboljiAtleticar = null;
        for (Atleticar atleticar : this.atleticari) {
            if (najboljiAtleticar == null || atleticar.daLiJeBoljiRezultat(najboljiAtleticar)){
                najboljiAtleticar = atleticar;
            }
        }
        return najboljiAtleticar;
    }

    public void prikaziNajboljegAtletu() {
        System.out.println("Najbolji atleticar je: " + "\n" + najboljiRezultat());
    }
}
