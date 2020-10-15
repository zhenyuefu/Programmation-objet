public class Point {
    private int posx, posy;

    public Point(int x, int y) {
        posx = x;
        posy = y;
    }

    public Point() {
        this(0, 0);
    }

    public void setPosx(int pos) {
        posx = pos;
    }

    public void setPosy(int pos) {
        posy = pos;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public String toString(){
        return "(" + posx + "," + posy + ")"
    }
}