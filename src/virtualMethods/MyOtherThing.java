package virtualMethods;

public class MyOtherThing extends MyThing {
	@Override
	public void display() {
		System.out.println("In MyOTHERThing, value is " + value);
	}

}