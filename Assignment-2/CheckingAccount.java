class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(String accountNumber, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Withdrawal amount must be +ve");
        else if (getBalance() - amount < -overdraftLimit)
            System.out.println("Withdrawal exceeds overdraft limit!");
        else
            deposit(-amount); 
    }
    public String getAccountDetails() {
        return "Checking Account #" + getAccountNumber() + ", Balance: $" + String.format("%.2f", getBalance()) +
               ", Overdraft Limit: $" + String.format("%.2f", overdraftLimit);
    }
}
