package goLarge;

import java.util.Scanner;
import java.lang.System;

public class GoLarge {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Need to remember the largest number?");
		System.out.println("I can help you with that!");
		System.out.println("Start typing +ve integers with gay abandon");
		System.out.println("and when you want to stop, simply type");
		System.out.println("0 or a negative number.");
		System.out.println("Then I will tell you what the biggest");
		System.out.println("positive integer you typed was. Try me!");
		
		int checkNumber = keyboard.nextInt();
		int largestNumber = 0;
		
		if (checkNumber <= 0) {
			System.out.println();
			System.out.println("That's not a positive number!");
			System.out.println("If you really don't want to try me,");
			System.out.println("please confirm by doing that again.");
			checkNumber = 1;
		} else {
			largestNumber = checkNumber;
		}
		
		while (checkNumber > 0) {
			checkNumber = keyboard.nextInt();

			if (checkNumber > largestNumber) {
				largestNumber = checkNumber;
			}
		}
		
		System.out.println();
		
		if (largestNumber > 0) {
			System.out.println("Thanks for those delicious numbers!");
			System.out.println("The largest you fed me was *" + largestNumber + "!*");
		} else {
			System.out.println("You didn't feed me any numbers!");
			System.out.println("That makes me sad. Goodbye forever.");
		}
						
		keyboard.close();
	}

}
