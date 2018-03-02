/*
 Abraham Estrada
 This program will ask the user to input two integers a and b
 After it will get the sum of even numbers within the two integers,
 Then the product of all the numbers between a and b,
 then the sum of all squares within the two integers,
 then it will show the power of 2 using the numbers from a to b as exponents.
 */
import java.util.Scanner;

public class HW07P01 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		
		
		int sumEven = 0;
		int product = 1;
		int squared = 0;
		int squareSum=0;
		
		// allows the user to input the integers
		System.out.print("Enter an input for integers a and b: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		// change a so that it can loop with different integers.
		int count = a;
		int count2 = a;
		int exponent = a;
		String power2;
		//This prints out the sum of all even numbers between a and b.
		while(count <= b){
			if(count %2 == 0){
				sumEven+= count;
				count+=2;
			}
			else{
				count+=1;
			}
		}
		
		System.out.println("The sum of all the even numbers between a and b : "+ sumEven);
		
		//This prints the product of all the numbers between a and b. 
		while(a <= b){
			product = product * a;
			a++;
		}
		
		System.out.println("The product of all the numbers between a and b : " + product);
		
		//This prints the sum of squares between a and b.
		while (count2 <= b){
			squared = (count2*count2);
			squareSum+= squared;
			count2++;
		}
		
		System.out.println("The sum of all squares between a and b: " + squareSum);
		
		// this shows the powers of two using the numbers from a to b as the integers.
		System.out.print("Powers of Two: ");
		while(exponent <= b){
			
			if (exponent == b){
				System.out.printf((int)Math.pow(2,exponent) + ". ");
			}
			else{
				System.out.printf((int)Math.pow(2,exponent) + ", ");
			}
			
			exponent++;
		}
		
	}
}
