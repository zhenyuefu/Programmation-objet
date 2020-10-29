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

    public NUplet(int[] tab) {
        this(tab.length);
        for (int i = 0; i < tab.length; i++) {
            this.tab[i] = tab[i];
        }
    }

    public int[] getTab() {
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = tab[i];
        }
        return tab2;
    }

    public boolean egal(NUplet n2) {
        if (n2 == null)
            return false;
        if (this == n2)
            return true;
        if (tab.length != n2.tab.length)
            return false;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != n2.tab[i])
                return false;
        }
        return true;
    }
}