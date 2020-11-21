public class Mineur {
    private static int nb = 0;
    /** identifiant (unique) */
    private final int ident;
    private int x, y;
    /** Nombre de ressources qui peuvent être collectées en une journée */
    private int capacity;
    /** Nombre maximum de ressources à collecter un jour */
    private static final int CAPACITY_MAX = 8;

    /** Constructeur de mineur avec des capacités aléatoires */
    public Mineur(int x, int y) {
        nb++;
        ident = nb;
        this.x = x;
        this.y = y;
        capacity = (int) (Math.random() * CAPACITY_MAX);
    }

    /**
     * Accesseur de X
     * 
     * @return numéro de ligne
     */
    public int getX() {
        return x;
    }

    /**
     * Accesseur de Y
     * 
     * @return numéro de colonne
     */
    public int getY() {
        return y;
    }

    /**
     * Accesseur de capacity
     * 
     * @return Nombre de ressources qui peuvent être collectées en une journée
     */
    public int getCapacity() {
        return capacity;
    }

    /** @return La distance entre la position du mineur et les coordonnées (x,y) */
    public double distance(int x, int y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return (Math.sqrt(dx * dx + dy * dy));
    }

    /** Miner se déplace vers de nouvelles coordonnées (newx, newy). */
    public void seDeplacer(int newx, int newy) {
        System.out.println(
                "Mineur " + ident + " moves from " + "(" + x + "," + y + ")" + "to (" + newx + "," + newy + ")");
        this.x = newx;
        this.y = newy;
    }

    /** @return id de mineur */
    public String toString() {
        return "Mineur " + ident;
    }
}