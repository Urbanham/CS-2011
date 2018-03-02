/*
 Abraham Estrada
 This program allows the user to choose which commands they want to input with roll dance invite and say
 */
import java.util.Scanner;

public class HW06P03 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		 
		System.out.print("Enter your character name: ");
		String name = s.nextLine();
		
		System.out.print("> ");
		String command = s.next();
		String extra = s.nextLine();
		
		if (command.contains("/roll")){
			int randomRoll = 1 +(int)(Math.random()* ((100-1)+1));
			System.out.print(name + " rolled a " + randomRoll);
		}
		else if (command.contains("/dance")){
			System.out.print(name + " performs a lively dance.");
		}
		else if (command.contains("/invite")){
			System.out.print( extra + "has been invited to " + name + "'s party.");
		}
		else if (command.contains("/say")){
			System.out.print(name + " says: " + extra);
		}
		else{
			System.out.println("Not a correct command!");
			System.out.println("Program will now exit!");
			System.exit(0);
		}
	}
}
