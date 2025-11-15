//package org.example.Functional_Interface;

import java.util.*;

interface Rental{
    void rent(String vehicle);
    void returnVehicle(String vehicle);
}

class VehicleRental implements Rental{
    public void rent(String vehicle){
        System.out.print("You have rented a "+vehicle);
    }
    public void returnVehicle(String vehicle){
        System.out.print("You have returned the rented "+vehicle);
    }
}

public class MultiVehicleRentalSystem {
    public static void main(String[] args) {
        VehicleRental work = new VehicleRental();
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want Rent or Return: ");
        String r = input.next();
        if(r.equals("Rent")) {
            System.out.print("Which vehicle do you want to rent(Cars, Bikes or Buses): ");
            String n = input.next();
            if (n.equals("Car")) {
                work.rent(n);
            }
            else if (n.equals("Bike")) {
                work.rent(n);
            }
            else if (n.equals("Bus")) {
                work.rent(n);
            }
            else {
                System.out.println("Invalid Input");
            }
        }
        else if (r.equals("Return")) {
            System.out.print("Which vehicle do you want to return(Cars, Bikes or Buses): ");
            String n = input.next();
            if (n.equals("Car")) {
                work.returnVehicle(n);
            }
            else if (n.equals("Bike")) {
                work.returnVehicle(n);
            }
            else if (n.equals("Bus")) {
                work.returnVehicle(n);
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}