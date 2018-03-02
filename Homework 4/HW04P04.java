/*
Abraham Estrada 
This program is a menu that allows the user to use it to calculate the surface area nad volume of a sphere 
or a rectangular prism.
*/

import java.util.Scanner;

public class HW04P04{
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);

      //Create the menu choices
      final String USER_MENU = 
         "1. Compute the Surface Area of a Sphere\n" + 
         "2. Compute the volume of a Sphere\n" +
         "3. Compute the surface area of a Rectangular Prism\n" +
         "4. Compute the Volume of a Rectangular prism\n" + 
         "5. Exit Program\n"+
         "Enter (1-5) for choice: ";

      //Define constants for the menu choices
      final int AREA_CHOICE = 1;
      final int VOLUME_CHOICE = 2;
      final int RECTANGLEAREA_CHOICE = 3;
      final int RECTANGLEVOLUME_CHOICE = 4;
      final int EXIT_CHOICE = 5;   

      System.out.print(USER_MENU);
      int choice = userInput.nextInt();
      //Use switches for each choice. REMEMBER TO USE BREAK OR IT WILL GO AND USE ALL CASES AFTER!!
      switch(choice){
         case AREA_CHOICE:
            System.out.print("Enter The radius of a sphere: ");
            double radius = userInput.nextDouble();
            double area = (4 * Math.PI) * radius * radius;

            if (radius < 0 ){
               System.out.println("Radius cannot be negative!");
               System.exit(1);
            }
            
            System.out.println("The surface area of the sphere is: " + area);
            break;

         case VOLUME_CHOICE:
            System.out.print("Enter the radius to find the volume of a sphere: ");
            double radiusTwo = userInput.nextDouble();
            double volume = 4*Math.PI * Math.pow(radiusTwo,3)/3; 
             
            if (radiusTwo < 0){
               System.out.println("Radius cannot be negative!");
               System.exit(1);
            }
            
            System.out.println("The Volume of the sphere is: " + volume);
            break;

         case RECTANGLEAREA_CHOICE:
            System.out.print("Please enter the length width and height of your rectangle: ");
            double length = userInput.nextDouble();
            double width = userInput.nextDouble();
            double height = userInput.nextDouble();

            if (length < 0 || width < 0 || height < 0){
               System.out.println("Length, width and height cannot be negative!");
               System.exit(1);
            }

            double surfaceA = (2 * length * width) + (2 * height * width) + (2 * length * height);

            System.out.print("Your surface area is: " + surfaceA);
            break;

         case RECTANGLEVOLUME_CHOICE:
            System.out.print("Enter your length, width, and height: ");
            double lengthV = userInput.nextDouble();
            double widthV = userInput.nextDouble();
            double heightV= userInput.nextDouble();

            if (lengthV < 0 || widthV < 0 || heightV < 0){
               System.out.println("Length, width and height cannot be negative!");
               System.exit(1);
            }
            double volumeRectangle = lengthV * widthV * heightV;

            System.out.println("Your volume is: " + volumeRectangle);
            break;

         case EXIT_CHOICE:
            System.out.println("The program will now exit!");
            System.exit(0);

         default:
            System.out.println("ERROR! Menu choice is not correct");
            System.out.println("Program will now exit!");
            System.exit(1);
      }  

   }
}