package asterisks;

import java.lang.System;

public class Asterisks {

	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int repeat = 3; repeat > 0; repeat--) {
			for (int row = 0; row < 5; row++) {
				for (int column = 0; column <= row; column++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}		

	}

}
