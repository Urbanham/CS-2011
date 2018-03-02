/*
Abraham Estrada 
This program will allow the user to input a number corelating to a day of the week. the user also inputs a number of days elapsed,
then it will tell you todays day and the elapsed day's day.
*/

import java.util.Scanner;

public class HW03P04{
	public static void main(String[] args){
		Scanner userInput = new Scanner (System.in);

		int today;
		int elapedDay;
		
		

		// User enters their day 0 for sunday 6 for saturday
		System.out.print("Enter todays day,(ex. 0 for Sunday 6 for Saturday: ");
		today = userInput.nextInt();

		System.out.print("Enter the number of days elapsed from today: ");
		elapedDay= userInput.nextInt();	
		
		// Result for their day inserted for the today column
		int futureDay = (today + elapedDay) % 7;

		// Todays day input
		if (today == 0){
			System.out.print("Today is Sunday");	
		}
		else if (today == 1){
			System.out.print("Today is Monday");	
		}
		else if (today == 2){
			System.out.print("Today is Tuesday");	
		}
		else if (today == 3){
			System.out.print("Today is Wednesday");	
		}
		else if (today == 4){
			System.out.print("Today is Thursday");	
		}
		else if (today == 5){
			System.out.print("Today is Friday");	
		}
		else{
			System.out.print("Today is Saturday");	
		}

		//The future day with the elapsed and the current day added then mod 7'd 
		
		if (futureDay == 0){
			System.out.print(" and the future day would be Sunday");

		}
		else if (futureDay  == 1){
			System.out.print(" and the future day would be monday");

		}
		else if (futureDay  == 2){
			System.out.print(" and the future day would be Tuesday");

		}
		else if (futureDay == 3){
			System.out.print(" and the future day would be Wednesday");

		}
		else if (futureDay  == 4){
			System.out.print(" and the future day would be Thursday");

		}
		else if (futureDay  == 5){
			System.out.print(" and the future day would be Friday");

		}
		else {
			System.out.print(" and the future day would be Saturday");

		}


	}
}