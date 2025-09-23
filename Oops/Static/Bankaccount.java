public class Bankaccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public Bankaccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayDetails() {
        if (this instanceof Bankaccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Bankaccount acc1 = new Bankaccount(101, "Alice");
        Bankaccount acc2 = new Bankaccount(102, "Bob");

        acc1.displayDetails();
        acc2.displayDetails();
        Bankaccount.getTotalAccounts();
    }
}