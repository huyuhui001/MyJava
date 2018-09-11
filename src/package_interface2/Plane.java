package package_interface2;

public class Plane extends Vehicle implements Flyable {
	@Override
	public void move() {
		fly();
	}

	@Override
	public void fly() {
		System.out.println("Bsssssss");
	}
}
