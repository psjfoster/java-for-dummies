package factorial;

import java.util.Scanner;
import java.lang.System;

public class Factorial {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter an integer to see its factorial: ");
		
		int result;
		int f = keyboard.nextInt();
		keyboard.close();
		
		System.out.println();
		System.out.print(f + "! = ");
		
		for (result = 1; f > 1; f--) {
			System.out.print(f + " x ");
			result *= f;
		}
		
		System.out.print("1 = " + result);
		
	}

}
