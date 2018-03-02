/*
 Abraham Estrada
 This will allow you to allow the user to input a string and take out the capital letters replace the vowels with underscores, get the total number of vowels,the total numbers of constants,
 and the position of each vowel.
 */
import java.util.Scanner;

public class HW08P02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
	//The user will input their String.
		System.out.print("Enter a string: ");
		
		String s1 = s.nextLine();
		
		//Declare other string to get your upperChar and the Vowel String with the vowels 
		String upperChar="";
		int vowelCount = 0;
		int constantCount = 0;
		String vowelLocation = "";
		
		// first start with taking out upper case letters into an empty string
		for(int letter = 0; letter < s1.length() ; letter++){
			char upperCase = s1.charAt(letter);
			char vowel = s1.charAt(letter);
			
			if(Character.isUpperCase(upperCase)) {
				upperChar +=  upperCase+ " ";
			}
			//Put capital and lower case vowels together to save space, use substrings to change vowels have one going from the front and back to go through all the vowels. 
			//For vowel location you just get the int of the vowel and add it to the empty vowelLocation string.
			if( vowel == 'A' || vowel == 'E' || vowel == 'I'|| vowel =='O' || vowel=='U'||vowel == 'a' || vowel == 'e' || vowel == 'i'||vowel =='o' || vowel =='u'){
				String front = s1.substring(0, letter);
		        String back = s1.substring(letter + 1);
		        s1 = front + "_" + back;
		        vowelLocation+=letter+ " ";
				vowelCount++;	
			}
			//This is just used for the constant counter.
			else if (!(vowel == 'A' || vowel == 'E' || vowel == 'I'|| vowel =='O' || vowel =='U'|| vowel == 'a' || vowel == 'e' ||vowel == 'i'|| vowel =='o' || vowel =='u'|| vowel ==' ')){
				constantCount++;
			}
			
		} 
		System.out.println();
		System.out.println("Uppercase Letters:\t" +upperChar);
		System.out.println("Vowel Replacement:\t" + s1);
		System.out.println("Number of Vowels:\t"+vowelCount);
		System.out.println("Number of Constants:\t" + constantCount);
		System.out.println("Position of Vowels:\t" + vowelLocation );
	
	}
}
