package month;

import static java.lang.System.*;
import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		out.println("How many days are in a month?");
		
		Scanner keyboard = new Scanner(in);
		out.println("Choose a month: ");
		String month = keyboard.next();
		
		String monthCase = month.toLowerCase();
		monthCase = monthCase.substring(0, 3);
				
		switch (monthCase) {
		case "sep", "apr", "jun", "nov":
			out.println(month + " has 30 days.");
			break;
		case "feb":
			out.println("Is it a leap year? y/n:");
			String isLeap = keyboard.next();
			if (isLeap.startsWith("y") || isLeap.startsWith("Y")) {
				out.println(month + " has 29 days in a leap year.");
			} else {
				out.println(month + " has 28 days.");
			}
			break;
		default:
			out.println(month + " has 31 days.");
			break;		
		}
		
		keyboard.close();

	}

}