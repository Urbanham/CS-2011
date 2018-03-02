/*
 Abraham Estrada
 This program will allow you to get the area of a hexagon. You will not be able to get the area of negative numbers.
 */
import java.util.Scanner;

public class HW05P01 {
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	
	double side;
	double area;
	double areaRounded;
	
	System.out.print("Enter the sides of your Hexagon: ");
	side = userInput.nextDouble();
	
	area = (6 * Math.pow(side, 2))/(4 * Math.tan(Math.PI / 6));
	areaRounded = Math.round(area *1000)/1000.0;
	if(side < 0){
		System.out.println("Side is negative cannot compute area!");
		System.exit(1);
	}
	
	System.out.print("Area is: "+ areaRounded);
		
	}
}
