package com.example.payroll;

import static java.lang.System.out;

public class Employee {
	
	private String name;
	private String jobTitle;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setJobTitle(String jT) {
		jobTitle = jT;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void cutCheck(double amountPaid) {
		out.printf("Pay to the order of %s ", name);
		out.printf("(%s) ***$", jobTitle);
		out.printf("%,.2f\n", amountPaid);
	}
	
}
