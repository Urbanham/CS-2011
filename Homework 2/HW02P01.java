import java.util.Scanner;


public class HW02P01{
		public static void main(String[] args){
			Scanner userInput= new Scanner (System.in);

			double dollar;

			//Get the Dollar amount from the user
			
			System.out.print("Enter your dollar amount: ");
			dollar = userInput.nextDouble();
			
			//Get currency exchange
			final double EURO = dollar * 0.89;
			final double POUNDS = dollar * 0.76; 
			final double YEN = dollar * 101.88; 
			
			//Convert dollar to other currencies 

			System.out.println("Pounds: "+ POUNDS);
			System.out.println("Euros: " + EURO);
			System.out.println("Yen: "+ YEN);


	}

}