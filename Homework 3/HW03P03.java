/*
Abraham Estrada	
This program will randomly generate a number from 1-12 then give the corresponding month for that number.
*/


public class HW03P03{
	public static void main(String[] args) {
		// min + (int)(Math.random() * ((max - min) + 1));

		//Generate a random number between 2 and 10 including the 10;
		int randomInt = 1 + (int)(Math.random() * ((12 - 1) + 1));
		
		if (randomInt == 1){
			System.out.print("January");
		}
		else if(randomInt == 2){
			System.out.print("February");
		}
		else if(randomInt == 3){
			System.out.print("March");
		}
		else if(randomInt == 4){
			System.out.print("April");
		}
		else if(randomInt == 5){
			System.out.print("May");
		}
		else if(randomInt == 6){
			System.out.print("June");
		}
		else if(randomInt == 7){
			System.out.print("July");
		}
		else if(randomInt == 8){
			System.out.print("August");
		}
		else if(randomInt == 9){
			System.out.print("September");
		}
		else if(randomInt == 10){
			System.out.print("October");
		}
		else if(randomInt == 11){
			System.out.print("November");
		}
		else{
			System.out.print("December");
		}
		
	}
}
