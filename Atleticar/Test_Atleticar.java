package Atleticar;

import java.util.Arrays;

public class Test_Atleticar {
    public static void main(String[] args) {

        Disciplina prva = new Disciplina("Skok u dalj", TipDiscipline.SKAKACKA);
        Disciplina druga = new Disciplina("110m s preponama", TipDiscipline.TRKACKA);
        Trkac trkac = new Trkac("Pera", "P", 40);
        Skakac skakac = new Skakac("Zika", "Z", 6);
        prva.addAtleticar(new Skakac("Pera", "P", 40));
        prva.addAtleticar(new Skakac("Maja", "P", 30));
        prva.addAtleticar(new Skakac("Anja", "R", 420));
        prva.prikaziNajboljegAtletu();

        System.out.println(trkac.daLiJeBoljiRezultat(new Trkac("A", "B", 50)));


    }
}
