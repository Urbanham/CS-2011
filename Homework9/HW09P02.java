/*
 * Abraham Estrada
 * This program will make a matrix with it going the number input by the number input. so 5x5 9x9 and so on.it will make the numbers random 0's and 1's
 */
import java.util.Scanner;

public class HW09P02 {
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
				
		System.out.print("Enter your n: ");
		int lines = s.nextInt();
		printMatrix(lines);
		
	}
	//This will actually print the matrix out in the main method.
	public static void printMatrix(int n){
		for(int i =0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(rand());
			}
			System.out.println();
		}
	}
	// this is the random numbers from 0 and 1 will be printed using rand().
	public static int rand(){
		return (int) (Math.random()*2);
	}
}
