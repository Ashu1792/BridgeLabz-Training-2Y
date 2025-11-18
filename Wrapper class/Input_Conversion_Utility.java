package Wrapper_Class;
import java.util.*;

public class Input_Conversion_Utility {
	public static int safeParseInt(String input) {
		try {
			Integer.parseInt(input);
		}
		catch(NumberFormatException e) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string value: ");
		String n = input.next();
		System.out.println(safeParseInt(n));
	}
}
