public class TestSegment {
    public static void main(String[] args) {
        Segment seg1, seg2;
        int long1, long2;
        seg1 = new Segment(6, 8);
        seg2 = new Segment(12, 5);
        long1 = seg1.longueur();
        long2 = seg2.longueur();
        if (long1 < long2) {
            System.out.println(seg2.toString());
        } else
            System.out.println(seg1.toString());
    }
}