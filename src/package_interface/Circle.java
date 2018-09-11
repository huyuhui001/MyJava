package package_interface;

public class Circle {
	private double radius;
	
	Circle(double x) {
		this.radius = x;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double calculateArea() {
		return this.radius * this.radius * 3.14;
	}
	
	public double calculatePerimeter() {
		return this.radius * 3.14 * 2;
	}
}
