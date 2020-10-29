public class Cone {
    public final double PI = 3.14159;
    private static int nbCones;
    private double r, h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
        nbCones++;
    }

    public Cone() {
        this(Math.random() * 10, Math.random() * 10);
    }

    public double getVolume() {
        return PI * r * r * h / 3;
    }

    public String toString() {
        return "Cone r=" + r + " h=" + h + " V=" + getVolume();
    }

    public static int getnbCones() {
        return nbCones;
    }
}