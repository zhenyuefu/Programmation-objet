package Menagerie;

public class Canard extends APattes {
    public Canard(String nom, int age) {
        super(nom, age);
        super.nbPattes = 2;
    }

    public Canard(String nom) {
        super(nom);
        super.nbPattes = 2;
    }

    public void crier() {
        System.out.println("[cri du canard] Gaga ... gaga ");
    }

}