/*
 * Abraham Estrada
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class finalExam {
	public static void main(String[] args){
		int attendance[][]=readAttendantsAmtsFile("attendance.txt");
		System.out.println();
		double prices[]=readPricesFile("prices.txt");
		System.out.println();
		String movies[]=readMovieFile("movies.txt");
		System.out.println();
		
		System.out.println();
		
	
		displayMoviePrices(attendance,prices,movies);
		System.out.println();
		avgAttend(attendance,movies);
		
	}
	
	
	public static int[][] readAttendantsAmtsFile(String fileName) {
		int attendantsAmts[][];
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File(fileName));
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found! Program will now exit!");
			System.exit(1);
		}
		
		int rowSize = fileScanner.nextInt();
		int colSize = fileScanner.nextInt();
		
		attendantsAmts = new int[rowSize][colSize];
		
		for (int row = 0; row < rowSize; row++) {
			for (int col = 0; col < colSize; col++) {
				attendantsAmts[row][col] = fileScanner.nextInt();	
			}	
		}
		printArr(attendantsAmts);
		return attendantsAmts;
	}
	
	public static String[] readMovieFile(String fileName){
		String movies[];
		
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File(fileName));
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found! Program will now exit!");
			System.exit(1);
		}
		
		int rowSize = fileScanner.nextInt();
		fileScanner.nextLine();
		movies = new String[rowSize];
		for (int row = 0; row < rowSize; row++) {
			movies[row] = fileScanner.nextLine();
			
		}
		
		return movies;
	}
	
	public static double[] readPricesFile(String fileName){
		double price[];
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File(fileName));
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found! Program will now exit!");
			System.exit(1);
		}
		
		int rowSize = fileScanner.nextInt();
		price = new double[rowSize];
		for (int row = 0; row < rowSize; row++) {
			price[row] = fileScanner.nextDouble();
		}
		
		printArr(price);
		return price;
	}
	
	public static void displayMoviePrices(int[][] attendants, double[] prices, String[] movies) {
		double totalPrice[] = new double[movies.length];
		
		
		
		for(int row=0; row < attendants.length; row++){
			double price = 0.0;
			if(row==3){
				System.out.print(movies[row]+ " Cost:\t\t\t");
			}
			else if (row==4){
				System.out.print(movies[row]+ " Cost:\t\t");
			}
			else{
				System.out.print(movies[row]+ " Cost: 		");
			}
			
			for(int col=0; col < attendants[0].length; col++){
				
				for(int pos=0; pos < attendants[row][col]; pos++){
					price += prices[col];
				}
			}
			totalPrice[row] = price;
			System.out.print("$ " + Math.round(price*100.0)/100.0);
            
			System.out.println();
		}	
		System.out.println();
		
		highestCost(totalPrice, movies);
        
		lostCost(totalPrice, movies);
	}	
	public static void highestCost(double[] totalPrice, String[] movies) {
		double max = 0;
		int maxIndex = 0;
		
		for(int row=0; row < movies.length; row++){
			if(max < totalPrice[row]){
				max = totalPrice[row];
				maxIndex = row;
			}
		}
		System.out.println("Highest sales: " + movies[maxIndex]);
	}

	public static void lostCost(double[] allCosts, String[] movies) {
		double min = 5000000000000.0;
		int minIndex = 0;
		for(int row=0; row < movies.length; row++){
			if(min > allCosts[row]){
				min = allCosts[row];
				minIndex = row;
			}
		}
		System.out.println("lowest Sales " + movies[minIndex]);
		
	}
	public static void avgAttend(int[][] attendance, String[] movies){
		
		for(int row = 0; row<attendance.length; row++){
			double sumOfRow = 0;
			double totalAvg = 0;
			for(int col = 0; col< attendance[0].length; col++){
				sumOfRow+=attendance[row][col];
				totalAvg= sumOfRow/attendance[row].length;
				
			}
			System.out.println(movies[row] + " avg is "+ Math.round(totalAvg));
		}
	}
	
	
	public static void printArr(double[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void printArr(String[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
	public static void printArr(int [] [] table){
		for(int row = 0; row<table.length;row++){
			for(int col = 0; col<table[0].length;col++){
				System.out.print(table[row][col]+ " ");
				
			}
			System.out.println("");
		}
	
	}
	
}
