public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("user@example.com");
        System.out.println(email1.getValue());
        System.out.println(email1);

        Email email2 = new Email("invalidEmail");
        System.out.println(email2);
    }
}
