package org.example.Functional_Interface;

import java.util.*;

@FunctionalInterface
interface DoublePredicate{
    void temperature();
}

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature of room: ");
        int temp = input.nextInt();
        if(temp>35){
            DoublePredicate alert = () -> System.out.print("Alert!\nTemperature crossed the threshold.");
            alert.temperature();
        }
        else{
            DoublePredicate alert = () -> System.out.print("All good");
            alert.temperature();
        }
    }
}
