public class TestOrchestre {
    public static void main(String[] args) {
        Piano p = new Piano(10, 10);
        Guitare g = new Guitare(10, 10);
        Trompette t = new Trompette(10, 10);
        Orchestre orchestre = new Orchestre(3);
        orchestre.ajouterInstrument(p);
        orchestre.ajouterInstrument(g);
        orchestre.ajouterInstrument(t);
        orchestre.jouer();
    }
}