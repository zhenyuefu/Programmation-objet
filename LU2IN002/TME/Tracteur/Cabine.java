public class Cabine {
    private int volume;
    private String couleur;

    public Cabine(int v, String c) {
        volume = v;
        couleur = c;
    }

    public Cabine(Cabine aCopCabine) {
        volume = aCopCabine.volume;
        couleur = aCopCabine.couleur;
    }

    public String toString() {
        return ("le cabine est " + couleur + ", le volume est " + volume + "m3");
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}