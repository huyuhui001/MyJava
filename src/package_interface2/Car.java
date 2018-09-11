package package_interface2;

public class Car extends Vehicle {
	@Override
	public void move() {
		drive();
	}

	private void drive() {
		System.out.println("BrummBrumm");
	}
}
