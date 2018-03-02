/*
 Abraham Estrada
 This program converts a ten letter word into a phone number. The word cannot be more or less than 10 letters.
 */
import java.util.Scanner;

public class HW06P04 {
	public static void main(String[] args){
		 Scanner s = new Scanner(System.in);
		
		 
		 //User inputs their 10 character word
		 System.out.print("Enter Input: ");
		 String inputOfTen = s.nextLine();
		 
		 //Gets the length of the input  by converting it to a int.
		 
		 int inputLength = inputOfTen.length();
		 
		 //Validates the input 
		 
		 if (inputLength < 10 || inputLength > 10){
			 System.out.print("The amount of characters is over or less than 10!");
			 System.exit(0);
		 }
		 	char letterOne = inputOfTen.charAt(0);
			char letterTwo = inputOfTen.charAt(1);
			char letterThree = inputOfTen.charAt(2);
			char letterFour = inputOfTen.charAt(3);
			char letterFive = inputOfTen.charAt(4);
			char letterSix = inputOfTen.charAt(5);
			char letterSeven = inputOfTen.charAt(6);
			char letterEight = inputOfTen.charAt(7);
			char letterNine = inputOfTen.charAt(8);
			char letterTen = inputOfTen.charAt(9);
			
			char numOne = '1';
			char numTwo = '2';
			char numThree = '3';
			char numFour = '4';
			char numFive = '5';
			char numSix = '6';
			char numSeven = '7';
			char numEight = '8';
			char numNine= '9';
			
			System.out.print("Phone Number: (");
	//Capitals for Letter One
			
			if (letterOne >= 65 && letterOne <= 67){
				System.out.print(numTwo);
			}
			else if(letterOne >= 68 && letterOne <= 70){
				System.out.print(numThree);
			}
			else if(letterOne >= 71 && letterOne<= 73){
				System.out.print(numFour);
			}
			else if(letterOne >= 74 && letterOne <= 76){
				System.out.print(numFive);
			}
			else if(letterOne >= 77 && letterOne <= 79){
				System.out.print(numSix);
			}
			else if(letterOne >= 80 && letterOne <= 83){
				System.out.print(numSeven);
			}
			else if(letterOne >= 84 && letterOne <= 86){
				System.out.print(numEight);
			}
			else if(letterOne >= 87 && letterOne <= 90){
				System.out.print(numNine);
			}
	//Lower case for Letter one
			if(letterOne >= 97 && letterOne <= 99){
				System.out.print(numTwo);
			}
			else if(letterOne>= 100 && letterOne <= 102){
				System.out.print(numThree);
			}
			else if(letterOne >= 103 && letterOne <= 105){
				System.out.print(numFour);
			}
			else if(letterOne>= 106 && letterOne <= 108){
				System.out.print(numFive);
			}
			else if(letterOne >= 109 && letterOne <= 111){
				System.out.print(numSix);
			}
			else if(letterOne >= 112 && letterOne <= 115){
				System.out.print(numSeven);
			}
			else if(letterOne >= 116 && letterOne <= 118){
				System.out.print(numEight);
			}
			else if(letterOne >= 119 && letterOne <= 122){
				System.out.print(numNine);
			}
//Cannot end with else needs else if. Ending with else causes it to not give right letter
			//Capitals for Letter Two
			
			if (letterTwo >= 65 && letterTwo <= 67){
				System.out.print(numTwo);
			}
			else if(letterTwo >= 68 && letterTwo <= 70){
				System.out.print(numThree);
			}
			else if(letterTwo >= 71 && letterTwo<= 73){
				System.out.print(numFour);
			}
			else if(letterTwo >= 74 && letterTwo <= 76){
				System.out.print(numFive);
			}
			else if(letterTwo >= 77 && letterTwo <= 79){
				System.out.print(numSix);
			}
			else if(letterTwo >= 80 && letterTwo <= 83){
				System.out.print(numSeven);
			}
			else if(letterTwo >= 84 && letterTwo <= 86){
				System.out.print(numEight);
			}
			else if(letterTwo >= 87 && letterTwo <= 90){
				System.out.print(numNine);
			}
			
		//Lower case for Letter Two
			if(letterTwo >= 97 && letterTwo <= 99){
				System.out.print(numTwo);
			}
			else if(letterTwo>= 100 && letterTwo <= 102){
				System.out.print(numThree);
			}
			else if(letterTwo >= 103 && letterTwo <= 105){
				System.out.print(numFour);
			}
			else if(letterTwo>= 106 && letterTwo <= 108){
				System.out.print(numFive);
			}
			else if(letterTwo >= 109 && letterTwo <= 111){
				System.out.print(numSix);
			}
			else if(letterTwo >= 112 && letterTwo <= 115){
				System.out.print(numSeven);
			}
			else if(letterTwo >= 116 && letterTwo <= 118){
				System.out.print(numEight);
			}
			else if(letterTwo >= 119 && letterTwo <= 122){
				System.out.print(numNine);
			}
			
//Capitals for Letter Three
			
			if (letterThree >= 65 && letterThree  <= 67){
				System.out.print(numTwo);
			}
			else if(letterThree  >= 68 && letterThree  <= 70){
				System.out.print(numThree);
			}
			else if(letterThree  >= 71 && letterThree<= 73){
				System.out.print(numFour);
			}
			else if(letterThree >= 74 && letterThree <= 76){
				System.out.print(numFive);
			}
			else if(letterThree >= 77 && letterThree <= 79){
				System.out.print(numSix);
			}
			else if(letterThree >= 80 && letterThree <= 83){
				System.out.print(numSeven);
			}
			else if(letterThree >= 84 && letterThree <= 86){
				System.out.print(numEight);
			}
			else if(letterThree >= 87 && letterThree <= 90){
				System.out.print(numNine);
			}
	//Lower case for Letter Three
			if(letterThree >= 97 && letterThree <= 99){
				System.out.print(numTwo);
			}
			else if(letterThree>= 100 && letterThree <= 102){
				System.out.print(numThree);
			}
			else if(letterThree >= 103 && letterThree <= 105){
				System.out.print(numFour);
			}
			else if(letterThree>= 106 && letterThree <= 108){
				System.out.print(numFive);
			}
			else if(letterThree >= 109 && letterThree <= 111){
				System.out.print(numSix);
			}
			else if(letterThree >= 112 && letterThree <= 115){
				System.out.print(numSeven);
			}
			else if(letterThree >= 116 && letterThree <= 118){
				System.out.print(numEight);
			}
			else if(letterThree >= 119 && letterThree <= 122){
				System.out.print(numNine);
			}
			
			//Closing parenthesis for the number
			
			System.out.print(")");
			
	//Capitals for Letter Four
			
			if (letterFour >= 65 && letterFour  <= 67){
				System.out.print(numTwo);
			}
			else if(letterFour >= 68 && letterFour <= 70){
				System.out.print(numThree);
			}
			else if(letterFour >= 71 && letterFour<= 73){
				System.out.print(numFour);
			}
			else if(letterFour >= 74 && letterFour <= 76){
				System.out.print(numFive);
			}
			else if(letterFour >= 77 && letterFour <= 79){
				System.out.print(numSix);
			}
			else if(letterFour >= 80 && letterFour <= 83){
				System.out.print(numSeven);
			}
			else if(letterFour >= 84 && letterFour <= 86){
				System.out.print(numEight);
			}
			else if(letterFour >= 87 && letterFour <= 90){
				System.out.print(numNine);
			}
			
	//Lower case for Letter Four
			if(letterFour >= 97 && letterFour <= 99){
				System.out.print(numTwo);
			}
			else if(letterFour>= 100 && letterFour <= 102){
				System.out.print(numThree);
			}
			else if(letterFour >= 103 && letterFour <= 105){
				System.out.print(numFour);
			}
			else if(letterFour>= 106 && letterFour <= 108){
				System.out.print(numFive);
			}
			else if(letterFour >= 109 && letterFour <= 111){
				System.out.print(numSix);
			}
			else if(letterFour >= 112 && letterFour <= 115){
				System.out.print(numSeven);
			}
			else if(letterFour >= 116 && letterFour <= 118){
				System.out.print(numEight);
			}
			else if(letterFour >= 119 && letterFour <= 122){
				System.out.print(numNine);
			}

			
//Capitals for Letter Five
			
			if (letterFive >= 65 && letterFive  <= 67){
				System.out.print(numTwo);
			}
			else if(letterFive  >= 68 && letterFive  <= 70){
				System.out.print(numThree);
			}
			else if(letterFive  >= 71 && letterFive<= 73){
				System.out.print(numFour);
			}
			else if(letterFive >= 74 && letterFive <= 76){
				System.out.print(numFive);
			}
			else if(letterFive >= 77 && letterFive <= 79){
				System.out.print(numSix);
			}
			else if(letterFive >= 80 && letterFive <= 83){
				System.out.print(numSeven);
			}
			else if(letterFive >= 84 && letterFive <= 86){
				System.out.print(numEight);
			}
			else if(letterFive >= 87 && letterFive <= 90){
				System.out.print(numNine);
			}
	//Lower case for Letter Five
			if(letterFive >= 97 && letterFive <= 99){
				System.out.print(numTwo);
			}
			else if(letterFive>= 100 && letterFive <= 102){
				System.out.print(numThree);
			}
			else if(letterFive >= 103 && letterFive <= 105){
				System.out.print(numFour);
			}
			else if(letterFive>= 106 && letterFive <= 108){
				System.out.print(numFive);
			}
			else if(letterFive >= 109 && letterFive <= 111){
				System.out.print(numSix);
			}
			else if(letterFive >= 112 && letterFive <= 115){
				System.out.print(numSeven);
			}
			else if(letterFive >= 116 && letterFive <= 118){
				System.out.print(numEight);
			}
			else if(letterFive >= 119 && letterFive <= 122){
				System.out.print(numNine);
			}
//Capitals for Letter Six
			
			if (letterSix >= 65 && letterSix  <= 67){
				System.out.print(numTwo);
			}
			else if(letterSix >= 68 && letterSix <= 70){
				System.out.print(numThree);
			}
			else if(letterSix >= 71 && letterSix<= 73){
				System.out.print(numFour);
			}
			else if(letterSix >= 74 && letterSix <= 76){
				System.out.print(numFive);
			}
			else if(letterSix >= 77 && letterSix <= 79){
				System.out.print(numSix);
			}
			else if(letterSix >= 80 && letterSix <= 83){
				System.out.print(numSeven);
			}
			else if(letterSix >= 84 && letterSix <= 86){
				System.out.print(numEight);
			}
			else if(letterSix >= 87 && letterSix <= 90){
				System.out.print(numNine);
			}
			
		//Lower case for Letter Six
			if(letterSix >= 97 && letterSix <= 99){
				System.out.print(numTwo);
			}
			else if(letterSix>= 100 && letterSix <= 102){
				System.out.print(numThree);
			}
			else if(letterSix >= 103 && letterSix <= 105){
				System.out.print(numFour);
			}
			else if(letterSix>= 106 && letterSix <= 108){
				System.out.print(numFive);
			}
			else if(letterSix >= 109 && letterSix <= 111){
				System.out.print(numSix);
			}
			else if(letterSix >= 112 && letterSix <= 115){
				System.out.print(numSeven);
			}
			else if(letterSix >= 116 && letterSix <= 118){
				System.out.print(numEight);
			}
			else if(letterSix >= 119 && letterSix <= 122){
				System.out.print(numNine);
			}
//Capitals for Letter Seven
			System.out.print("-");
			if (letterSeven >= 65 && letterSeven  <= 67){
				System.out.print(numTwo);
			}
			else if(letterSeven  >= 68 && letterSeven  <= 70){
				System.out.print(numThree);
			}
			else if(letterSeven  >= 71 && letterSeven<= 73){
				System.out.print(numFour);
			}
			else if(letterSeven >= 74 && letterSeven <= 76){
				System.out.print(numFive);
			}
			else if(letterSeven >= 77 && letterSeven <= 79){
				System.out.print(numSix);
			}
			else if(letterSeven >= 80 && letterSeven <= 83){
				System.out.print(numSeven);
			}
			else if(letterSeven >= 84 && letterSeven <= 86){
				System.out.print(numEight);
			}
			else if(letterSeven >= 87 && letterSeven <= 90){
				System.out.print(numNine);
			}
	//Lower case for Letter Seven
			if(letterSeven >= 97 && letterSeven <= 99){
				System.out.print(numTwo);
			}
			else if(letterSeven>= 100 && letterSeven <= 102){
				System.out.print(numThree);
			}
			else if(letterSeven >= 103 && letterSeven <= 105){
				System.out.print(numFour);
			}
			else if(letterSeven>= 106 && letterSeven <= 108){
				System.out.print(numFive);
			}
			else if(letterSeven >= 109 && letterSeven <= 111){
				System.out.print(numSix);
			}
			else if(letterSeven >= 112 && letterSeven <= 115){
				System.out.print(numSeven);
			}
			else if(letterSeven >= 116 && letterSeven <= 118){
				System.out.print(numEight);
			}
			else if(letterSeven >= 119 && letterSeven <= 122){
				System.out.print(numNine);
			}
//Capitals for Letter Eight
			
			if (letterEight >= 65 && letterEight  <= 67){
				System.out.print(numTwo);
			}
			else if(letterEight >= 68 && letterEight <= 70){
				System.out.print(numThree);
			}
			else if(letterEight >= 71 && letterEight<= 73){
				System.out.print(numFour);
			}
			else if(letterEight >= 74 && letterEight <= 76){
				System.out.print(numFive);
			}
			else if(letterEight >= 77 && letterEight <= 79){
				System.out.print(numSix);
			}
			else if(letterEight >= 80 && letterEight <= 83){
				System.out.print(numSeven);
			}
			else if(letterEight >= 84 && letterEight <= 86){
				System.out.print(numEight);
			}
			else if(letterEight >= 87 && letterEight <= 90){
				System.out.print(numNine);
			}
			
	//Lower case for Letter Eight
			if(letterEight >= 97 && letterEight <= 99){
				System.out.print(numTwo);
			}
			else if(letterEight>= 100 && letterEight <= 102){
				System.out.print(numThree);
			}
			else if(letterEight >= 103 && letterEight <= 105){
				System.out.print(numFour);
			}
			else if(letterEight>= 106 && letterEight <= 108){
				System.out.print(numFive);
			}
			else if(letterEight >= 109 && letterEight <= 111){
				System.out.print(numSix);
			}
			else if(letterEight >= 112 && letterEight <= 115){
				System.out.print(numSeven);
			}
			else if(letterEight >= 116 && letterEight <= 118){
				System.out.print(numEight);
			}
			else if(letterEight >= 119 && letterEight <= 122){
				System.out.print(numNine);
			}
//Capitals for Letter Nine
			
			if (letterNine >= 65 && letterNine  <= 67){
				System.out.print(numTwo);
			}
			else if(letterNine  >= 68 && letterNine  <= 70){
				System.out.print(numThree);
			}
			else if(letterNine  >= 71 && letterNine<= 73){
				System.out.print(numFour);
			}
			else if(letterNine >= 74 && letterNine <= 76){
				System.out.print(numFive);
			}
			else if(letterNine >= 77 && letterNine <= 79){
				System.out.print(numSix);
			}
			else if(letterNine >= 80 && letterNine <= 83){
				System.out.print(numSeven);
			}
			else if(letterNine >= 84 && letterNine <= 86){
				System.out.print(numEight);
			}
			else if(letterNine >= 87 && letterNine <= 90){
				System.out.print(numNine);
			}
	//Lower case for Letter Nine
			if(letterNine >= 97 && letterNine <= 99){
				System.out.print(numTwo);
			}
			else if(letterNine>= 100 && letterNine <= 102){
				System.out.print(numThree);
			}
			else if(letterNine >= 103 && letterNine <= 105){
				System.out.print(numFour);
			}
			else if(letterNine>= 106 && letterNine <= 108){
				System.out.print(numFive);
			}
			else if(letterNine >= 109 && letterNine <= 111){
				System.out.print(numSix);
			}
			else if(letterNine >= 112 && letterNine <= 115){
				System.out.print(numSeven);
			}
			else if(letterNine >= 116 && letterNine <= 118){
				System.out.print(numEight);
			}
			else if(letterNine >= 119 && letterNine <= 122){
				System.out.print(numNine);
			}
	//Capitals for Letter ten
			
			if (letterTen >= 65 && letterTen  <= 67){
				System.out.print(numTwo);
			}
			else if(letterTen  >= 68 && letterTen  <= 70){
				System.out.print(numThree);
			}
			else if(letterTen  >= 71 && letterTen<= 73){
				System.out.print(numFour);
			}
			else if(letterTen >= 74 && letterTen <= 76){
				System.out.print(numFive);
			}
			else if(letterTen >= 77 && letterTen <= 79){
				System.out.print(numSix);
			}
			else if(letterTen >= 80 && letterTen <= 83){
				System.out.print(numSeven);
			}
			else if(letterTen >= 84 && letterTen <= 86){
				System.out.print(numEight);
			}
			else if(letterTen >= 87 && letterTen <= 90){
				System.out.print(numNine);
			}
	//Lower case for Letter ten
			if(letterTen >= 97 && letterTen <= 99){
				System.out.print(numTwo);
			}
			else if(letterTen>= 100 && letterTen <= 102){
				System.out.print(numThree);
			}
			else if(letterTen >= 103 && letterTen <= 105){
				System.out.print(numFour);
			}
			else if(letterTen>= 106 && letterTen <= 108){
				System.out.print(numFive);
			}
			else if(letterTen >= 109 && letterTen <= 111){
				System.out.print(numSix);
			}
			else if(letterTen >= 112 && letterTen <= 115){
				System.out.print(numSeven);
			}
			else if(letterTen >= 116 && letterTen <= 118){
				System.out.print(numEight);
			}
			else if(letterTen >= 119 && letterTen <= 122){
				System.out.print(numNine);
			}
	}
}
