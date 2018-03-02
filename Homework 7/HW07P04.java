/*
 Abraham Estrada 
 This program will approximate Pi using the formula.
 */
public class HW07P04 {
 public static void main (String[] args){
	 int i = 1;
	 double sumOfPie = 0.0;
	 double answer; 
	 double formula = 0.0;
	 
	 while(i <= 100000){
		formula = Math.pow(-1.0, i + 1.0) / ((2.0 * i) - 1.0);
		sumOfPie+=formula;
		answer = 4*sumOfPie; 		 
		 
		if (i%10000 == 0.0){
			System.out.println("When i == "+ i + ", PI == " + answer);
		 }
		
		 i++;
	 }
 }
}
