/*
 * Abraham Estrada 
 * This program will allow the user to put in their number of seats and see a diagram how each seat will fill up
 * 
 */

import java.util.Scanner;

public class HW10P05 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//formula for mid position is max_start + max_length/2
		//cur_seg_length = 10;
		//cur_seg_start=0;
		//max_seg_length=10;
		//max_seg_start = 0;
		
		
		System.out.print("What are the total number of seats?: ");
		int seats = s.nextInt();
		
		int [] seatArr = new int[seats];
		
		
		
	}
	public static boolean placement(){
		
	}
	
	public static void printArray(int[] arr) {
		/* Using a regular for loop*/
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}




	
	
	


}