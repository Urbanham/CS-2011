/*
 * Abraham Estrada 
 * This program makes a pattern of numbers which is the first on and a pattern of letters for the second one. 
 * The patterns are opposite from eachother the first goes from highest to low going left to right 
 * the second goes from high letter to 
 */
import java.util.Scanner;

public class HW08P04 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		//Enters the amount they want for the first pattern.
		
		System.out.print("How many rows for Pattern 1?: ");
			
		int rowPattern1=s.nextInt();
			
		//This is the scenario for the first pattern. equal counter to the first number input then count down.
		//On row is the numbers on the row they will be -- so that they will show the next number under by - 1 every time.
		while(rowPattern1 <=0 || rowPattern1 >999){
				System.out.println("Value must be from 1 through 999");
				System.out.println("How many rows for pattern 1?: ");
				rowPattern1=s.nextInt();
			}
		
		for( int number = 0; number < rowPattern1; number++){
			
			int onRow=rowPattern1;
			
			for(int zero =0;zero <= number; zero++,onRow--){
				System.out.printf("%5d",onRow);
			}
			System.out.println("");
		}
		
		
		System.out.print("How many rows for Pattern 2?: ");
			
			int rowPattern2=s.nextInt();
		// confusing at first however this one goes from last to start it is reversed from the last one
		//I had the validation in the for loop which would cause it not to run.
		
			while(rowPattern2 <=0 || rowPattern2>26){
				System.out.print(" Value must be from 1 - 26 please try again");
				rowPattern2=s.nextInt();
			}
		
		int counter = rowPattern2;
		
		for(int singleLetter = 0; singleLetter < rowPattern2;counter--, singleLetter++) {
			
			char a='A';
			for(int letters=0; letters < counter; letters++,a++){
			//if the character is odd it will be uppercase the .printf statements needed to have c for this one due to it being a chacter
				if(a% 2 == 1){
					System.out.printf("%5c",a);
				}
				//if the character is even then it will be a lowercase in the pattern 
				
				else{
					System.out.printf("%5c",Character.toLowerCase(a));
				}
			}
			
			System.out.println("");
		}
	}
}