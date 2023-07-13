package unprogram;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		out.printf("%s%s%s", ">>", 7, "<<\n");
		out.printf("%s%10s%s", ">>", 7, "<<\n");
		out.printf("%s%-10s%s", ">>", 7, "<<\n");
		out.printf("%s%010d%s", ">>", 7, "<<\n");
		out.printf("%s%+d%s", ">>", 7, "<<\n");
		out.printf("%s%+d%s", ">>", -7, "<<\n");
		out.printf("%s%(d%s", ">>", -7, "<<\n");
		out.printf("%s%10.5f%s", ">>", 7.0, "<<\n");
		out.printf("%s%S%s", ">>", "Hello", "<<\n");
		out.printf("%s%c%s", ">>", 'x', "<<\n");
		out.printf("%s%C%s", ">>", 'x', "<<\n");

	}

}
