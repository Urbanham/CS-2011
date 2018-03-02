/*
Abraham Estrada
This program allows the user to find a discounted price for a software they are selling. 
*/

import java.util.Scanner;

public class HW04P01{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 
		double price;
		double sold;
	
		//Enter the price and the number of software bought.

		System.out.print("Enter the cost of the software: ");
		
		price = userInput.nextDouble();

		System.out.print("Enter the amount sold: ");
		
		sold = userInput.nextDouble(); 
				
		double total = (price * sold);
		
		

		//If statements for the Prices and sold amounts put in.
		if( sold < 0 && price < 0) {
			System.out.println("Negative numbers cannot be used");
			System.exit(1);
		}

		if (sold < 10){	
			System.out.println("Total Cost: " + total);
		}
		if(sold >= 10 && sold <= 19){
			double discountOne = (price * .20);
			double dOne= (price - discountOne) * sold;
			System.out.println("Total Cost: " + dOne); 
		}
		else if(sold >= 20 && sold <= 49){
			double discountTwo = (price * .30);
			double dTwo= (price - discountTwo) * sold;
			System.out.println("Total Cost: " + dTwo);
		}
		else if(sold >= 50 && sold <= 99){
			double discountThree = (price * .40);
			double dThree= (price - discountThree) * sold;
			System.out.println("Total Cost: " + dThree);
		}
		else{
			double discountFour = (price * .50);
			double dFour= (price - discountFour) * sold;
			System.out.println("Total Cost: " + dFour);
		}
	}
}