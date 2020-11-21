public class Simulation {
    private Terrain terrain;
    private Ressource[] ressource;
    private Mineur[] mineur;
    private static final int NB_RESOURCE_MAX = 20;

    /** Constructeur de ressource */
    public Simulation(int nbLigne, int nbColonne, int nbResource, int nbAgent) {
        terrain = new Terrain(nbLigne, nbColonne);
        ressource = new Ressource[nbResource];
        mineur = new Mineur[nbAgent];
        int x = (int) (Math.random() * terrain.nbLignes);
        int y = (int) (Math.random() * terrain.nbColonnes);
        for (int i = 0; i < nbResource; i++) {
            ressource[i] = new Ressource("Dilithium", (int) (Math.random() * NB_RESOURCE_MAX));
            while (!terrain.caseEstVide(x, y)) {
                x = (int) (Math.random() * terrain.nbLignes);
                y = (int) (Math.random() * terrain.nbColonnes);
            }
            terrain.setCase(x, y, ressource[i]);
        }
        for (int i = 0; i < nbAgent; i++) {
            mineur[i] = new Mineur((int) (Math.random() * terrain.nbLignes),
                    (int) (Math.random() * terrain.nbColonnes));
        }
    }

    /** Les mineurs se déplacent vers le point de ressources le plus proche */
    public void moveToRessource(Mineur m) {
        int x, y, minx = -1, miny = -1;
        double distance, minDistance = Double.POSITIVE_INFINITY;
        for (Ressource r : ressource) {
            x = r.getX();
            y = r.getY();
            distance = m.distance(x, y);
            if (distance < minDistance) {
                minDistance = distance;
                minx = x;
                miny = y;
            }
        }
        if (terrain.sontValides(minx, miny))
            m.seDeplacer(minx, miny);
    }

    /** Recueillir les ressources des mineurs */
    public void collectResource(Mineur m) {
        int x = m.getX();
        int y = m.getY();
        int capacity = m.getCapacity();
        Ressource r = terrain.getCase(x, y);
        int quantite = r.getQuantite();
        if (quantite > capacity) {
            r.setQuantite(quantite - capacity);
            System.out.println(m + " a recueilli " + capacity + " de " + r);
        } else {
            r.setQuantite(0);
            System.out.println(m + " a recueilli " + capacity + " de " + r);
            terrain.videCase(x, y);
        }

    }

    /** En une journée de simulation, les mineurs peuvent déplacer ou collecter */
    public void simulate() {
        int x, y;
        for (Mineur m : mineur) {
            x = m.getX();
            y = m.getY();
            if (terrain.caseEstVide(x, y)) {
                moveToRessource(m);
            } else {
                collectResource(m);
            }
        }
    }

    /** Afficher les ressources actuellement sur le terrain */
    public void show() {
        terrain.affiche();
        for (Ressource r : ressource) {
            System.out.println(r);
        }
    }
}