package encapsulation;

class BankAccount {

    // 🔒 Encapsulated fields (data hiding)
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    private static final double RATE = 5.0; // interest rate constant

    // ✅ Constructor (object creation)
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {

        this.accountNumber = accountNumber;

        if (accountHolderName != null && accountHolderName.length() > 0) {
            this.accountHolderName = accountHolderName;
        } else {
            this.accountHolderName = "Unknown";
        }

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // ✅ Getters (read-only access)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ Controlled update (setter only where logical)
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && accountHolderName.length() > 0) {
            this.accountHolderName = accountHolderName;
        }
    }

    // ✅ Business operations
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // ✅ Interest calculation (no stored variable needed)
    public double calculateInterest() {
        return (balance * RATE) / 100;
    }
}

public class improvedBankex {

    public static void main(String[] args) {

        // object creation using constructor
        BankAccount acc = new BankAccount(1222, "Rahul", 10000.0);

        acc.setAccountHolderName("Raj");
        acc.deposit(1000.0);
        acc.withdraw(3001.0);

        System.out.println(
                acc.getAccountHolderName() + " "
                        + acc.getAccountNumber() + " "
                        + acc.getBalance() + " "
                        + acc.calculateInterest());
    }
}