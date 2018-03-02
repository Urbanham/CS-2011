/*
 Abraham Estrada
 This program will allow the user to find what their pay will be when taking taxes out of their pay.
 */

import java.util.Scanner;

public class HW06P01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		//the data types for the data going to be used.
		
		int idNumber;
		char name;
		double hoursWorked;
		double hourlyPay;
		double fedTax;
		double stateTax;
		
		//User inputs
		
		System.out.print("Enter your Id number: ");
		idNumber =s.nextInt();
		
		
		System.out.print("Enter Employee name: ");
		
		String s1 = s.next();
		String s2 = s.next();
		String s3 = s.next();
		
		System.out.print("Enter hours worked: ");
		hoursWorked = s.nextDouble();
		
		System.out.print("Enter hourly pay: ");
		hourlyPay = s.nextDouble();
		
		System.out.print("Enter Federal tax witholding rate: ");
		fedTax = s.nextDouble();
		
		System.out.print("Enter State tax witholding rate: ");
		stateTax = s.nextDouble();
		//Calculations and creating all the math for the Taxes.
		double fedTaxTwo = fedTax * 100.0;
		double stateTaxTwo = stateTax *100.0;
		
		double grossPay =  hoursWorked * hourlyPay; 
		double grossPayRoundFed = grossPay * 1000 / 1000.0;
		double grossPayRoundState = (grossPay);
		
		double fedTaxWithold = grossPayRoundFed * fedTax;  
		
		double stateTaxWithold = grossPayRoundState * stateTax; 
		double totalDeduction = stateTaxWithold + fedTaxWithold; 
		double netPay = (grossPay - totalDeduction);
		
		//Validate the inputs make sure they arn't negative!
		
		if(idNumber < 0 ){
			System.out.println("ID Number cannot be negative");
			System.out.println("Program will now exit");
			System.exit(0);
		}
		if(stateTax < 0 || fedTax < 0){
			System.out.print("Tax cannot be negative!");
			System.exit(0);
		}
		if(hoursWorked < 0 || hourlyPay < 0){
			System.out.print("Hours and pay cannot be negative!");
			System.exit(0);
		}
		System.out.println(" ");
		
		
		//The final results of what was input by the user.
		System.out.println("-------------------------Payroll Report-------------------------");
		
		System.out.println("Employee First Name: \t \t " + s1);
		System.out.println("Employee Middle Name: \t \t " + s2);
		System.out.println("Employee Last Name: \t \t " + s3);
		System.out.println("Employee Id number: \t \t " + idNumber);
		System.out.println("Hours worked: \t \t  \t" + hoursWorked);
		System.out.println("Pay rate: \t \t  \t" + "$"+ hourlyPay);
		System.out.println("Gross Pay: \t \t  \t" + "$" +grossPay);
		System.out.println("Deductions: \n   Federal Witholding" + "(" + (fedTaxTwo) +")" +": \t" +  "$"+fedTaxWithold);
		System.out.println("   State Witholding(" + (stateTaxTwo) + ")" +" \t" + "$" +(Math.round(stateTaxWithold *100.0)/100.0));
		System.out.println("   Total deduction: \t \t" + "$"+(Math.round(totalDeduction *100.0)/100.0));
		System.out.println("Net Pay: \t \t \t" + "$" + (Math.floor(netPay * 100.0)/100.0));
		System.out.println("----------------------------------------------------------------");
	}
}