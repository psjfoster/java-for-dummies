package com.example.weather;

public class UseTemperatureNice {

	public static void main(String[] args) {

		var temp = new TemperatureNice();
		temp.setNumber(70.0);
		temp.setScale(TempScale.CELSIUS);
		temp.display();
		
		temp = new TemperatureNice(32.0);
		temp.display();
		
		temp = new TemperatureNice(TempScale.FAHRENHEIT);
		temp.display();
		
		temp = new TemperatureNice(2.73, TempScale.KELVIN);
		temp.display();

	}

}
