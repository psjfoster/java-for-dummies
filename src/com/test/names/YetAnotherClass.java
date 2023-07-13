package com.test.names;

class YetAnotherClass {
	
	YetAnotherClass(Main4 whoCreatedMe) {
		String name = "Leonard";
		System.out.println(name);
		// System.out.println(Main4.name); ILLEGAL
		System.out.println(whoCreatedMe.name);
	}

}
