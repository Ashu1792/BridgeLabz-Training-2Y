package Collection.Set_Interface;
import java.util.*;

public class Check_if_Two_Sets_Are_Equal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<Integer> numa = new HashSet<>();
		HashSet<Integer> numb = new HashSet<>();
		System.out.print("Enter the length of set 1: ");
		int n1 = input.nextInt();
		System.out.print("Enter the length of set 2: ");
		int n2 = input.nextInt();
		for(int i=0;i<n1;i++) {
			System.out.print("Enter the element of set 1: ");
			int num = input.nextInt();
			numa.add(num);
		}
		for(int i=0;i<n2;i++) {
			System.out.print("Enter the element of set 2: ");
			int num = input.nextInt();
			numb.add(num);
		}
		if(numa.equals(numb)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
