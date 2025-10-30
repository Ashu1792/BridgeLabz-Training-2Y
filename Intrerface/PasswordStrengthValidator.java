package org.example.Functional_Interface;
import java.util.*;

interface validator{
    static void password(String str){
        boolean haslowercase = false;
        boolean hasuppercase = false;
        boolean hasnumerical = false;
        boolean hasspecialsymbols = false;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                haslowercase = true;
            }
            else if(Character.isUpperCase(ch)){
                hasuppercase = true;
            }
            else if(Character.isDigit(ch)){
                hasnumerical = true;
            }
            else if("!@#$%^&*?/".contains(String.valueOf(ch))){
                hasspecialsymbols = true;
            }
        }

        if(haslowercase && hasuppercase && hasnumerical && hasspecialsymbols){
            System.out.print("Strong password.");
        }
        else if(haslowercase && hasuppercase && hasnumerical){
            System.out.print("Medium password.");
        }
        else if(haslowercase && hasuppercase){
            System.out.print("Weak password.");
        }
        else if(haslowercase){
            System.out.print("Weak password.");
        }
        else{
            System.out.print("Invalid input");
        }
    }
}

public class PasswordStrengthValidator implements validator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password for Strength Validation: ");
        String n = input.next();
        validator.password(n);
    }
}
