package IncrementTest;

public class incrementTest {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i++); // 10, then 11
		System.out.println(--i); // 10
		--i; // 9
		i--; // 9, then 8
		System.out.println(i); // 8
		System.out.println(++i); // 9
		System.out.println(i--); // 9, then 8
		System.out.println(i); // 8
		i++; // 8, then 9
		i = i++ + ++i; // 9 + 10 = 19, then 20
		System.out.println(i); // 20
		
		/* the postincrement happens AFTER the whole
		 * statement, so only pops once? */
		i = i++ + i++; // 20 + 20 = 40, then 41
		
		System.out.println(i); // 41
		
		/* 10
		 * 10
		 * 8
		 * 9
		 * 9
		 * 8
		 * 20
		 * 41
		 */
		
		i = 10;
		
		i += 2; // 12
		i -= 5; // 7
		i *= 6; // 42
		
		System.out.println(i); // 42
		System.out.println(i += 3); // 45
		System.out.println(i /= 2); // 22
		
		/* 42
		 * 45
		 * 22
		 */

	}

}
