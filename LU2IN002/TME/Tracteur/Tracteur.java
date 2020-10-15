public class Tracteur {
    private Roue r1, r2, r3, r4;
    private Cabine cabine;

    public Tracteur(Roue r1, Roue r2, Roue r3, Roue r4, Cabine c) {
        this.cabine = c;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
    }

    public Tracteur(Tracteur aCopieTracteur) {
        r1 = new Roue(aCopieTracteur.r1);
        r2 = new Roue(aCopieTracteur.r2);
        r3 = new Roue(aCopieTracteur.r3);
        r4 = new Roue(aCopieTracteur.r4);
        cabine = new Cabine(aCopieTracteur.cabine);
    }

    public Tracteur clone() {
        Tracteur t = new Tracteur(r1.clone(), r2.clone(), r3.clone(), r4.clone(), cabine.clone());
        return t;
    }

    public String toString() {
        return (cabine.toString() + r1.toString() + r2.toString() + r3.toString() + r4.toString());
    }

    public void peindre(String couleur) {
        cabine.setCouleur(couleur);
    }
}