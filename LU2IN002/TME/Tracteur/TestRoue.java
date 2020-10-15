public class TestRoue {
    public static void main(String[] args) {
        Roue r1 = new Roue(120);
        Roue r2 = new Roue(120);
        Roue r3 = new Roue();
        Roue r4 = new Roue();
        Cabine c = new Cabine(10, "bleu");
        Tracteur t1 = new Tracteur(r1, r2, r3, r4, c);
        System.out.println(t1.toString());
        Tracteur t2 = new Tracteur(t1);
        t2.peindre("blanc");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}