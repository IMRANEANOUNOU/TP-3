public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p);

        p.translate(5, 3);
        System.out.println(p);

        Point q = new Point(2, 4);
        System.out.println(q);

        q.translate(-1, 2);
        System.out.println(q);
    }
}
