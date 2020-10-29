public class Alea {
    public static char lettre() {
        return (char) (int) (Math.random() * (122 - 97 + 1) + 97);
    }

    public static String chaine() {
        String s = "";
        for (int i = 0; i < 10; i++) {
            s += lettre();
        }
        return s;
    }

    private Alea() {
    }
}