public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.width = 5.0;
        rect1.height = 3.0;

        rect2.width = 10.0;
        rect2.height = 4.0;

        System.out.println("Area of rectangle 1: " + (rect1.width * rect1.height));
        System.out.println("Area of rectangle 2: " + (rect2.width * rect2.height));
    }
}
