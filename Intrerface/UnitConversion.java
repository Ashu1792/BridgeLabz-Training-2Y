package org.example.Functional_Interface;
import java.util.*;

interface Convertor{
    static void unitcon(String type, int value){
        if(type.equals("Distance")){
            System.out.print(value+"km in miles is "+0.621371*value);
        }
        else if (type.equals("Weight")) {
            System.out.print(value+"kg in lbs is "+2.204623*value);
        }
        else{
            System.out.print("Invalid input");
        }
    }
}

public class UnitConversion implements Convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit want to convert(Distance or Weight): ");
        String unit = input.next();
        System.out.print("Enter the value: ");
        int val = input.nextInt();
        Convertor.unitcon(unit,val);
    }
}
