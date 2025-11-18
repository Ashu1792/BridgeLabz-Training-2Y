package Collection.List_Interface;

import java.util.*;

public class Reverse_a_List {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		LinkedList<Integer> listb = new LinkedList<>();
		lista.add(1);
		listb.add(1);
		lista.add(2);
		listb.add(2);
		lista.add(3);
		listb.add(3);
		lista.add(4);
		listb.add(4);
		lista.add(5);
		listb.add(5);
		for(int i=lista.size()-1;i>=0;i--) {
			System.out.print(lista.get(i)+" ");
		}
		System.out.println("");
		for(int i=lista.size()-1;i>=0;i--) {
			System.out.print(listb.get(i)+" ");
		}
	}
}
