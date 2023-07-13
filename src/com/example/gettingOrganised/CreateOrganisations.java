package com.example.gettingOrganised;

import com.allmycode.dummiesframe.DummiesFrame;

public class CreateOrganisations {

	public static void main(String[] args) {
		DummiesFrame frame = new DummiesFrame("Calculate tax");
		frame.addRow("Organisation name");
		frame.addRow("Annual revenue");
		frame.addRow("Is profit making?");
		frame.setButtonText("Calculate");
		frame.go();
	}
		
	public static String calculate(String n, double a, boolean p) {
		
		Organisation o = new Organisation();
		
		o.setName(n);
		o.setAnnualRevenue(a);
		o.setIsProfitMaking(p);
		
		return o.getName() + 
	           " pays $" + 
	           String.format("%.2f", o.getTax()) + 
	           " a year in tax.";
	}

}
