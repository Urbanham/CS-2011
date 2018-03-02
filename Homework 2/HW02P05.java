import java.util.Scanner; 

public class HW02P05{
	public static void main(String[] args){
		Scanner userInput = new Scanner (System.in);

		double trash;



		System.out.print("Enter a floating-point integer: "); 
		trash = userInput.nextDouble(); 

		//int

		int numz;
		numz = (int) trash; 

		System.out.println("Integer part: " + numz);

		//frac 
		
		System.out.println("Fractional part: " + (trash - 27));




	}
}