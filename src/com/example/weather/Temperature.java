package com.example.weather;

public class Temperature {
	
	// fields
	private double number;
	private TempScale scale;
	
	// constructors
	public Temperature() {
		number = 0.0;
		scale = TempScale.CELSIUS;
	}
	
	public Temperature(double number) {
		this.number = number;
		scale = TempScale.CELSIUS;
	}
	
	public Temperature(TempScale scale) {
		number = 0.0;
		this.scale = scale;
	}
	
	public Temperature(double number, TempScale scale) {
		this.number = number;
		this.scale = scale;
	}
	
	// setters and getters
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double getNumber() {
		return number;
	}
	
	public void setScale(TempScale scale) {
		this.scale = scale;
	}
	
	public TempScale getScale() {
		return scale;
	}

}
