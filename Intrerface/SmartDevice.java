//package org.example.Functional_Interface;

import java.util.*;

interface SmartControl{
    void turnOn(String device);
    void turnOff(String device);
}

class function implements SmartControl{
    public void turnOn(String device){
        System.out.println("Turn ON "+device);
    }
    public void turnOff(String device){
        System.out.println("Turn OFF "+device);
    }
}

public class SmartDevice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        function work = new function();
        if (n.equals("Turn On")) {
            work.turnOn("Lights");
            work.turnOn("ACs");
            work.turnOn("TVs");
        }
        else{
            work.turnOff("Lights");
            work.turnOff("ACs");
            work.turnOff("TVs");
        }
    }
}
