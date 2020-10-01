public class TestLettre {
    public static void main(String[] args) {
        Lettre carc;
        for (char c = 'a'; c <= 'z'; c++) {
            carc = new Lettre(c);
            System.out.println(carc.getCodeAscii());
        }
        for (char c = 'a'; c <= 'z'; c++) {
            carc = new Lettre(c);
            System.out.print(carc.getCarac() + "\t");
            if (carc.getCodeAscii() % 5 == 1)
                System.out.print("\n");
        }
    }
}