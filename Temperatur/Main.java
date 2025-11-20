public class Main {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(25.0);
        System.out.println(t1.getValue());

        Temperature t2 = new Temperature(-300.0);

        Temperature t3 = new Temperature(20.0);
        t3.setValue(-500.0);
    }
}
