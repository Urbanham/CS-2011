/*
 * Abraham Estrada
 * This program finds random numbers from 1-4 and as the user to input them. the number the user puts
 * is the amount that appear on the line.if the numbers happen to be the same in the line then the 
 * number that match will have parenthesis closing them together if they are 2 or more in a row.
 */
import java.util.Scanner;
public class HW10P04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		
	// final constants since they wont change at all.
		
		final int MAX = 4;
		final int MIN =1;
		
		System.out.print("How many random values?: ");
		int values = s.nextInt();
		
		int[] ranArray = new int[values];
		
		// makes sure it does print the amount on the line and its going to be from 1-4
		for (i=0; i<values; i++){
			ranArray[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		
		numbers(ranArray, values);
	}
	 
	
	
	public static void numbers(int[] ranArray, int val){
		
		int i;
		int j;
		for(i=0;i< val;){
		if ((i + 1) < val) {
			//checking if the two numbers are equal
			if (ranArray[i] == ranArray[i + 1]) {
				System.out.print("(");
				System.out.print(ranArray[i] + " ");
				//checks next num after to see if it keeps going or if it stops so it doesn't print
				for (j = i + 1; j < val; j++) {
					if (ranArray[j] != ranArray[i])
						break;
					else {
						System.out.print(ranArray[j] );
					}
				}
				
				System.out.print(")");
				
				i = j;
			} 
			else {
					// Printing number
					System.out.print(" " + ranArray[i]);
					i++;
			}
		} 
		//if not just keeps printing more numbers
		else {
			System.out.print(" " + ranArray[i]);
			i++;
			}
		}
	}
	
}


