import java.util.ArrayList;
public class BankManager {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("S123", "Vaishnavi", 0.02);
        CheckingAccount ca = new CheckingAccount("C456", "Vaishnavi", 500);

        accounts.add(sa);
        accounts.add(ca);

        System.out.println("Initial Account Details:");
        for (BankAccount acc : accounts)
            System.out.println(acc instanceof SavingsAccount ? ((SavingsAccount) acc).getAccountDetails() :
                               ((CheckingAccount) acc).getAccountDetails());

        sa.deposit(200);
        ca.withdraw(100);
        sa.applyInterest();

        System.out.println("\nAfter Transactions:");
        for (BankAccount acc : accounts)
            System.out.println(acc instanceof SavingsAccount ? ((SavingsAccount) acc).getAccountDetails() :
                               ((CheckingAccount) acc).getAccountDetails());
    }
}
