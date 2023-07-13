package com.test.names;

public class Main4 {
	String name = "Betty";

	public static void main(String[] args) {
		new Main4();

	}
	
	Main4() {
		String name = "Barry";
		new YetAnotherClass(this);
	}

}
