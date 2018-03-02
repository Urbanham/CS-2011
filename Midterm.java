/*
 Abraham Estrada
 */
import java.util.Scanner;

public class Midterm {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//user inputs their number
		
		
		System.out.print("Enter a student id number: ");
		String studId = s.nextLine();
		
		
		
		// uses the index of the dashes and slash to get the numbers in between.
		
		int dashOne= studId.indexOf("-");
		int dashTwo= studId.lastIndexOf("-");
		
		int slash = studId.indexOf("/");
		//Order of how the numbers are pulled out of the big string,
		
		String num1 = studId.substring(0,dashOne);
		String num2= studId.substring(dashOne+1,dashTwo);
		String num3 = studId.substring(dashTwo+1,slash );  
		String num4 = studId.substring(slash+1);
		
		
		
		int first = Integer.parseInt(num1);
		int second = Integer.parseInt(num2);
		int third = Integer.parseInt(num3);
		int fourth = Integer.parseInt(num4);

		int addedNums = first+third;
		int remainder = first / third;
		
//		if(studId.contains("-")){
//			if(studId.contains("-")){
//				if(studId.contains("/")) {
//					
//				}
//			}
//		}
//		else{
//			System.out.print("The Id is not valid.");
//			System.exit(0);
//		}
//		
		
		if(second == addedNums){
			System.out.print("The Id is Valid.");
			System.exit(0);
		}
		else{
			System.out.print("The Id is not valid.");
			System.exit(0);
		}
		if (fourth == remainder){
			System.out.print("The Id is Valid.");
			System.exit(0);
		}
		else{
			System.out.print("The Id is not valid.");
			System.exit(0);
		}
		
		
		
		
	}

}