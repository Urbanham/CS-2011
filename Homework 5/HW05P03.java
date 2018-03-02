/*
 Abraham Estrada
 This is a unicode character converter using a menu. The menu's choices are not numbers instead they are characters. selecting a converts character to code so A would convert to 65. Selecting b gives code to charater
 and selecting c exits the program.
 */
import java.util.Scanner;

public class HW05P03 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		// The menu choices!
		final String USER_MENU = 
			"a. Convert character to unicode \n"+
			"b. Convert unicode to character. \n"+
			"c. Exit program\n"+
			"Enter (a-c) for choices: ";
		
			final char CONVERT_CHARACTER = 'a';
			final char CONVERT_UNICODE = 'b';
			final char EXIT_CHOICE = 'c';
		//input of the menu!
			System.out.print(USER_MENU);
			char choice = userInput.next().charAt(0);
			
			switch(choice){
				case CONVERT_CHARACTER: 
					System.out.print("Enter the character you wish to convert into unicode: ");
					char letter = userInput.next().charAt(0);
					int unicode= (int) letter;
					
					if(letter < 0){
						System.out.print("Inpute is negative!");
					}
					else {
						System.out.print(unicode);
					}
					break;
				case CONVERT_UNICODE:
					System.out.print("Enter the unicode you wish to convert into a character: ");
					
					int unicodeC = userInput.nextInt();
					char letterC = (char)unicodeC;
					
					if(unicodeC < 0 ){
						System.out.print("Inpute is not a correct unicode!");
					}
					else {
						System.out.print(letterC);
					}
					break;
				case EXIT_CHOICE:
					System.out.println("This program will now close!");
					System.exit(0);
				default:
					System.out.println("ERROR! Menu choice is not correct");
					System.out.println("The program will now exit");
					System.exit(1);
			
			}
			
			
			
	}
}

