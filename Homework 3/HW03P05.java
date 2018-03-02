/*
 Abraham Estrada
 This program will convert the number of seconds put in to its corresponding 
 catagory so 60 seconds will be one min and so on.
*/

import java.util.Scanner;


public class HW03P05{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int seconds;
		

		System.out.print("Enter your time in seconds: ");
		seconds = userInput.nextInt();
		
		
		int minutes = (seconds / 60) ;
		int hours = (seconds / 3600);
		int days = (seconds / 86400);
		
		if(seconds >= 86400) {
			System.out.println("your time is " +days+ "days " + hours + " hours " + minutes+ " mins "+ seconds+ " seconds" );

		}
		else if (seconds >= 3600 ){

			System.out.println("your time is "  + hours + " hours " + minutes+ " mins "+ seconds );
		}
		else if (seconds >= 60){
			System.out.println("your time is " +  minutes + "mins "+ seconds + " seconds" );
		}
		else{
			System.out.println("your time is " + seconds + " seconds" );
		}
		
		
		
	}
}
