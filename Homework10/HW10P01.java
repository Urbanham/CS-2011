/*
 * Abraham Estrada 
 * This program will randomly generate an array and give you the array, even and odd indexes,
 * the reverse . and the first middle and last numbers of the array.
 */
import java.util.Random;
import java.util.Scanner;

public class HW10P01 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		
		int size = s.nextInt();
		
		int[] array = initRandomArray(size);
		
		System.out.println("");
		
		System.out.print("Array: \t\t\t");
		
		printArr(array);
		
		System.out.println();
		
		System.out.print("Even Indexes: \t\t");
		evenArr(array);
		
		System.out.println("");
		
		System.out.print("Odd Indexes: \t\t");
		oddArr(array);
		
		System.out.println("");
		
		System.out.print("Reverse: \t\t");
		reverse(array);
		System.out.println("");
		System.out.print("First, Middle, Last:\t");
		firstArr(array);
		midArr(array);
		lastArr(array);
		
		
	}

	
	public static int[] initRandomArray(int size){
		Random r = new Random();
		int [] result = new int[size];
		for (int i = 0; i < result.length; i ++){
			result[i] = r.nextInt(21);
		}
		return result;
	}
	
	public static void reverse(int [] arr){
		for (int i = arr.length-1; i >=0; i--){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void evenArr(int [] arr){
		for (int i = 0; i< arr.length; i+=2){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void oddArr(int [] arr){
		for (int i = 1; i< arr.length; i+=2){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void firstArr(int[] arr){
		for (int i = 0 ; i ==0 ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void lastArr(int[] arr){
		int i =arr.length-1;
		while(i==arr.length -1) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}
	
	public static void midArr(int[] arr){
		if(arr.length %2 ==1){
			System.out.print(arr[arr.length/2] + " ");
		}
		else{
			System.out.print(arr[(arr.length/2) -1] + " ");
			 System.out.print(arr[arr.length/2] + " ");
		}
			
		
		
		
	}
}

