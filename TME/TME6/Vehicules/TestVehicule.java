public class TestVehicule {
    public static void main(String[] args) {
        Velo vl = new Velo(15);
        System.out.println(vl.toString());
        vl.transporter("Dijon", "Chalon");
        Voiture vt = new Voiture(50, 50, 4);
        vt.transporter(5, 200);
        Camion c = new Camion(100, 200, 300);
        c.transporter("tuiles", 500);
    }
}
