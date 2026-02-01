import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0; // initial balance
        int choice;

        while (true) {
        
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Your balance: $" + balance);
                case 2 -> {
                    System.out.print("Enter deposit amount: $");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) balance += deposit;
                    else System.out.println("Invalid amount!");
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: $");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) balance -= withdraw;
                    else System.out.println("Insufficient/invalid amount!");
                }
                case 4 -> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return; // stop program
                }
                default -> System.out.println("Invalid choice! Enter 1-4.");
            }
        }
    }
}
