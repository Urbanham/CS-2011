/*
 * Abraham Estrada 
 * This program will print out a random sentences using nouns verbs adjectives prepositions and articles in arrays.
 * it will only print out 7 as well.
 */
import java.util.Scanner;
import java.util.Random;

public class HW10P02 {
	public static void main(String[] args){
		String[] arr = new String[30];
		seven(arr);
	}
	//noun string array
	public static String noun(){
		Random r = new Random();
		String [] arr = new String[30];
		arr[0]="cat";arr[1]="mouse";arr[2]="John";arr[3]="Matt";arr[4]="Kobe";
		arr[5]="Manny";arr[6]="Danny";arr[7]="Jojo";arr[8]="Anders";arr[9]="Nico";
		arr[10]="Andrew";arr[11]="knowledge";arr[12]="computer";arr[13]="meat";arr[14]="data";
		arr[15]="law";arr[16]="problem";arr[17]="software";arr[18]="fact";arr[19]="story";
		arr[20]="video";arr[21]="development";arr[22]="industry";arr[23]="oven";arr[24]="movie";
		arr[25]="policy";arr[26]="army";arr[27]="month";arr[28]="university";arr[29]="article";
		int i = r.nextInt(30);
		String rand = arr[i];
		return rand;
	}
	//verb string array
	public static String verb(String[] arr){
		Random r = new Random();
		arr[0]="jump";arr[1]="run";arr[2]="act";arr[3]="alert";arr[4]="allow";
		arr[5]="bake";arr[6]="fight";arr[7]="beat";arr[8]="beg";arr[9]="damage";
		arr[10]="check";arr[11]="deny";arr[12]="collect";arr[13]="dance";arr[14]="chop";
		arr[15]="eat";arr[16]="feel";arr[17]="edit";arr[18]="end";arr[19]="fear";
		arr[20]="fail";arr[21]="develope";arr[22]="heal";arr[23]="gnaw";arr[24]="grab";
		arr[25]="identify";arr[26]="harass";arr[27]="impress";arr[28]="impress";arr[29]="inspect";
		int i = r.nextInt(30);
		String rand = arr[i];
		return rand;
	}
	//adjectives string array
	public static String adjectives(String[] arr){
		Random r = new Random();
		arr[0]="big";arr[1]="black";arr[2]="blue";arr[3]="cheap";arr[4]="caring";
		arr[5]="damp";arr[6]="deep";arr[7]="decisive";arr[8]="dense";arr[9]="defiant";
		arr[10]="triggered";arr[11]="close";arr[12]="far";arr[13]="green";arr[14]="emotional";
		arr[15]="easy";arr[16]="educated";arr[17]="elegant";arr[18]="fat";arr[19]="fast";
		arr[20]="filthy";arr[21]="first";arr[22]="great";arr[23]="firm";arr[24]="fixed";
		arr[25]="fresh";arr[26]="hairy";arr[27]="hard";arr[28]="important";arr[29]="impressive";
		int i = r.nextInt(30);
		String rand = arr[i];
		return rand;
	}
	//prepositions array
	public static String preposition(String[] arr){
		Random r = new Random();
		arr[0]="at";arr[1]="behind";arr[2]="below";arr[3]="down";arr[4]="during";
		arr[5]="before";arr[6]="despite";arr[7]="except";arr[8]="for";arr[9]="following";
		arr[10]="from";arr[11]="in";arr[12]="inside";arr[13]="outside";arr[14]="over";
		arr[15]="past";arr[16]="plus";arr[17]="regarding";arr[18]="round";arr[19]="to";
		arr[20]="towards";arr[21]="than";arr[22]="to";arr[23]="towards";arr[24]="unlike";
		arr[25]="up";arr[26]="upon";arr[27]="versus";arr[28]="via";arr[29]="with";
		int i = r.nextInt(30);
		String rand = arr[i];
		return rand;
	}
	//array for articles
	public static String articles(String[] arr){
		Random r = new Random();
		arr[0]="the";arr[1]="a";
		int i = r.nextInt(2);
		String rand = arr[i];
		return rand;
	}
	//this is the method that makes sure only seven lines will be printed out.
	public static boolean seven(String[] arr){
		int counter = 0;
		for(int i = 7; i >= counter; counter++ ){
			System.out.println(articles(arr) + " "  + adjectives(arr)+ " " + noun() + " "+verb(arr) + " " + preposition(arr) + " "
					+ articles(arr) + " " + adjectives(arr) + " " + noun());
		}
		return true;
		
	}
}
