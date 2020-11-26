package Figure;

public class TestFigure {
    public static void main(String[] args) {
        Figure2D[] tab = new Figure2D[4];
        tab[0] = new Rectangle(2, 5);
        tab[1] = new Carre(1);
        tab[2] = new Ellipse(2, 4);
        tab[3] = new Cercle(1);
        for (Figure2D figure2d : tab) {
            System.out.println(figure2d.toString());
            System.out.println("surface = " + figure2d.surface());
            System.out.println("perimetre = " + figure2d.perimetre());
        }
    }
}
