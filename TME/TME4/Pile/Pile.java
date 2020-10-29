public class Pile {
    private Machin[] tab;
    private int nbElements;

    public Pile(int taille) {
        tab = new Machin[taille];
        nbElements = 0;
    }

    public void empiler(Machin m) {
        if (nbElements < tab.length) {
            tab[nbElements] = m;
            nbElements++;
        }
    }

    public Machin depiler() {
        Machin m = null;
        if (nbElements > 0) {
            nbElements--;
            m = tab[nbElements];
            tab[nbElements] = null;
        }
        return m;
    }

    public boolean estvide() {
        return nbElements == 0;
    }

    public boolean estPleine() {
        return nbElements == tab.length;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < nbElements; i++) {
            s += tab[i].getNom() + "\n";
        }
        return s;
    }
}