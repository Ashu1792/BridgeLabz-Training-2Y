package Wrapper_Class;

public class Wrapper_to_Primitive_Conversion {
	public static void main(String[] args) {
		Double n = Double.valueOf(45.67);
		System.out.println("Wrapper to Primitive Conversion:");
		System.out.println("Wrapper Double to primitive double: "+n.doubleValue());
		System.out.println("Wrapper Double to primitive int: "+n.intValue());
	}
}
