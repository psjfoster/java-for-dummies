package com.example.weather;

import static java.lang.System.out;

public class TemperatureNice extends Temperature {
	
	// SUBCLASSES DON'T INHERIT CONSTRUCTORS!
	
	public TemperatureNice() {
		// ***"super" stands for a constructor in the parent class***
		super();
	}
	
	public TemperatureNice(double number) {
		super(number);
	}
	
	public TemperatureNice(TempScale scale) {
		super(scale);
	}
	
	public TemperatureNice(double number, TempScale scale) {
		super(number, scale);
	}
	
	public void display() {
		out.printf("%5.2f degrees %s\n", getNumber(), getScale());
	}

}
