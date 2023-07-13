package com.example.weather;

import static java.lang.System.out;

public class UseTemperatureRecord {

	public static void main(String[] args) {
		final String format = "%5.2f degrees %s\n";
		
		TemperatureRecord temp = new TemperatureRecord(2.73, TempScale.KELVIN);
		out.printf(format, temp.number(), temp.scale());

	}

}
