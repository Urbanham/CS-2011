/*
Abraham Estrada
In this program the user will find out what day of the week a future or past date was exactly. ex Saturday, Sunday and so on.
*/
import java.util.Scanner;

public class HW04P03{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 

		int year;
		int month;
		int day;
		
		//User enters their year month and day of the month.
		System.out.print("Enter year, i.e 2012: ");
		year = userInput.nextInt();

		System.out.print("Enter a month, 1-12: ");
		month = userInput.nextInt();

		System.out.print("Enter the day of the month: ");
		day = userInput.nextInt();
		// If statements to make sure that the days are not negative and the days do not exceed the days in a month.
		if (year < 0 || month < 0 ||day < 0  ){
			System.out.println("Numbers cannot be negative!");
			System.exit(1);
		}
		if(month > 12 || day > 31){
			System.out.println("Numbers exceed months or days in a month!");
		}
		if(month == 1 || month == 2){
			month = month + 12;
			year = year - 1;
		}
		
		//Zeller formula to find the day.
		int k = year % 100;
		int j = year /100;
		int dayOfWeek;

		dayOfWeek = (day + (26 *(month + 1)/10) + k + k/4 +j/4 + 5*j) %7;
		
		switch(dayOfWeek){
			case 0: System.out.println("Saturday");break;
			case 1: System.out.println("Sunday");break;
			case 2: System.out.println("Monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wednesday");break;
			case 5: System.out.println("Thursday");break;
			case 6: System.out.println("Friday");break;
		}


		



	}
}