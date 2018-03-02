/*
 Abraham Estrada 
 This program will print out an ascii table that shows from ! to ~
 */
public class HW08P01 {
	public static void main(String[] args){
		char asc;
		
		int count=1;
		
		final int NUMBER_OF_ASC_PER_LINE = 10; // Display 10 per line
		
			for(asc = 33; asc < 127 ; asc++){
				
				if(count % NUMBER_OF_ASC_PER_LINE == 0){
					System.out.println(asc);
					
				}
				else{
					System.out.print(asc);
					
				}
				count++;
			}
	}
}