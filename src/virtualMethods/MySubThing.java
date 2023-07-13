package virtualMethods;

public class MySubThing extends MyThing {
	@Override
	public void display() {
		System.out.println("In MySUBThing, value is " + value);
	}

}
