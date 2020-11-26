package Menagerie;

public class Vache extends APattes {
    public Vache(String nom, int age) {
        super(nom, age);
        super.nbPattes = 4;
    }

    public Vache(String nom) {
        super(nom);
        super.nbPattes = 4;
    }

    public void crier() {
        System.out.println("[cri de la vache] Mouuuu");
    }
}