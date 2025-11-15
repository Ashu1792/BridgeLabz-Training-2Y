package org.example.Functional_Interface;

import java.util.*;

interface payment{
    void pay(String paymentWay);
}

class method implements payment{
    public void pay(String paymentWay){
        System.out.print("Paid using "+paymentWay);
    }
}

public class DigitalPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method work = new method();
        System.out.print("By which method do you want to pay(UPI/Credit Card/Wallet): ");
        String n = input.nextLine();
        String m=n.toLowerCase();
        if (m.equals("upi")) {
            work.pay(n);
        }
        else if (m.equals("credit card")) {
            work.pay(n);
        }
        else if (m.equals("wallet")) {
            work.pay(n);
        }
        else {
            System.out.print("Invalid input");
        }
    }
}