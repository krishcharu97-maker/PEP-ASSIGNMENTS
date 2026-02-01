class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Deposit amount must be +ve");
    }
    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Withdrawal amount must be +ve");
        else if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("101", "Vaishnavi");
        acc.deposit(5000);
        acc.withdraw(1500);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}