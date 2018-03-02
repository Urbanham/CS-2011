/*
Abraham Estrada 
This program when it is run will give you a random card out of a deck of 
52 playing cards. 

*/

public class HW04P02{
  public static void main(String[] args) {
    
    int randomInt = 1 +(int)(Math.random()* ((52-1)+1));
    
    //Switch for the random cars that are goint to be result.
    
    switch (randomInt) {
      case 0:
      case 1: System.out.println("You picked the Ace of Clubs");break;
      case 2: System.out.println("You picked the Ace of Diamonds"); break;
      case 3: System.out.println("You picked the Ace of Hearts"); break;
      case 4: System.out.println("You picked the Ace of Spades"); break;
      case 5: System.out.println("You picked the 2 of Clubs"); break;
      case 6: System.out.println("You picked the 2 of Diamonds"); break;
      case 7: System.out.println("You picked the 2 of Hearts"); break;
      case 8: System.out.println("You picked the 2 of Spades"); break;
      case 9: System.out.println("You picked the 3 of Clubs"); break;
      case 10: System.out.println("You picked the 3 of Diamonds"); break;
      case 11: System.out.println("You picked the 3 of Hearts"); break;
      case 12: System.out.println("You picked the 3 of Spades"); break;
      case 13: System.out.println("You picked the 4 of Clubs"); break;
      case 14: System.out.println("You picked the 4 of Diamonds"); break;
      case 15: System.out.println("You picked the 4 of Hearts"); break;
      case 16: System.out.println("You picked the 4 of Spades"); break;
      case 17: System.out.println("You picked the 5 of Clubs"); break;
      case 18: System.out.println("You picked the 5 of Diamonds"); break;
      case 19: System.out.println("You picked the 5 of Hearts"); break;
      case 20: System.out.println("You picked the 5 of Spades"); break;
      case 21: System.out.println("You picked the 6 of Clubs"); break;
      case 22: System.out.println("You picked the 6 of Diamonds"); break;
      case 23: System.out.println("You picked the 6 of Hearts"); break;
      case 24: System.out.println("You picked the 6 of Spades"); break;
      case 25: System.out.println("You picked the 7 of Clubs"); break;
      case 26: System.out.println("You picked the 7 of Diamonds"); break;
      case 27: System.out.println("You picked the 7 of Hearts"); break;
      case 28: System.out.println("You picked the 7 of Spades"); break;
      case 29: System.out.println("You picked the 8 of Clubs"); break;
      case 30: System.out.println("You picked the 8 of Diamonds"); break;
      case 31: System.out.println("You picked the 8 of Hearts"); break;
      case 32: System.out.println("You picked the 8 of Spades"); break;
      case 33: System.out.println("You picked the 9 of Clubs"); break;
      case 34: System.out.println("You picked the 9 of Diamonds"); break;
      case 35: System.out.println("You picked the 9 of Hearts"); break;
      case 36: System.out.println("You picked the 9 of Spades"); break;
      case 37: System.out.println("You picked the 10 of Clubs"); break;
      case 38: System.out.println("You picked the 10 of Diamonds"); break;
      case 39: System.out.println("You picked the 10 of Hearts"); break;
      case 40: System.out.println("You picked the 10 of Spades"); break;
      case 41: System.out.println("You picked the Jack of Clubs"); break;
      case 42: System.out.println("You picked the Jack of Diamonds"); break;
      case 43: System.out.println("You picked the Jack of Hearts"); break;
      case 44: System.out.println("You picked the Jack of Spades"); break;
      case 45: System.out.println("You picked the Queen of Clubs"); break;
      case 46: System.out.println("You picked the Queen of Diamonds"); break;
      case 47: System.out.println("You picked the Queen of Hearts"); break;
      case 48: System.out.println("You picked the Queen of Spades"); break;
      case 49: System.out.println("You picked the King of Clubs"); break;
      case 50: System.out.println("You picked the King of Diamonds"); break;
      case 51: System.out.println("You picked the King of Hearts"); break;
      case 52: System.out.println("You picked the King of Spades"); break;
    }
  }
}