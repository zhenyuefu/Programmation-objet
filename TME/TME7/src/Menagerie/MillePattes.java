package Menagerie;

public class MillePattes extends APattes {
    public MillePattes(String nom, int age) {
        super(nom, age);
        super.nbPattes = 1000;
    }

    public MillePattes(String nom) {
        super(nom);
        super.nbPattes = 1000;
    }

    public void crier() {
        System.out.println("[cri du mille-pattes] ...(silence)");
    }
}