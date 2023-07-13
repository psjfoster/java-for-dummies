package com.example.hotel;

import static java.lang.System.out;

public class ShowReverseGuests {

	public static void main(String[] args) {
		int[] guests = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
		
		out.println("Level\tGuests");
		
		for (int levelNum = guests.length -1; levelNum >= 0; levelNum--) {
			out.print(levelNum);
			out.print("\t");
			out.println(guests[levelNum]);
		}
	}

}
