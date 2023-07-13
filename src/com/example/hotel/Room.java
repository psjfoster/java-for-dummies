package com.example.hotel;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class Room {
	private int guests;
	private double rate;
	private boolean smoking;
	private static NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	public void readRoom(Scanner diskScanner) {
		guests = diskScanner.nextInt();
		rate = diskScanner.nextDouble();
		smoking = diskScanner.nextBoolean();
	}
	
	public void writeRoom() {
		out.print(guests);
		out.print("\t");
		out.print(currency.format(rate));
		out.print("\t");
		out.println(smoking ? "yes" : "no");
	}

}
