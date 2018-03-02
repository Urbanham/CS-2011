/*
 * Abraham Estrada 
 * This program will allow the user to make up a password and see if it is valid if it fits all criteria it will state password is valid if not then you will be told what the problem is.
 */
import java.util.Scanner;


public class HW09P01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//user inputs their password
		System.out.print("Enter a valid password: ");
		String password = s.nextLine();
		int length = password.length();
		System.out.println(password);
		//these are the uses of the other methods
		totalLetters(password,length);
		hasUppercase(password,length);
		digits(password,length);
		letters(password,length);
		nonAlpha(password,length);
		//Used a counter to get if it is true. Did not understand how to split this into another method.
		
		int passvalid=0;
		
		if(totalLetters(password,length)==true){
			passvalid++;
		}
		else {
			System.out.println("Your password is not long enough!");
		}
		if (hasUppercase(password,length) == true){
			passvalid++;
		}
		else{
			System.out.println("Not enought uppercase letters!");
		}
		if (digits(password,length) == true){
			passvalid++;
		}
		else{
			System.out.println("Not enough digits. ");
		}
		if (letters(password,length) == true){
			passvalid++;
		}
		else{
			System.out.println("Not enough letters ");
		}
		if (nonAlpha(password,length) == true){
			passvalid++;
		}
		else{
			System.out.println("Not enough alpha-numeric characters. ");
		}
		if(passvalid==5){
			System.out.print("The password is valid.");
		}
		else {
			System.out.print("The password is not valid");
		}
		
	}
	//This method makes sure it is 13 or more
	public static boolean totalLetters(String message, int length){
		for(int i =0; i<=length; i++){
			if(!(length >= 13)){
				return false;
			}
			
		}
			return true;
	}
	
	//This makes sure it is uppercase and has atleast 3 in it.
	public static boolean hasUppercase(String message, int length){
		int counter = 0;
		for(int i = 0; i < length; i++){
			char upper = message.charAt(i);
			if(Character.isUpperCase(upper)){				
			counter++;
			}
		}
		if (counter >=3){
			return true;
		}
		else{
			
			return false;
		}
	
	}
	//this makes sure that a this is digits and has atleast 4
	public static boolean digits(String message, int length){
		int counter = 0;
		for (int i = 0; i < length; i++) {
		    if (Character.isDigit(message.charAt(i))) {
		        counter++;
		    }
		}
		
		if(counter >= 4){
			
			return true;
		}
		else{
			return false;
		}
	}
	// this makes sure that atleast 7 letters regardless of case are in the string
	public static boolean letters(String message, int length){
		int counter = 0;
		for (int i = 0; i < length; i++) {
		    if (Character.isLetter(message.charAt(i))) {
		        counter++;
		    }
		}
		if(counter >= 7){
			
			return true;
		}
		else{
			
			return false;
		}
	}
	// this makes sure that non alphanumerics are in the password and that two are used
	public static boolean nonAlpha(String message, int length){
		int counter = 0;
		for (int i = 0; i < length; i++) {
		    if (message.charAt(i) >= '!' && message.charAt(i) <= '+' && message.charAt(i)=='@') {
		        counter++;
		    }
		}
		if(counter >= 2){
			
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	
}
