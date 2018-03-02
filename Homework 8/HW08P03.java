/*
 * Abraham Estrada
 * This program allows the user to put their number of stores and their sales. After a bar graph will appear and give the 
 * user the amount using asterisk.
 */
import java.util.Scanner;

public class HW08P03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Initialize variables
		int stores;
		int storeSales;
		
		//User inputs their amount of stores!
		System.out.print("How many stores are there?: ");
		stores=s.nextInt();
		System.out.println("");
		String output = "\nGRAPH OF TOTAL SALES\n(Each * = $100)\n";
		
		//for loop for the sales inputs. this will loop the amount of sales based on the number input
		// the output is going to be the second half which is the graph of total sales 
		for(int storeAmounts = 1; storeAmounts<=stores; storeAmounts++){
			System.out.print("Enter the total sales of Store "+ storeAmounts + ":");
			String earnings = s.next();
			storeSales =Integer.parseInt(earnings);
			output +="Store " + storeAmounts + ": ";
			while(!(storeSales%100 ==0)){
					System.out.println("this amount is not divisible by 100!");
					System.out.print("Enter the total sales of Store "+ storeAmounts + ": ");
					earnings=s.next();
					storeSales =Integer.parseInt(earnings);
					
				}
			for(int asterisk =1; asterisk <= storeSales/100; asterisk++){
				output += "*";
			}
			//this will actually put them on the next line
			output+="\n";
			
		}
		System.out.println(output);
	}
}