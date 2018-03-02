import java.util.Scanner;

public class New {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("How many stores are there?: ");
		int storeAmounts=s.nextInt();
		
		for(int stores = 1; stores < storeAmounts; stores++)
		{
			System.out.printf("Enter today\'s sales for store %d: ", stores + 1);
			String storeEarnings = s.next();
		}
		
		System.out.println("\nSALES BAR CHART\n(Each * = $100)");
		
		for(int stores = 1; stores < storeAmounts; stores++)
		{
			System.out.printf("Store %d: ", stores);
			
			for(int asterisk = 0; asterisk < storeEarnings/100; asterisk++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}
}
