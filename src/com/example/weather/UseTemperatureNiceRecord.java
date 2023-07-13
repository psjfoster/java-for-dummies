package com.example.weather;

public class UseTemperatureNiceRecord {

	public static void main(String[] args) {
		var temp = new TemperatureNiceRecord();
		temp.display();
		
		temp = new TemperatureNiceRecord(2.73, TempScale.KELVIN);
		temp.display();
	}
}
