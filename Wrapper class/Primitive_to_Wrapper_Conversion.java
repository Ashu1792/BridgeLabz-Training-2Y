package Wrapper_Class;

import java.util.*;

public class Primitive_to_Wrapper_Conversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int n = input.nextInt();
		Integer y = Integer.valueOf(n);
		System.out.println("Primitive value: "+n);
		System.out.println("Wapper Class: "+y);
	}
}