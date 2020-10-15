public class SuiteNewton {
    public static void main(String[] args) {
        double x, eps;
        x = 67;
        eps = 0.000000001;
        double u1 = x / 2;
        double u2 = ((u1 + x / u1)) / 2;
        while (Math.abs(u2 - u1) > eps) {
            u1 = ((u2 + x / u2)) / 2;
            u2 = ((u1 + x / u1)) / 2;
        }
        System.out.println(u2);
    }
}