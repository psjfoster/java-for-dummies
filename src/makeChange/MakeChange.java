package makeChange;

import static java.lang.System.out;

// This one is a great example, useful for binary maths
public class MakeChange { 

	public static void main(String[] args) {
		int total = 512;
		int quarters = total / 25;
		int whatsLeft = total % 25;
		
		int dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		
		int nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		
		int cents = whatsLeft;
		
		out.println("From " + total + " cents you get:");
		out.println(quarters + " quarters");
		out.println(dimes + " dimes");
		out.println(nickels + " nickels, and");
		out.println(cents + " cents");

	}

}
