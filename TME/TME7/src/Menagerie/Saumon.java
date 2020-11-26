package Menagerie;

public class Saumon extends SansPattes {
    public Saumon(String nom, int age) {
        super(nom, age);
    }

    public Saumon(String nom) {
        super(nom);
    }

    public void crier() {
        System.out.println("[cri du saumon] Bouuuu bou");
    }
}