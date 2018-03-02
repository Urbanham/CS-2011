/*
 Abraham Estrada 
 This program allows you to add up a 15 digit number and see what the sum would be of that number.
 */

import java.util.Scanner;

public class HW06P02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		 
		
		System.out.println("Enter a 15 digit number: ");
		String largeNum = s.next();
		
		
		//Make sure only 15 numbers must be put. Im confused on how to make it so only Integers can be put and not letters
				
		int totalNumz = largeNum.length();
			if (totalNumz < 15 || totalNumz > 15){
					System.out.println("The numbers are not equal to 15!");
					System.exit(0);
				}
			
			
		//First make a string for every individual number. Cannot just use next() because no spaces are between the numbers.
		// Need to use substring to pull every number individually and still have the input be one huge number.
		
		String s1 = largeNum.substring(0,1);
		String s2 = largeNum.substring(1,2);
		String s3 = largeNum.substring(2,3);
		String s4 = largeNum.substring(3,4);
		String s5 = largeNum.substring(4,5);
		String s6 = largeNum.substring(5,6);
		String s7 = largeNum.substring(6,7);
		String s8 = largeNum.substring(7,8);
		String s9 = largeNum.substring(8,9);
		String s10 = largeNum.substring(9,10);
		String s11 = largeNum.substring(10,11);
		String s12 = largeNum.substring(11,12);
		String s13 = largeNum.substring(12,13);
		String s14 = largeNum.substring(13,14);
		String s15 = largeNum.substring(14,15);
		
		
		
		//Convert every single number into a int using parse int. This is so you can actually add up each number. 
		int first = Integer.parseInt(s1);
		int second = Integer.parseInt(s2);
		int third = Integer.parseInt(s3);
		int fourth = Integer.parseInt(s4);
		int fifth = Integer.parseInt(s5);
		int sixth = Integer.parseInt(s6);
		int seventh = Integer.parseInt(s7);
		int eighth = Integer.parseInt(s8);
		int nine = Integer.parseInt(s9);
		int tenth = Integer.parseInt(s10);
		int eleventh = Integer.parseInt(s11);
		int twelve = Integer.parseInt(s12);
		int thirteen = Integer.parseInt(s13);
		int fourteen = Integer.parseInt(s14);
		int fifteen = Integer.parseInt(s15);
	
		
			
		//Add up all the new integers.
		int sumOfLargeInput = (first + second + third + fourth + fifth + sixth + seventh+ eighth + nine + tenth + eleventh+ twelve + thirteen + fourteen
				+fifteen);
		
		
		System.out.println("The sum is: " + sumOfLargeInput);
		
	}
}
