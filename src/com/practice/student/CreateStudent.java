package com.practice.student;

public class CreateStudent {

	public static void main(String[] args) {
		
		Student suzy = new Student("Suzy", 1223);
		Student mark = new Student("Mark", 1301, 2.00, Major.HISTORY);
		Student christopher = new Student("Christopher", 1480, 3.45);
		
		suzy.introduce();
		mark.introduce();
		christopher.introduce();

	}

}