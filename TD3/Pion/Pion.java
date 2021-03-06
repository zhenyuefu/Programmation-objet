public class Pion {
    private String nom;
    private Point posx; // position du pion

    public Pion(String n) {
        nom = n;
        posx = new Point();
    }

    public Pion(Pion aCopy) {
        nom = aCopy.nom;
        posx = new Point(aCopy.posx);
    }

    public Pion clone() {
        Pion p = new Pion(nom);
        p.posx = posx.clone();
        return p;
    }

    public void setNom(String n) {
        nom = n;
    }

    public String getNom() {
        return nom;
    }
}