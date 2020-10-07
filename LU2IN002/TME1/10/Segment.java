public class Segment {
    private int x, y;

    public Segment(int extx, int exty) {
        x = extx;
        y = exty;
    }

    public int longueur() {
        if (x < y)
            return y - x;
        return x - y;
    }

    public String toString() {
        return "Segment [" + x + ", " + y + "]";
    }
}