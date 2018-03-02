/*
 * Abraham Estrada 
 * This program is a menu that displays palindromes and mirro palindromes. Chosing your menu choice makes you pick your 
 * desired option. Using up to five methods to get your result
 */
import java.util.Scanner;

public class HW09P04 {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		//menu switch
		while(true)
			switch(menu()){
			case 1:
				System.out.print("How many prime palindromes to display?: ");
				int primePalInp = in.nextInt();
				primePal(primePalInp);
				break;
				
			case 2: //this works perfect with emirp formula
				System.out.print("How many mirrored primes do you want to display?: ");
				int mirroredPrimeInp = in.nextInt();
				noPal(mirroredPrimeInp);
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
				  "1. Display Prime Palindromes\n" +
				  "2. Display Mirrored Primes\n" +
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
	//basic prime formula
	public static boolean primeNum(int x){
		for (int divisor = 2; divisor <= x / 2; divisor++) {
			if (x % divisor == 0){
				return false;
			}
		}
		return true;
	}
	//gets prime pals based off numbers inserted
	public static void primePal(int x){
		final int PRIMES_PER_LINE =10;
		int counter = 0;
		int num = 2;
		
		while (counter < x){
			if(palindroNum(num) && primeNum(num)){
				counter++;
				System.out.print(num+ " ");
				if(counter%PRIMES_PER_LINE ==0){
					System.out.println("");
				}
			}
			num++;
		}
	}
	
	//Gets the palindrome num and is the checker via the boolean method
	public static boolean palindroNum(int x) {
		int palindrome = x;
		int reverse = 0;
		int remainder;
		while (palindrome != 0){
			remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (x == reverse) {
			return true;
		}
		return false;
	}
	//this is the non palindrome for number 2, emirp is a big part of this one
	public static void noPal(int x){
		int counter =0;
		int num = 2;
		final int PER_LINE = 10;
		while(counter< x){
			//if true
			if (mirPal(num) && primeNum(num)){
				counter++;
				System.out.print( num + " ");
			
				if(counter% PER_LINE ==0){
					System.out.println("");
				}
			}
			num++;
		}
	}
	//this is the reversepart of the palins
	public static int reverse(int x){
		if (x < 10){
			return x;
		}
		return rev2(x % 10, x/ 10);
	}
	public static int rev2(int x, int y){
		if(y<1){
			return x;
		}
		return rev2(x*10+ y %10, y/10);
	}
	//mirpall is the mirrors so the exact checker for prime and reverse primes.
	public static boolean mirPal(int x){
		int revOfPrime= reverse(x);
		return x != revOfPrime&& primeNum(x)&&primeNum(reverse(x));
	}
}
