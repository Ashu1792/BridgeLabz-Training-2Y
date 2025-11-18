package Wrapper_Class;

import java.util.*;

public class Auto_boxing_and_Auto_unboxing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter 5 int values");
		for(int i=0;i<5;i++) {
			System.out.print("Enter value "+(i+1)+":");
			int n = input.nextInt();
			list.add(n);
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=list.get(i);
		}
		System.out.println(sum);
	}
}
