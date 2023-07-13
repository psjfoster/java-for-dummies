package com.practice.places;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class DisplayThePlaces {

	public static void main(String[] args) {
		
		PlaceToLive place1 = new PlaceToLive();
		PlaceToLive place2 = new PlaceToLive();
		PlaceToLive place3 = new PlaceToLive();
		
		place1.setAddress("12 New Close");
		place1.setNumberOfBedrooms(2);
		place1.setAreaSqrMetres(123.00);
		
		place2.setAddress("34 End Road");
		place2.setNumberOfBedrooms(3);
		place2.setAreaSqrMetres(456.00);
		
		place3.setAddress("56 Old Avenue");
		place3.setNumberOfBedrooms(4);
		place3.setAreaSqrMetres(789.00);
		
		var keyboard = new Scanner(in);
		
		displayPlace(place1, keyboard);
		displayPlace(place2, keyboard);
		displayPlace(place3, keyboard);
		
		keyboard.close();
	}
	
	static void displayPlace(PlaceToLive place, Scanner scanner) {
		
		out.printf("The place at %s ", place.getAddress());
		out.printf("has %s bedrooms ", place.getNumberOfBedrooms());
		out.printf("and has an area of %.2f square metres. ", place.getAreaSqrMetres());
		out.print("How much does it cost per month? £");
		
		place.setCostOfLiving(scanner.nextDouble());
		
		out.printf("That means it costs £%.2f ", place.getCostPerBedroom());
		out.printf("per bedroom and £%.2f ", place.getCostPerSqrMetre());
		out.println("per square metre.");
		out.println();
		
	}

}
