/*
Abraham Estrada
This program will allow the user to find out his or her bill for their internet package. If the have the cheapest package they will be told their savings 
if they would switch to the higher packages.
*/

import java.util.Scanner;

public class HW04P05{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 

		double intPack;
		double month;
		double hours;

		//user inputs their package month and how many hours used.

		System.out.println("What package do you have? 1,2, or 3: ");
		intPack = userInput.nextDouble();

		System.out.print("How many months are you being billed?: ");
		month = userInput.nextDouble();

		System.out.print("How many hours of service did you use?: ");
		hours = userInput.nextDouble();

		// do not allow them to use negatives and numbers higher than the amount of packages.
		if(intPack < 0 || intPack > 3){
			System.out.println("Cannot user negative numbers or numbers greater than 3!");
			System.exit(1);
		}
		//do not allow more months than there are!
		if(month < 0 || month > 12){
			System.out.println("Your months are negative or exceed 12!");
			System.exit(1);
		}
		//do not allow negative hours 
		if (hours < 0){
			System.out.println("Your hours are negative!");
			System.exit(1);
		}
		// hours cannot pass the amount of hours in a month for months with 31 days 
		if (month == 1 || month == 3 || month == 5|| month == 7||month == 8|| month == 10 || month == 12){
			if (hours > 744){
				System.out.println("Hours exceed hours in a month!");
				System.exit(1);
			}
		}
		// hours cannot exceed the amount of hours in a month for 30 day months
		if (month == 4 || month == 6 || month == 9|| month ==11){
			if (hours > 720) {
				System.out.println("Hours exceed hours in a month!");
				System.exit(1);
			}
		}
		//hours cannot exceed the hours in a month for february since it is the only one with 29 days
		if (month == 2){
			if (hours > 672){
				System.out.println("Hours exceed hours in a month!");
				System.exit(1);
			}
		}
		//This is the price of the package and the bill if it exceeds 10 hours and it is pack 1 it charges the 2 dollars per hour
		double packageOne = 15.95;
		double packageTwo = 20.95;
		double packageThree = 30.99;
		double bill = packageOne + (hours - 10) * 2.00;
		double billTwo = packageTwo + (hours - 20) * 1.00;
		
		if (intPack == 1){
		
			if (hours > 10){
		
				System.out.println("Your bill is " + bill);
			
				double savingsOne = bill - billTwo;
			
				System.out.println("Savings if you purchase package two! " + savingsOne);

				double billThree = bill - packageThree;
				System.out.println("Savings if you purchase package three! " + billThree);
				System.exit(1);
			}
			else{
				System.out.println("Your bill is " + packageOne);
			}
		}
		//This is for pack 2 and if over 20 hours it will charge the extra dollar per hour
		// in pack 3 it is 30 dollars regardless due to it being unlimited. 
		if (intPack == 2) {
			if (hours > 20){
				System.out.println("Your bill is " + billTwo);
				double savingsTwo = billTwo - packageThree; 
				System.out.println("Savings if you purchase package three " + savingsTwo);
			}

			else {
				System.out.println("Your bill is " + packageTwo);
			}
		}	

		if (intPack == 3){
			System.out.println("Your bill is " + packageThree);
		}

		



	}
}