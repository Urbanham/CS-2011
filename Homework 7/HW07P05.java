/*
 Abraham Estrada
 This program is a menu that converts from binary to decimal and decimal to binary and exits.
 However my decimal to binary is in reverse for some reason.
 */
import java.util.Scanner;

public class HW07P05 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String binaryNum = "";
		
		//The menu options.
		String menu = 
				"--------------------------------- \n" +
				"| Binary Number Converter       | \n" +
				"--------------------------------- \n" +
				"| 1. Convert Binary to Decimal  | \n" +
				"| 2. Convert Decimal to Binary  | \n" +
				"| 3. Exit the Program           | \n" +
				"--------------------------------- \n "+
				"Choose Option (1-3): ";

		while(true){
			System.out.print(menu);
			int menuChoice = in.nextInt();
			
			
			while(!(menuChoice==1||menuChoice==2||menuChoice==3)){
				System.out.println("Number must be from 1-3!");
				System.out.println("Enter from 1-3");
				menuChoice = in.nextInt();
			}
			//Switch for the menu choices.
			switch(menuChoice) {
			
			//Is choice one which is binary to a decimal.
			case 1: System.out.println("Enter the binary string: "); 
				String binSt = in.next();
				
				long decimal = 0; 
				int i = binSt.length() - 1;
				int power =0;
				
				while(i>=0){
					
					if(binSt.charAt(i) =='1'){
						decimal += Math.pow(2, power);
					}
					i--;
					power++;
				}

				System.out.println(binSt + " in decimal number is ");
				System.out.println(decimal);
			
			break;
			case 2: System.out.println("Enter the decimal number: ");
				long decimalNumber = in.nextLong(); 
				long decNumDub = decimalNumber;
				
				while(decimalNumber>0){ 
                    binaryNum = (decimalNumber%2) + binaryNum;
                    decimalNumber/=2;
				}
				System.out.println(decNumDub + " in binary number is: ");
				System.out.print(binaryNum);
			break;
			case 3: System.exit(0);
			}
			System.out.println();
		}
		
	}
}
