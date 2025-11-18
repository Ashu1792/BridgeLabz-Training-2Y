package Collection.List_Interface;
import java.util.*;

public class Rotate_Elements_in_a_List {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		System.out.print("Enter the number of element you want to enter in the ArrayList: ");
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number in list:");
			int a = input.nextInt();
			num.add(a);
		}
		System.out.print("Enter the number to rotate the list: ");
		int m = input.nextInt();
		for(int i=m;i<n;i++) {
			System.out.print(num.get(i)+" ");
		}
		for(int i=0;i<n-m-1;i++) {
			System.out.print(num.get(i)+" ");
		}
	}
}
