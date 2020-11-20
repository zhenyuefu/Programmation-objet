public class Mineur {
    private static int nb = 0;
    private final int ident;
    private int x, y;
    private int capacity;
    private static final int CAPACITY_MAX = 8;

    public Mineur(int x, int y) {
        nb++;
        ident = nb;
        this.x = x;
        this.y = y;
        capacity = (int) (Math.random() * CAPACITY_MAX);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCapacity() {
        return capacity;
    }

    public double distance(int x, int y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return (Math.sqrt(dx * dx + dy * dy));
    }

    public void seDeplacer(int newx, int newy) {
        System.out.println(
                "Mineur " + ident + " moves from " + "(" + x + "," + y + ")" + "to (" + newx + "," + newy + ")");
        this.x = newx;
        this.y = newy;
    }

    public String toString() {
        return "Mineur " + ident;
    }
}