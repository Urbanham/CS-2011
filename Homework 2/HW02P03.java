import java.util.Scanner;


public class HW02P03{
		public static void main(String[] args){
			Scanner userInput= new Scanner (System.in);
			
			double x1;
			double x2;
			double y1;
			double y2;
			double distance;
			//User input 

			System.out.print("Enter x1 and y1: ");
			x1 = userInput.nextDouble();
			y1 = userInput.nextDouble();

			System.out.print("Enter x2 and y2: ");
			x2 = userInput.nextDouble();
			y2 = userInput.nextDouble();

			//Distance formula 

			distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

			//result

			System.out.println("The distance is: " + distance);

	}

}