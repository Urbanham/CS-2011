/*
 Abraham Estrada 
 This program will Finds the mean and the standard deviation of the positive numbers that are entered into in.
 it will not allow other negative numbers other than -1
 */
import java.util.Scanner;

public class HW07P03 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter positive numbers (-1 to end the input): ");
		double data = sc.nextDouble();
		
		double counter = 0;
		double sum = 0;
		double square = 0;
		double coDiv;
		double sumSquare;
		double standardDev;
		
		while(data < -1){
			System.out.print("ERROR! Enter only positive numbers: ");
			data = sc.nextDouble();
		}
		
		while(data != -1.0){
			sum+=data;
			square += Math.pow(data,2);
			data = sc.nextDouble();
			counter++;
		}
		
		coDiv = 1/counter;
		
		sumSquare = Math.pow(sum, 2);
		
		standardDev = Math.sqrt(( (square) - ((coDiv) * sumSquare)) / (counter - 1));
		System.out.println("Mean:\t\t " + sum/counter);
		System.out.println("Deviation:\t " + standardDev);
		
	}
}
