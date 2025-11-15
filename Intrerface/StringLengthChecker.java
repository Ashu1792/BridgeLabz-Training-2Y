package org.example.Functional_Interface;

import java.util.*;

@FunctionalInterface
interface LengthChecker{
    void length();
}

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String n = input.nextLine();
        LengthChecker lengthofstring = () -> System.out.print("Length of the entered string is "+n.length());
        lengthofstring.length();
    }
}