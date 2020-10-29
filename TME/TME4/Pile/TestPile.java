public class TestPile {
    public static void main(String[] args) {
        Machin m1 = new Machin("un", 1);
        Machin m2 = new Machin("deux", 1);
        Machin m3 = new Machin("trois", 1);
        Pile p = new Pile(3);
        p.empiler(m1);
        System.out.println(p.toString());
        p.empiler(m2);
        System.out.println(p.toString());
        p.empiler(m3);
        System.out.println(p.toString());
        p.depiler();
        System.out.println(p.toString());
        p.depiler();
        System.out.println(p.toString());
        Machin autreM = new Machin("au", 1);
        p.empiler(autreM);
        System.out.println(p.toString());
    }
}