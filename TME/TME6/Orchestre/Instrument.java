public class Instrument {
    private double poids, prix;

    public Instrument(double poids, double prix) {
        this.poids = poids;
        this.prix = prix;
    }

    public String toString() {
        return "prix:" + prix + " poids:" + poids;
    }

    public void jouer() {
        System.out.println("jouer");
    }
}