package millionaire;

public class Millionaire {

	public static void main(String[] args) {
		
		double amountInAccount;
		
		amountInAccount = 50.22;
		amountInAccount = amountInAccount + 1_000_000.00;
		
		System.out.print("You have $");
		System.out.print(amountInAccount);
		System.out.println(" in your account.");
		
		amountInAccount = 2_000_000.00;
		
		System.out.print("Now you have even more! You have $");
		System.out.print(amountInAccount);
		System.out.println(" in your account.");
		
	}

}
