/*
 * Abraham Estrada 
 * This problem will print a boolean binary matrix that is three by three and takes the users input to make the matrix.
 */
import java.util.Scanner;
public class HW11P02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number between 0-511: ");
		int num = s.nextInt();
		int[][] arr= new int[3][3];
		printArr(arr);
//		numBin(arr,num);
		
	}
	//would be converting the number to binary or somewhat was not able to get it to work.
//	public static int numBin(int[][] arr,int num){
//		int colRow = 3;
//		while(num>0){
//			arr[colRow][colRow]= num%2;
//			num=num/2;
//			iters--;
//		}
//		return num;
//	}
	
	public static void printArr(int [] [] table){
		for(int row = 0; row<table.length;row++){
			for(int col = 0; col<table[0].length;col++){
				System.out.print(table[row][col]+ " ");
				
			}
			System.out.println("");
		}
	}
}
