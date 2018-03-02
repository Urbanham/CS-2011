import java.util.Scanner;


public class HW02P02{
		public static void main(String[] args){
			Scanner userInput= new Scanner (System.in);
			
			double length;
			double width;
			double height;
			double area;
			double volume;
			
			//User inputs length width base 

			System.out.print("Enter the length, width, and height of the pyramid: ");
			length = userInput.nextDouble();
			width = userInput.nextDouble();
			height = userInput.nextDouble();
			
			//convert the area 
			
			area = length * width;
			
			//convert the volume 
			
			volume = area * height /3; 

			//Show results 
			System.out.println("The area is " + area);
			System.out.println("The volume is " + volume);

	}

}