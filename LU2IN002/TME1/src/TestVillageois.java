public class TestVillageois {
    public static void main(String[] args) {
        Villageois v1, v2, v3, v4;
        double souleveTotal = 0;
        v1 = new Villageois("Dad");
        v2 = new Villageois("Mom");
        v3 = new Villageois("Son");
        v4 = new Villageois("Bro");
        System.out.println(v1.toString() + "\n" + v2.toString() + "\n" + v3.toString() + "\n" + v4.toString());
        souleveTotal = v1.poidsSouleve() + v2.poidsSouleve() + v3.poidsSouleve() + v4.poidsSouleve();
        System.out.println("Ils peuvent soulever:" + (int) souleveTotal + " kg");
        if (souleveTotal < 100)
            System.out.println("Ils ne peuvent pas soulever le rocher!");
        else
            System.out.println("Ils peuvent soulever le rocher!");
    }
}