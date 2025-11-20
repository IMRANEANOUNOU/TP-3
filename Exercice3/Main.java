public class Main {
    public static void main(String[] args) {
        User u1 = new User("said", "mer@example.com");
        User u2 = new User("lambda", "taha@example.com");

        System.out.println(u1);
        System.out.println(u2);

        u2 = u1;

        System.out.println(u1 == u2);
    }
}
