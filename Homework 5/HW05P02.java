/*
 Abraham Estrada
 This program will get the area of the four cities of Atlanta, Charlotte, Savannah, Orlando. The area is from the triangles that are made from the longitude and latitude.
 you need to do two seperate triangles and then add the two toogether to get the final area. 
 
 */
public class HW05P02 {
	public static void main(String[] args){
		// Switch all the locations to radians. Grab the latitude and longitude of the locations. Make sure to make them as constants. 
		
		final double RADIUS =6371.01; 
		
		final double ATLANTA_LAT = Math.toRadians(33.7489954);
		final double ATLANTA_LONG = Math.toRadians(-84.3879824);
		final double CHARLOTTE_LAT = Math.toRadians(35.2270869);
		final double CHARLOTTE_LONG = Math.toRadians(-80.84312669999997);
		final double SAVANNAH_LAT = Math.toRadians(32.0835407);
		final double SAVANNAH_LONG = Math.toRadians(-81.09983419999998);
		final double ORLANDO_LAT = Math.toRadians(28.5383355); 
		final double ORLANDO_LONG = Math.toRadians(-81.37923649999999);
		
		// distance between the locations 
		
		double distanceAtlToCha = RADIUS * Math.acos(Math.sin(ATLANTA_LAT) * Math.sin(CHARLOTTE_LAT) + Math.cos(ATLANTA_LAT) * Math.cos(CHARLOTTE_LAT) * Math.cos(ATLANTA_LONG-CHARLOTTE_LONG));
		double distanceAtlToSav = RADIUS * Math.acos(Math.sin(ATLANTA_LAT) * Math.sin(SAVANNAH_LAT) + Math.cos(ATLANTA_LAT) * Math.cos(SAVANNAH_LAT) * Math.cos( ATLANTA_LONG - SAVANNAH_LONG )); 
		double distanceAtlToOrl = RADIUS * Math.acos(Math.sin(ATLANTA_LAT) * Math.sin(ORLANDO_LAT) + Math.cos(ATLANTA_LAT) * Math.cos(ORLANDO_LAT) * Math.cos( ATLANTA_LONG - ORLANDO_LONG ));
		double distanceChaToSav = RADIUS * Math.acos(Math.sin(CHARLOTTE_LAT) * Math.sin(SAVANNAH_LAT) + Math.cos(CHARLOTTE_LAT) * Math.cos(SAVANNAH_LAT) * Math.cos( CHARLOTTE_LONG - SAVANNAH_LONG )); 
		double distanceSavToOrl = RADIUS * Math.acos(Math.sin(SAVANNAH_LAT) * Math.sin(ORLANDO_LAT) + Math.cos(SAVANNAH_LAT) * Math.cos(ORLANDO_LAT) * Math.cos( SAVANNAH_LONG - ORLANDO_LONG ));
		
		//triangle one is atlanta savannah and charlotte. Grab all the sides that are involved and take the Area.
		double side = (distanceAtlToCha + distanceAtlToSav + distanceChaToSav)/2;
		double triangleOneArea = Math.sqrt(side * (side - distanceAtlToCha) * (side - distanceAtlToSav) * (side - distanceChaToSav));
		
		
		//triangle 2 atlanta savannah and orlando.
		double sideTwo = (distanceAtlToSav + distanceSavToOrl + distanceAtlToOrl)/2;
		double triangleTwoArea = Math.sqrt(sideTwo * (sideTwo - distanceAtlToSav) * (sideTwo - distanceSavToOrl) * (sideTwo - distanceAtlToOrl));
		
		// Add the area's 
		double fourCitiesArea = triangleOneArea + triangleTwoArea;
		//ROUND THE FOURCITIES AREA
		double fourCitiesAreaRound = Math.round(fourCitiesArea * 10000) /10000.0;
		System.out.println("The Area is: " + fourCitiesAreaRound + " Km Squared");
	}
}
