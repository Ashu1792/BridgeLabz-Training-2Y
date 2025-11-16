import java.util.*;

class BankingSystem {
    
    public static class BankAccount {
        private static String bankName = "Default Bank";
        private static int totalAccounts = 0;
        
        private final int accountNumber;
        private String accountHolderName;
        
        public BankAccount(String accountHolderName, int accountNumber) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            totalAccounts++;
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }
        
        public void displayDetails() {
            if (this instanceof BankAccount) {
                System.out.println("Bank Name: " + bankName);
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Account Number: " + accountNumber);
            } else {
                System.out.println("Not a valid BankAccount object.");
            }
        }

        public static void setBankName(String name) {
            bankName = name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bank name: ");
        String bankNameInput = sc.nextLine();
        BankAccount.setBankName(bankNameInput);
    
        System.out.print("Enter account holder name: ");
        String holderName = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
    
        BankAccount account = new BankAccount(holderName, accNumber);
        account.displayDetails();
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        sc.close();
    }
}