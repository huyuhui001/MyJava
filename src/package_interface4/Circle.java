package package_interface4;

public class Circle implements Measurable {
	double radius;
	double pi = 3.14;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double calculateArea() {
		return this.pi * this.radius * this.radius;
	}

	public double getRadius() {
		return radius;
	}
}
