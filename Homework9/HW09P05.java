import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class HW09P05 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		//Ask the user for the file name
		System.out.print("Enter the name of the File: ");
				
		String fileName = (userInput.nextLine());	
		
		long credit = creditCard(new File(fileName));
		
	}
	
	public static long creditCard(File input){
		Scanner userInput = new Scanner (System.in);
		userInput = null;
		try{
			userInput = new Scanner(input);
		}
		catch (FileNotFoundException e){
			System.out.println("File not found will now exit!");
		}
		while(userInput.hasNext()){
			if(isValid(userInput.nextLong())){
				System.out.print("Credit card number is valid! \n");
			}
			else{
				System.out.print("Credit card number is invalid! \n");
			}
		}
		return 0;
	}
	
	public static boolean isValid(long number){
		int sumEven = 0;
		int sumOdd = 0;
		boolean result = false;
		int sumOfOdd = 0;
		int sumOfEven = 0;
		if (getSize(number) >= 13 && getSize(number) <=16){
			if (prefixMatched(number,4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number ,37)){
				sumEven = sumOfEven(number);
				sumOdd = sumOfOdd(number);
				result =((sumOfEven + sumOfOdd) % 10 == 0);
			}
		}
		return result;
		
	}
	public static boolean prefixMatched(long number, int d){
		int length = Integer.toString(d).length();
		String numberToString = Long.toString(number);
		String dToString = Integer.toString(d);
		
		for (int i = 0; i < length; i++){
			if(numberToString.charAt(i) != dToString.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static int getSize(long c){
		return Long.toString(c).length();
	}
	
	public static int sumOfEven(long number){
		int sumPlaces = 0;
		String numberToString = Long.toString(number);
		
		for(int i = 0; i <numberToString.length(); i += 2){
			sumPlaces += (getDigit(Character.getNumericValue(numberToString.charAt(i)) * 2));
		}
		return sumPlaces;
	}
	
	public static int getDigit(int number){
		if (Integer.toString(number).length() == 1){
			return number;
		}
		else{
			return ((number % 10) + 1);
		}
	}
	
	public static int sumOfOdd(long number){
		int sumOddPlaces = 0;
		String numberToString = Long.toString(number);
		
		for (int i = 1; i < numberToString.length(); i += 2){
			sumOddPlaces += getDigit(Character.getNumericValue(numberToString.charAt(i)) * 2);
		}
		return sumOddPlaces;
	}
}
