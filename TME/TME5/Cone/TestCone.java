public class TestCone {
    public static void main(String[] args) {
        System.out.println(Cone.getnbCones());
        Cone c1 = new Cone(5, 5);
        Cone c2 = new Cone();
        System.out.println(Cone.getnbCones());
        System.out.println(c1.toString() + c2.toString());
    }
}