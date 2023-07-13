package com.practice.student;

import static java.lang.System.out;

public class Student {
	
	private String name;
	private int idNumber;
	private double gradePointAverage = Double.NaN;
	
	public Major major;
	
	public Student(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}
	
	public Student(String name, int idNumber, double gradePointAverage) {
		this.name = name;
		this.idNumber = idNumber;
		this.gradePointAverage = gradePointAverage;
	}
	
	public Student(String name, int idNumber, Major major) {
		this.name = name;
		this.idNumber = idNumber;
		this.major = major;
	}
	
	public Student(String name, int idNumber, double gradePointAverage, Major major) {
		this.name = name;
		this.idNumber = idNumber;
		this.gradePointAverage = gradePointAverage;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public void introduce() {
		out.printf("%s has a student ID number of %s. ", getName(), getIdNumber());
		
		if (!Double.isNaN(gradePointAverage) && major != null) {
			out.printf("They have a grade point average of %.1f, and are majoring in %s.", gradePointAverage, major);
		} else if (!Double.isNaN(gradePointAverage)) {
			out.printf("They have a grade point average of %.1f.", gradePointAverage);
		} else if (major != null) {
			out.printf("They are majoring in %s.",  major);
		}
		
		out.println();
	}

}
