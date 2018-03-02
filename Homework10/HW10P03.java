/*
 * Abraham Estrada
 * This will give you the grades out of a file using the file choser.It will then give you the grade they got based on the the highest grade or best as its curve. taking the numbers
 * out and putting them into an array to get the grades.
 */
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW10P03 {
	public static void main(String[] args) {
		// this is the ability to chose the file.
		options();
		
	}	
	//method to chose file
	public static void options(){
		JFileChooser jfc = new JFileChooser(".");
		double jfcUserOption = jfc.showOpenDialog(null);
		
		if (jfcUserOption == JFileChooser.APPROVE_OPTION) {
			File chosenFile = jfc.getSelectedFile();
			System.out.println("The file you chose was: " + chosenFile.getName());
			// read file is what gives you all the information so it is what grabs the numbers
			readFile(chosenFile);
		}
		//option if the user chose the cancel button
		else if(jfcUserOption == JFileChooser.CANCEL_OPTION) {
			System.out.println("You chose cancel");
		}
		//option if there was some kind of error
		else if (jfcUserOption == JFileChooser.ERROR_OPTION) {
			System.out.println("There was some error!");
		}
	}
	public static double[] readFile(File chosenFile){
		Scanner s = null;
		try{
			s = new Scanner(chosenFile);
			}
		catch (FileNotFoundException e){
			System.out.print("File not found");
			System.exit(1);
		}
		// begis to read the data in a file and put it into an array
		int i = s.nextInt();
		double [] dataInFile = new double[i];
		
		int j =0;
		while(s.hasNextDouble()){
			dataInFile[j]=s.nextDouble();
			j++;
		}
		//using the grades method to not take the first int which is just the amount in the file.
		grades(dataInFile);
		return dataInFile;
	}
	// this is the method that converts and shows us what are grade is for the number. Basing it off the number - points wrong
	// arr at i is the number we get the grade from.
	public static void getGrade(double var, double[] arr) {
		
		for(int i = 0 ; i<arr.length; i++){
			
			if (arr[i] >= var - 15) {
				System.out.println("Student " + (i+1)+ " score is "+ arr[i]+ " and grade is A");
			}
			else if (arr[i] >= var - 25) {
				System.out.println("Student " + (i+1)+ " score is "+ arr[i]+ " and grade is B");
			}
			else if (arr[i] >= var- 35) {
				System.out.println("Student " + (i+1)+ " score is "+ arr[i]+ " and grade is C");
			}
			else if (arr[i] >= var - 45) {
				System.out.println("Student " + (i+1)+ " score is "+ arr[i]+ " and grade is D");
			}
			else {
				System.out.println("Student " + (i+1)+ " score is "+ arr[i]+ " and grade is F");
			}
		} 
	}	
	public static void grades(double[] arr){
		double startingNum = arr[0];
		
		for(int i =1; i<arr.length; i++){
			if(arr[i] > startingNum){
				startingNum = arr[i];
			}
		}
		getGrade(startingNum, arr);
	}
		
}

