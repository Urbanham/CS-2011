import java.util.Scanner;


public class ComputeArea{
		public static void main(String[] args){
			Scanner userInput= new Scanner (System.in);

			double radius;
			double area;
		  
		  
		  //Step 1: Read the radius 
		  	System.out.print("Enter the radius: ");
		  	radius = userInput.nextDouble(); 
		  //Step 2: compute the area
		  	area = radius * radius * Math.PI;
		  // Step 3: display the results. 
		 	System.out.println("The area is: "+ area);
		 
			}
	}
