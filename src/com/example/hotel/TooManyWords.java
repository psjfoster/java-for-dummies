package com.example.hotel;

import static java.lang.System.out;
import java.util.Scanner;

public class TooManyWords {

	public static void main(String[] args) {
		int[] words = {0, 296, 342, 405, 363, 350, 323, 101};
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Choose a page number between 1 and 7: ");
		int pageNum = keyboard.nextInt();
		
		while (pageNum >= words.length || pageNum < 1) {
			out.print("That page doesn't exist! Choose a page number between 1 and 7: ");
			pageNum = keyboard.nextInt();
		}
		
		out.println();
		out.println("That page contains " + words[pageNum] + " words on average!");
		
		keyboard.close();
	}

}
