package com.example.weather;

import static java.lang.System.out;

public class UseTemperature {

	public static void main(String[] args) {
		final String format = "%5.2f degrees %s\n";
		
		var temp = new Temperature();
		temp.setNumber(70.0);
		temp.setScale(TempScale.CELSIUS);
		out.printf(format, temp.getNumber(), temp.getScale());
		
		temp = new Temperature(32.0);
		out.printf(format, temp.getNumber(), temp.getScale());
		
		temp = new Temperature(TempScale.FAHRENHEIT);
		out.printf(format, temp.getNumber(), temp.getScale());
		
		temp = new Temperature(2.73, TempScale.KELVIN);
		out.printf(format, temp.getNumber(), temp.getScale());

	}

}
