/*
 * Abraham Estrada 
 * This will be a menu that ask the user how if they want to print a random table out or use from a file. 
 * Display the array in table format. (Print the 2D array)
	Calculate and display the sum and average of the entire array.
	Calculate and display the sum and average of each row.
	Calculate and display the sum and average of each column.
	Calculate and display the sum and average of the major and minor diagonals *see below.
	Display the row and col with the highest average.
	Display the row and col with the lowest average.
	this is what it will show for the random table.
	I was not able to get the file to run in my program.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW11P01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//menu switch
				while(true)
					switch(menu()){
					case 1:
						System.out.print("How many rows would you like?: ");
							int rows = s.nextInt();
						System.out.print("How many columns would you like?: ");
							int cols =s.nextInt();						
							int[] [] arr = new int [rows][cols];
						randTable(arr);
						printArr(arr);
						sumOfTable(arr);
						averageOfTable(arr);
						System.out.println();
						sumEachCol(arr);
						System.out.println();
						sumEachRow(arr);
						System.out.println();
						avgEachRow(arr);
						System.out.println();
						avgEachCol(arr);
						System.out.println();
						majorDiagnal(arr);
						majorDiagnalAvg(arr);
						System.out.println();
						minorDiagnal(arr);
						minorDiagnalAvg(arr);
						System.out.println();
						largestAvg(arr);
						largestAvgC(arr);
						System.out.println();
						lowestAvgR(arr);
						minAvgC(arr);
						break;
						
					case 2:
					//findDataInfile(new File(fileName));
							
							
					break;
					case 3: 
						System.out.println("System will now exit.");
						System.exit(0);
					}
	}
	
	public static int menu(){
		Scanner in = new Scanner(System.in);
		//Menu display
		final String MENU = 
				  "1. Randomized array with your input\n" +
				  "2. Using an array from a FILE\n" +
				  "3. Exit Program\n" +
				  "Enter your menu choice (1-3): ";
	
	System.out.print(MENU);
	int menuChoice = in.nextInt();
	in.nextLine();
	while(menuChoice<1 || menuChoice>3){
		System.out.print(" Error ! Choose numbers 1-3");
		menuChoice = in.nextInt();
	}
	return menuChoice;
	
	}
	
	public static int menuTwo(){
		Scanner in = new Scanner(System.in);
		final String MENU_TWO = 
				"1.Would you like to type in your file name?\n"+
				"2.Would you like to use file chooser?\n"+
				"Enter your menu choice (1-2): ";
		System.out.print(MENU_TWO);
		int menuChoice = in.nextInt();
		in.nextLine();
		while(menuChoice<1 || menuChoice>2){
			System.out.print(" Error ! Choose numbers 1-2");
			menuChoice = in.nextInt();
		}
		return menuChoice;
		
		}

	
	public static void randTable(int[][] table){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the upper bound of the numbers: ");
		int upper = s.nextInt();
		System.out.println("Enter the lower bound of the numbers: ");
		int lower = s.nextInt();
		
		for(int row =0; row < table.length; row++){
			for(int col = 0; col<table[0].length; col++){
				table[row][col] = (int)(Math.random() *upper) + lower;
			}
		}
	}
	
	
	public static void sumOfTable(int[][] table){
		int total = 0;
		for(int row = 0; row<table.length; row++){
			for(int col =0; col<table[0].length; col++){
				total += table[row][col];
				
			}
		}
		System.out.print("The sum of the whole table is: " + total);
	}
	
	
	public static void sumEachRow(int[][] table){
		for(int row = 0; row<table[0].length; row++){
			int sumOfRow = 0;
			for(int col = 0; col< table.length; col++){
				sumOfRow+=table[row][col];
			}
			System.out.println("The sum of Row " + row + " is "+ sumOfRow);
		}
	}
		
	
	public static void sumEachCol(int[][] table){
		for(int col = 0; col<table[0].length; col++){
			int sumOfCol = 0;
			for(int row = 0; row< table.length; row++){
				sumOfCol+=table[row][col];
			}
			System.out.println("The sum of col " + col + " is "+ sumOfCol);
		}
	}
	
	public static void averageOfTable(int [][] table){
		double total = 0;
		double average=0.0;
		int counter=0;
		for(int row = 0; row<table.length; row++){
			for(int col =0; col<table[0].length; col++){
				counter++;
				total += table[row][col];
			}
			average = total/counter;
			
		}
		System.out.println();
		System.out.println("The Average is : "+ average);
	}
	
	public static void avgEachRow(int[][] table){
		for(int row = 0; row<table[0].length; row++){
			double sumOfRow = 0;
			double totalAvg = 0;
			for(int col = 0; col< table.length; col++){
				sumOfRow+=table[row][col];
				totalAvg= sumOfRow/table[row].length;
				
			}
			System.out.println("The Average of Row " + row + " is "+ totalAvg);
		}
	}
	
	public static void avgEachCol(int[][] table){
		for(int col = 0; col<table[0].length; col++){
			double sumOfCol = 0;
			double totalAvg = 0;
			for(int row = 0; row< table.length; row++){
				sumOfCol+=table[row][col];
				totalAvg= sumOfCol/table[col].length;
				
			}
			System.out.println("The Average of Col " + col + " is "+ totalAvg);
		}
	}
	public static void largestAvgC(int[][] table){
		double maxAvg=0;
		int indexOfMaxCol=0;
		double sum=0;
		double avg=0;
		for(int row =0; row<table.length;row++){
				sum+= table[row][0];
				maxAvg=sum/table.length;
				
		}
		
		for(int col =1; col<table[0].length;col++){
			int sumOfThisCol=0;
			for(int row=0; row<table.length; row++){
				
				sumOfThisCol+=table[row][col];
				avg= sumOfThisCol/table.length;
				
				if(avg>maxAvg){
					maxAvg=avg;
					indexOfMaxCol=col;
				}
			}
		}
		System.out.println("Col "+ indexOfMaxCol +" Has the maximum avg of " + maxAvg);	
	}	
	public static void largestAvg(int[][] table){
		double maxAvg=0;
		int indexOfMaxRow=0;
		double sum=0;
		double avg=0;
		for(int col =0; col<table[0].length;col++){
				sum+= table[0][col];
				maxAvg=sum/table.length;
				
		}
		for(int row =1; row<table.length;row++){
			int sumOfThisRow=0;
			for(int col=0; col<table[row].length; col++){
				
				sumOfThisRow+=table[row][col];
				avg= sumOfThisRow/table.length;
				
				if(avg>maxAvg){
					maxAvg=avg;
					indexOfMaxRow=row;
				}
			}
		}
		System.out.println("Row "+ indexOfMaxRow +" Has the maximum avg of " + maxAvg);	
	}		
	
	public static void majorDiagnal(int[][] table){
		int sumOfMajorDiagnal=0;
		for(int row = 0; row<table.length;row++){
			for(int col = 0; col<table[0].length;col++){
					if(row==col){
					sumOfMajorDiagnal +=table[row][col];
				}
			}
		}
		System.out.println("The Major Diagnal Sum is: " + sumOfMajorDiagnal);
	}
	public static void majorDiagnalAvg(int[][] table){
		int sumOfMajorDiagnal=0;
		double avg=0;
		
		for(int row = 0; row<table.length;row++){
			for(int col = 0; col<table[0].length;col++){
					if(row==col){
					sumOfMajorDiagnal +=table[row][col];
				}
			}
			avg = sumOfMajorDiagnal/table[row].length;
		}
		
		System.out.println("The Major Diagnal avg is: " + avg);
	}
	
	public static void minorDiagnal(int[][] table){
		int sumOfMinorDiagnal=0;
		int row = 0;
		int col=table.length-1;
		while(row<table.length && col >=0){
			sumOfMinorDiagnal+= table[row][col];
			row++;
			col--;
		}
		System.out.println("The Minor Diagnal Sum is: " + sumOfMinorDiagnal);
	}
	public static void minorDiagnalAvg(int[][] table){
		int sumOfMinorDiagnal=0;
		int row = 0;
		int col=table.length-1;
		double counter=0;
		double avg=0;
		while(row<table.length && col >=0){
			sumOfMinorDiagnal+= table[row][col];
			row++;
			col--;
			counter++;
		}
		avg=sumOfMinorDiagnal/counter;
		
		System.out.println("The Minor Diagnal avg is: " + avg);
	}
	
	public static void lowestAvgR(int[][] table){
		double minAvg=0;
		int indexOfMinRow=0;
		double sum=0;
		double avg=0;
		for(int col =0; col<table[0].length;col++){
			sum+= table[0][col];
			minAvg=sum/table.length;
			
	}
	for(int row =1; row<table.length;row++){
		int sumOfThisRow=0;
		for(int col=0; col<table[row].length; col++){
			
			sumOfThisRow+=table[row][col];
			avg= sumOfThisRow/table.length;
			
			if(avg<minAvg){
				avg=minAvg;
				indexOfMinRow=row;
			}
		}
	}
	System.out.println("Row "+ indexOfMinRow +" Has the min avg of " + minAvg);	
}
	public static void minAvgC(int[][] table){
		double minAvg=0;
		int indexOfMinCol=0;
		double sum=0;
		double avg=0;
		for(int row =0; row<table.length;row++){
				sum+= table[row][0];
				minAvg=sum/table.length;
				
		}
		
		for(int col =1; col<table[0].length;col++){
			int sumOfThisCol=0;
			for(int row=0; row<table.length; row++){
				
				sumOfThisCol+=table[row][col];
				avg= sumOfThisCol/table.length;
				
				if(avg>minAvg){
					avg=minAvg;
					indexOfMinCol=col;
				}
			}
		}
		System.out.println("Col "+ indexOfMinCol +" Has the min avg of " + minAvg);	
	}
	
	public static int[][] findDataInFile(File chosenFile){
		Scanner in = null;
		try {
			in = new Scanner(chosenFile);
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found! Program will now exit!");
			System.exit(1);
		} 
		
		int i = in.nextInt();
		int f = in.nextInt();
		int[][] data = new int[i][f];
		
		 while (in.hasNext()) {
             for (int row = 0; row < data.length; row++) {
                 for (int column = 0; column < data[row].length; column++) {
                     data[row][column] = in.nextInt();
                 }
             }
		 }
		return data;
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