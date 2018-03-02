/*
 * Abraham Estrada 
 * This will print out a matrix of x's and o's and tell you what col row or major minor diag is 
 * an entire x or o.
 */
import java.util.Scanner;
public class HW11P03 {
	public static void main(String args[]){
	       Scanner s = new Scanner(System.in);
	       
	       System.out.print("Enter matrix size: ");
	       int mat= s.nextInt();
	      
	       String[][] matrixOfXsAndOs = new String[mat][mat];
	       makeMat(matrixOfXsAndOs, mat);
	       printArr(matrixOfXsAndOs, mat);
	      
	       //This is the meathod that will find if there is x's and o's in each row and cols .
	       searchRow(matrixOfXsAndOs, mat, "x");
	       searchRow(matrixOfXsAndOs, mat, "o");
	       searchCol(matrixOfXsAndOs, mat, "x");
	       searchCol(matrixOfXsAndOs, mat, "o");
	      
	       //will search for x's and o's in major and minor diagonals
	       majorDiag(matrixOfXsAndOs, mat, "x"); 
	       minorDiag(matrixOfXsAndOs, mat, "x");
	       
	       majorDiag(matrixOfXsAndOs, mat, "o");
	       minorDiag(matrixOfXsAndOs, mat, "o");
	       
	       
	   }
	
	
	//will look at the major diagonal for the xs and o's need to insert your ch for what you want
	public static void majorDiag(String[][] xOs, int size, String ch){
		int row = 0; 
		int col = 0;
		int counter = 0;
		// will go through each and make sure it is there. k is what tells you if its all in one line
	    while(row < size){
	    	if(xOs[row][col] == ch){
	    		row++;
	    		col++;
	    		counter++;
	    	}
	    }
	    if(counter == size){
	    	System.out.println("All " + ch + "'s in major diagonal");
	    }
	}
	
	
	//will look at the minor diagonal for the xs and o's need to insert your ch for what you want
	public static void minorDiag(String[][] xOs, int size, String ch){
		int row = 0;
		// col is size - 1 to do minor from the top right to bottom left.
		int col = size-1;
		int counter=0;
		// will go through each and make sure it is there.  again k is what tells you if its all in one line
		while(row < size){
			if(xOs[row][col] == ch){
	           	row++;
	           	col--;
	           	counter++;
			}
		}
		if(counter == size){
	           System.out.println("All " + ch + "'s in opposite diagonal");
	    }
	}
	  
	//Search for continues characters of x or o in a row
	public static void searchRow(String[][] xOs, int size, String ch){
		int counter=0;
		// will go through each and make sure it is there. k is what tells you if its all in one line
		for(int row=0; row < size; row++){
			 
			//Search in each row just like in problem one the way adding eachrow.
			for(int col = 0; col < size; col++){
				if(xOs[row][col] == ch){
					counter++;
				}
			}  
			if(counter == size){
				System.out.println("All " + ch + "'s in row " + row + " ");
			}
		}
	}
	  
	public static void searchCol(String[][] xO, int size, String ch){
		int counter = 0;
	    for(int col = 0 ; col < size; col++){
	    	 
	    	//Search in each column k is if its all in one col 
	    	for(int row = 0;row < size; row++){
	    		if(xO[row][col] == ch){
	    			counter++;
	    		}
	    	}
	    	if(counter == size){
	    		System.out.println("All " + ch + "'s in column " + col + " ");
	    	}
	    }
	}
	
	
	 
		public static void makeMat(String[][] xOs, int size){
			int randomNumbers; 
		    for(int row=0; row<size; row++) {
		    	for(int col = 0; col < size; col++){
		    		//use random number gen 0 and 1 
		    		randomNumbers = (int)(Math.random() * 2) ; // this will be from 0 to 1 due to it not counting 2
		    		//change the number if 1 or 0 to x or o
		            if(randomNumbers == 0){
		            	xOs[row][col] = "o";
		            }
		            else{
		            	xOs[row][col] = "x";
		            }
		    	}
		    }
		}
	
	
		public static void printArr(String[][] xOs, int size){

		    for(int row = 0; row < size; row++){
		    	for(int col = 0; col < size; col++){
		    		System.out.print( xOs[row][col] + " ");
		        }
		    	System.out.println();
		    }
		}
	
	
	
	
	
	
	
	
}