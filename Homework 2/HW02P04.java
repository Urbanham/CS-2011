import java.util.Scanner;

public class HW02P04{
	public static void main(String[] args){

		Scanner userInput= new Scanner (System.in);
		
		Double celsius;
		Double fahrenheit;

		//user input

		System.out.print("Enter the temperature you wish to convert to fahrenheit: ");
		celsius = userInput.nextDouble();

		fahrenheit = (9.0/5.0) * celsius + 32 ; 

		System.out.println("Celsius is " + celsius + " fahrenheit is " + fahrenheit);

		//celsius to fahrenheit

		System.out.println("Enter the temperature you wish to convert to celsius: ");
		fahrenheit= userInput.nextDouble();
		celsius =  (fahrenheit - 32) * (5.0/9.0);

		// results 


		System.out.print(fahrenheit +"Fahrenheit is " + celsius + "Celsius");

	}
}