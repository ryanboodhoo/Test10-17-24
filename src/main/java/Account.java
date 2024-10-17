
public abstract class Account {
    private final int accountNumber;
    private static int counter = 0;
    protected double balance;

    public Account() {
        this.accountNumber = counter++;
    }

    public abstract AccountType getAccountType();

    public void withdraw(double amount) {
        double fee = getTransactionFee(getAccountType());
        if (balance >= amount + fee) {
            balance -= amount + fee;
            System.out.println("Withdraw successful. Fee: " + fee);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
             double newBalance = balance + amount;
            double interest = getInterestRate(newBalance, amount);
            balance = newBalance + interest;

            System.out.println("Deposit successful. Interest added: " + interest);
        }
    }


    public double getInterestRate(double currentBalance, double amount) {
        if (currentBalance >= 1000) {
            return amount * 0.10;
        } else {
            return amount * 0.05;
        }
    }

    public abstract double getTransactionFee(AccountType accountType);

    public String printAccountInfo() {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Account Type: " + getAccountType();
    }

    public static void printTotalNumberOfAccounts() {
        System.out.println("Total accounts created: " + counter);
    }
}