package Collection.List_Interface;
import java.util.*;

public class Remove_Duplicates_While_Preserving_Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		System.out.print("Enter the number of elements you want to enter: ");
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element: ");
			int a = input.nextInt();
			num.add(a);
		}
		for(int i=0;i<num.size();i++) {
			for(int j=i+1;j<num.size();j++) {
				if(num.get(i)==num.get(j)) {
					num.remove(j);
				}
			}
		}
		for(int i=0;i<num.size();i++) {
			System.out.print(num.get(i)+" ");
		}
	}
}
