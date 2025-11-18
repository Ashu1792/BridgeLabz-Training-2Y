package Collection.Set_Interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Symmetric_Difference {
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
		ArrayList<Integer> numd = new ArrayList<>(numb);
		ArrayList<Integer> numc = new ArrayList<>(numa);
		ArrayList<Integer> newnum = new ArrayList<>();
		for(int i=0;i<numc.size();i++) {
			if(!numd.contains(numc.get(i))) {
				newnum.add(numc.get(i));
			}
		}
		for(int i=0;i<numd.size();i++) {
			if(!numc.contains(numd.get(i))) {
				newnum.add(numd.get(i));
			}
		}
		for(int i=0;i<newnum.size();i++) {
			System.out.print(newnum.get(i)+" ");
		}
	}
}
