import java.util.Scanner;

public class H7P5Method {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
	while(true){
		switch(menu()){
		case 1:
			System.out.print("Enter the binary string: ");
			String binary = in.nextLine();
			long decimal - binaryToDecimal(binary);
			System.out.println("\n" + binary + " in deciaml is" + decimal);
			break;
			
		case 2:
			System.out.print("Enter the decimal number: ");
			decimal= in.nextLong();
			binary = decimalToBinary(decimal);
			System.out.println("\n" + decimal + "in binary is" + binary);
			
			
			
		}
		
	}
	
		
		
		
	}
	/**
	 *Presents a user menu and returns the user's choice. 
	 * @return An integer representing the user's menu choice.
	 *
	 */
	public static int menu(){
	final String MENU = 
					  "1. Convert Binary to Decimal\n" +
					  "2. Print Convert Decimal to Binary\n" +
					  "3. Exit Program\n" +
					  "Enter your menu choice (1-3): ";
		//fill in code laterD
		System.out.print(MENU);
		int menu_choice = in.nextInt();
		in.nextLine();
		return menu_choice;
	}
	
	public static int binaryToDecimal(String binary){
		long decimal = 0; 
		int i = binary.length() - 1;
		int power =0;
		
		while(i>=0){
			
			if(binary.charAt(i) =='1'){
				decimal += Math.pow(2, power);
			}
		}

		
		return decimal ;
		
	}
	
	public static String decimalToBinary(String num){
		long decimal = in.nextLong();
		String binary ="";
		while (decimal>0){
			
		
		long remainder = decimal %2;
		decimal /=2;
		binary = remainder +binary;
		
		}
		
		
		return binary;
	}
	
	
}
