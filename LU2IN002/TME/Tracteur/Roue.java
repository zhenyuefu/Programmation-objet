public class Roue {
    private int dialetre;

    public Roue(int d) {
        dialetre = d;
    }

    public Roue() {
        this(60);
    }

    public Roue clone() {
        Roue r = new Roue();
        r.dialetre = dialetre;
        return r;
    }

    public Roue(Roue aCopieRoue) {
        dialetre = aCopieRoue.dialetre;
    }

    public String toString() {
        return dialetre + "cm";
    }
}