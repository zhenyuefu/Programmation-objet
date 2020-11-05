public class Guitare extends Instrument {
    public Guitare(double poids, double prix) {
        super(poids, prix);
    }

    public void jouer() {
        System.out.println("La guitare joue");
    }

    public String toString() {
        return "guitare: " + super.toString();
    }
}
