package forLoop;

import static java.lang.System.out;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0, j = 10; i <= j; i++, j--) {out.println(i + " " + j);}
		
		out.println();
		
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i;
		}
		out.println(total);
	}

	
}
