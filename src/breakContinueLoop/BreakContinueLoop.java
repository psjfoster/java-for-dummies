package breakContinueLoop;

import java.util.Scanner;
import java.lang.System;

public class BreakContinueLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an int value: ");
			int i = keyboard.nextInt();
			if (i > 10) {
				continue;
			}
			if (i == 0) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Done!");
		keyboard.close();

	}

}
