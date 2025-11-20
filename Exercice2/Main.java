public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.setWidth(5.0);
        rect1.setHeight(3.0);

        rect2.setWidth(10.0);
        rect2.setHeight(4.0);

        System.out.println("Area of rectangle 1: " + rect1.area());
        System.out.println("Area of rectangle 2: " + rect2.area());
    }
}
