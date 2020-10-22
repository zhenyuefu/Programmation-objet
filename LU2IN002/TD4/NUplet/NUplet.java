public class NUplet {
    private int[] tab;

    public NUplet(int n) {
        tab = new int[n];
    }

    public NUplet(int n, int x) {
        this(n);
        for (int i = 0; i < tab.length; i++)
            tab[i] = x;
    }

    public NUplet(int a, int b, int c) {
        this(3);
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
    }
}