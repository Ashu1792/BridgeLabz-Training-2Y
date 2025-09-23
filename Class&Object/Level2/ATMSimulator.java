package Level2;

public class ATMSimulator {

    // BankAccount class definition
    static class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;

        // Constructor to initialize account details
        BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Method to deposit money
        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited ₹" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Method to withdraw money (only if sufficient balance exists)
        void withdraw(double amount) {
            if (amount <= balance && amount > 0) {
                balance -= amount;
                System.out.println("Withdrew ₹" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        // Method to display current balance
        void displayBalance() {
            System.out.println("Account Holder : " + accountHolder);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("SHIVAM", "ACC20250915", 10000.00);

        // Simulate ATM operations
        account.displayBalance();
        account.deposit(2500.00);
        account.withdraw(4000.00);
        account.withdraw(10000.00); // Should trigger insufficient balance
        account.displayBalance();
    }
}