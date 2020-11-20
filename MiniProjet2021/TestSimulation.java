public class TestSimulation {
    public static void main(String[] args) {
        Simulation s = new Simulation(10, 10, 10, 5);
        s.show();
        for (int i = 1; i < 11; i++) {
            System.out.println("---Day " + i + "---");
            s.simulate();
        }
        s.show();
    }
}
