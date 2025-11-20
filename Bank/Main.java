public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("FR76 1234 5678 9012 3456 7890 123", 50000);

        account.deposit(2500);
        System.out.println(account.getBalenceInCents());
        System.out.println(account.getRormattedBalence());

        account.withdraw(10000);
        System.out.println(account.getBalenceInCents());
        System.out.println(account.getRormattedBalence());
    }
}
