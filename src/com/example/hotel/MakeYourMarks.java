package com.example.hotel;

import static java.lang.System.out;
import java.util.Scanner;

public class MakeYourMarks {

	public static void main(String[] args) {
		int[] asterisks = new int[5];
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < asterisks.length; i++) {
			asterisks[i] = keyboard.nextInt();
		}
		
		for (int o = 0; o < asterisks.length; o++) {
			
			for (int a = asterisks[o]; a > 0; a--) {
				out.print("*");
			}
			out.print("\n");
		}
		
		keyboard.close();

	}

}
