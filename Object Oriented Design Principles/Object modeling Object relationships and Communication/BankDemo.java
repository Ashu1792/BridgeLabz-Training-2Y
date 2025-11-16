import java.util.*;

class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;

    public Account(String accountNumber, double initialBalance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public Bank getBank() {
        return bank;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + " at " + acc.getBank().getName() + ": Rs. " + acc.getBalance());
        }
    }
}

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Account openAccount(Customer customer, String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance, this);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            addCustomer(customer);
        }
        return account;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer cust1 = new Customer("Amit");
        Customer cust2 = new Customer("Priya");

        bank.openAccount(cust1, "SB1001", 5000);
        bank.openAccount(cust1, "SB1002", 15000);
        bank.openAccount(cust2, "SB2001", 8000);

        cust1.viewBalance();
        cust2.viewBalance();
    }
}
