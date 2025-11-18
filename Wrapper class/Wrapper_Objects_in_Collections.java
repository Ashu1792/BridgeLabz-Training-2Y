package Wrapper_Class;

import java.util.*;

public class Wrapper_Objects_in_Collections {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		double[] prices = {10.5, 20.0, 35.75, 5.5};
		for(int i=0;i<prices.length;i++) {
			list.add(prices[i]);
		}
		Double x=list.get(0);
		Double sum=0.0;
		for(int i=1;i<prices.length;i++) {
			if(x<list.get(i)) {
				x=list.get(i);
			}
			sum+=list.get(i);
		}
		Double avg=sum/prices.length;
		System.out.println("The highest price: "+x);
		System.out.println("The average price: "+avg);
	}
}
