package exceptionHandling;
import java.util.Scanner;
public class Runner {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
		         System.out.print("Enter username: ");
		         String user = sc.nextLine();

		         System.out.print("Enter password: ");
		         String pass = sc.nextLine();

		         LoginSystem.validate(user, pass);
		         System.out.println("Login successful!");
		     } 
		     catch (InvalidCredentialsException e) {
		         System.out.println("Error: " + e.getMessage());
		     }
			 finally {
				 System.out.println("Thank you!");
			 }

		     sc.close();
			
		}
	}