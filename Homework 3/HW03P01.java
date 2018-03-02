/*
Abraham Estrada 
This program will tell your if your number is positive 
or negative. As well as tell you that your number is greater
than one million by stating it is large,
or that is is smaller than one by stating that it is small.

*/

/*
Abraham Estrada
In this program you would enter a floating point number, and the program will tell you if the number
is positive or negative. Also if it is small or large.
*/

import java.util.Scanner;

public class HW03P01{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 
		double number;
		//Enter your floating point number

		System.out.print("Enter a floating-point number: ");
		
		number = userInput.nextDouble();
		
		//If statements for the float points put in.

		if (number == 0.0) {
			System.out.println("Zero");
			}
		else if (number > 0.0) {
			System.out.println("Positive");
		}
		else{
			System.out.println("Negative");
		}
			
		if (Math.abs(number) > 1000000) {
			System.out.println("Large");
		}
		if (Math.abs(number) < 1){
			System.out.println("Small");
		}


	}
}