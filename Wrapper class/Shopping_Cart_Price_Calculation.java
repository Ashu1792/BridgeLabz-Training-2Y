package Wrapper_Class;
import java.util.*;

public class Shopping_Cart_Price_Calculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of price you want to calculate:");
		int no = input.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<no;i++) {
			System.out.println("Enter the price:");
			String n = input.next();
			list.add(n);
		}
		ArrayList<Integer> price = new ArrayList<>();
		int sum=0;
		for(int i=0;i<no;i++) {
			try {
				price.add(Integer.parseInt(list.get(i)));
				sum+=Integer.parseInt(list.get(i));
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid input type.");
			}
		}
		System.out.println("Total price is "+sum);
	}
}
