public class Villageois {
    private String nom;
    private double poids;
    private boolean malade;

    public Villageois(String nomVillageois) {
        nom = nomVillageois;
        poids = Math.random() * 100 + 50;
        malade = Math.random() < 0.2;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public boolean getMalade() {
        return malade;
    }

    public String toString() {
        return "villageois :" + nom + ", poids :" + (int) poids + " kg, malade :" + malade;
    }

    public double poidsSouleve() {
        if (malade)
            return poids / 4;
        return poids / 3;
    }
}