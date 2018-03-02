/*
 Abraham Estrada
 This program is a basic program that tells you if what is input is a lowercase letter, upper case letter, digit, and non alphanumeric.
 It just tells you what was input.
 */
import java.util.Scanner;

public class HW05P04 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 
		
		char letter; 
		int digit;
		char nonNumerical; 
		
		System.out.print("Enter your character: ");
		letter = userInput.next().charAt(0);
		
		int x = (int)letter;
		
		
			
		if(letter >= 'a' && letter <='z'){
			System.out.println("Lowercase letter");
			System.exit(0);
		}
		else if (letter >= 'A' && letter < 'Z'){
			System.out.println("Upper case letter ");
			System.exit(0);
		}
		else if (letter >= '0' && letter <= '9'){
			System.out.println("Digit");
		}
		else {
			System.out.println("Non-alphanumeric");
		}

	}
}
