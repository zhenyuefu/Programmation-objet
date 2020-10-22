public class TrianglePascal {
    private int[][] triangle;

    public TrianglePascal(int nbLignes) {
        triangle = new int[nbLignes][];
        for (int i = 0; i < nbLignes; i++) {
            triangle[i] = new int[i + 1];
        }

    }

    public void remplirTriangle() {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if ((j == 0) || (j == i))
                    triangle[i][j] = 1;
                else
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                s += triangle[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }
}