package com.practice.places;

public class PlaceToLive {
	
	private String address;
	private int numberOfBedrooms;
	private double areaSqrMetres;
	private double costOfLiving;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		address = a;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int b) {
		numberOfBedrooms = b;
	}
	public double getAreaSqrMetres() {
		return areaSqrMetres;
	}
	public void setAreaSqrMetres(double m) {
		areaSqrMetres = m;
	}
	public double getCostOfLiving() {
		return costOfLiving;
	}
	public void setCostOfLiving(double c) {
		costOfLiving = c;
	}
	public double getCostPerBedroom() {
		return costOfLiving / numberOfBedrooms;
	}
	public double getCostPerSqrMetre() {
		return costOfLiving / areaSqrMetres;
	}
}
