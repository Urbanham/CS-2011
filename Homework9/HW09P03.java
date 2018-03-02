/*
 * Abraham Estrada 
 * This program will use a scanner to look into a file and use the contents of the file of numbers to take the standard 
 * deviation of them.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.File;

public class HW09P03 {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		//inputs their file name
		System.out.println("Enter the name of the File: ");
		
		String fileName = (s.nextLine());
		
		//this is the standard dev method
		double standardDevFin = deviation(new File(fileName));
		
		System.out.print("The standard deviation of the values in this file is: "+standardDevFin);
		
	}
	
	public static double deviation(File inputFile){
		Scanner s = new Scanner (System.in);
		//searches for the input if not found will exit
		s = null;
		try { 
			s = new Scanner(inputFile);
		} 
		catch (FileNotFoundException e){
			System.out.println("File not found, will now exit!");
			System.exit(1);
		}
		//declare my variables to get the standard dev.
		int counter=0;
		double sum = 0;
		double square = 0;
		double coDiv;
		double sumSquare;
		double standardDev;
		double data;
		
		// while data is in the folder it will get each number out. using the next double.then it will add each as the sum
		//after it will then add and the squared data
		while(s.hasNext()){
			data = s.nextDouble();
			sum += data;
			square +=Math.pow(data, 2);
			counter++;
		}
		coDiv = 1/counter;
		sumSquare = Math.pow(sum,2);
		
//		standardDev = Math.sqrt(( (square - ((coDiv) * sumSquare)) / (counter - 1)));
		standardDev = Math.sqrt( (square - (((Math.pow(sum, 2))) * (1.0 / counter))) / (counter -1));
		
		return standardDev;
		
	}
}


