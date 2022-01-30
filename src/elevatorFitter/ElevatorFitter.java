package elevatorFitter;

import static java.lang.System.out;

public class ElevatorFitter {

	public static void main(String[] args) {
		int weightOfAPerson = 139;
		int elevatorWeightLimit = 1400;
		int numberOfPeople = elevatorWeightLimit / weightOfAPerson;
		
		boolean allTenOkay = numberOfPeople >= 10;
		
		if (allTenOkay == true) {
			out.print("You can ");
		} else {
			out.print("You can't ");
		}
		
		out.println("fit all ten of the");
		out.println("Brickenchicker dectuplets");
		out.println("on the elevator.");

	}

}
