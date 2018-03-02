/*
 Abraham Estrada 
 this is the redo of problem four from lab 6 my original amount of lines of code was 572 lines. this was extremely 
 shorter than the original way to do it.
 */
import java.util.Scanner;

public class HW07P02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Input:");
		
		String inputOfTen = s.next();
		
		int inputLength = inputOfTen.length();
		
		while(inputLength != 10){
			System.out.print("The amount of characters is over or less than 10!\nInput must be 10 characters!\n");
			inputLength= s.nextInt();
		}
		
		String empty = "Phone Number:(";
		
		int i = 0;

		while(i < 10 ){
			//Puts in these locations the end parenthasis and the dash. 
			if (i == 3){
				empty = empty + ")"; 
			}
			if (i == 6){
				empty= empty +"-";
			}
			
			char letterOne = inputOfTen.charAt(i);
			
			//Uppercase letters are being used.
			if (letterOne >= 65 && letterOne <= 67){
				empty= empty + 2;
			}
			else if(letterOne >= 68 && letterOne <= 70){
				empty= empty +3;
			}
			else if(letterOne >= 71 && letterOne<= 73){
				empty=empty + 4;
			}
			else if(letterOne >= 74 && letterOne <= 76){
				empty=empty + 5;
			}
			else if(letterOne >= 77 && letterOne <= 79){
				empty=empty + 6;
			}
			else if(letterOne >= 80 && letterOne <= 83){
				empty=empty + 7;
			}
			else if(letterOne >= 84 && letterOne <= 86){
				empty=empty + 8;
			}
			else if(letterOne >= 87 && letterOne <= 90){
				empty=empty + 9;
			}
			
			//Lowercase letters are being used
			
			if(letterOne >= 97 && letterOne <= 99){
				empty=empty + 2;
				}
			else if(letterOne>= 100 && letterOne <= 102){
					empty=empty + 3;
				}
			else if(letterOne >= 103 && letterOne <= 105){
				empty=empty + 4;
				}
			else if(letterOne>= 106 && letterOne <= 108){
				empty=empty + 5;
				}
			else if(letterOne >= 109 && letterOne <= 111){
				empty=empty + 6;
				}
			else if(letterOne >= 112 && letterOne <= 115){
				empty=empty + 7;
				}
			else if(letterOne >= 116 && letterOne <= 118){
				empty=empty + 8;
				}
			else if(letterOne >= 119 && letterOne <= 122){
					empty=empty + 9;
			}
			
			i++;		
			
		}
		//This is the answer.
		System.out.print( empty);
		
	}
}
