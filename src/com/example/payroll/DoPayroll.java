package com.example.payroll;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {

	public static void main(String[] args) throws IOException {
		var employeeInfo = new File("EmployeeInfo.txt");
		System.out.println("Looking for " + employeeInfo.getCanonicalPath());
		
		var diskScanner = new Scanner(employeeInfo);
		
		for (int empNum = 1; empNum <= 3; empNum++) {
			payOneEmployee(diskScanner);
		}
		diskScanner.close();
	}
	
	static void payOneEmployee(Scanner aScanner) {
		var anEmployee = new Employee();
		
		anEmployee.setName(aScanner.nextLine());
		anEmployee.setJobTitle(aScanner.nextLine());
		anEmployee.cutCheck(aScanner.nextDouble());
		// nextDouble doesn't read the line break like nextLine does, so we insert another nextLine call
		aScanner.nextLine();
	}
}
