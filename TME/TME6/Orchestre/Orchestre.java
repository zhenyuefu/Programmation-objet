public class Orchestre {
    private Instrument[] tabInstruments;
    private int nbInstrument = 0;

    public Orchestre(int nb) {
        tabInstruments = new Instrument[nb];
    }

    public void ajouterInstrument(Instrument i) {
        tabInstruments[nbInstrument] = i;
        nbInstrument++;
    }

    public void jouer() {
        for (int i = 0; i < nbInstrument; i++) {
            tabInstruments[i].jouer();
        }
    }
}