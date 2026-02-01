class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    public String getAccountDetails() {
        return "Savings Account #" + getAccountNumber() + ", Balance: $" + String.format("%.2f", getBalance()) +
               ", Rate: " + (interestRate * 100) + "%";
    }
}
