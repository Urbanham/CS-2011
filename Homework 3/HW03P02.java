/*
Abraham Estrada 
This program allows you to solve the quadratic equation
using its formulas. It will also let you know how many roots the input will have, and show you those roots.

*/

import java.util.Scanner;

public class HW03P02{
	public static void main(String[] args){
		Scanner userInput = new Scanner (System.in);

		Double a;
		Double b;
		Double c; 
		double rootOne;
		double rootTwo;
		

		// input your a b and c

		System.out.print("Enter the a, b, and c: ");
		a = userInput.nextDouble();
		b = userInput.nextDouble();
		c = userInput.nextDouble();

		Double discriminant = (b*b) - (4 * a * c);
		


		//The formula for root 1

		rootOne = (- b + Math.sqrt(discriminant))/ (2 * a);
		// The formula for root 2 
		rootTwo = (- b - Math.sqrt (discriminant))/ (2 * a);

		if (discriminant == 0.0){
			System.out.print(" The equation has one root " + rootOne);
		}

		else if (discriminant > 0.0) {
			System.out.print("The equation has two roots " + rootOne +" "+ rootTwo);

		}
		else{
			System.out.print("The equation has no roots");
		}
	}
}