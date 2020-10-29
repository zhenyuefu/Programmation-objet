public class Point {
    private double x, y;

    public Point() {
        x = Math.random();
        y = Math.random();
    }

    public Point(Point aCopy) {
        x = aCopy.x;
        y = aCopy.y;
    }

    public Point clone() {
        Point p = new Point();
        p.x = x;
        p.y = y;
        return p;
    }

    public void bouger() {
        x = Math.random();
        y = Math.random();
    }
}