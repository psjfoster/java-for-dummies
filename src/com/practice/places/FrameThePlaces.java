package com.practice.places;

import com.allmycode.dummiesframe.DummiesFrame;

public class FrameThePlaces {

	public static void main(String[] args) {
		
		DummiesFrame frame = new DummiesFrame("A place to live");
		
		frame.addRow("Address");
		frame.addRow("Number of bedrooms");
		frame.addRow("Area (m²)");
		frame.addRow("Cost per month (£)");
		frame.setButtonText("Calculate");
		frame.go();
	
	}
	
	public static String calculate(String a, int n, double m, double c) {
		
		PlaceToLive place = new PlaceToLive();
		
		place.setAddress(a);
		place.setNumberOfBedrooms(n);
		place.setAreaSqrMetres(m);
		place.setCostOfLiving(c);
		
		return String.format("This place costs £%.2f per bedroom", place.getCostPerBedroom()) + 
			   String.format(" and £%.2f per square metre.\n", place.getCostPerSqrMetre());
		
	}

}
