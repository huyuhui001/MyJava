package package_interface;

public class Rectangle implements Calculation {
	private double length;
	private double width;
	
	Rectangle(double x, double y) {
		this.length = x;
		this.width = y;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double calculateArea() {
		return this.length * this.width;
	}
	
	public double calculatePerimeter() {
		return this.length * 2 + this.width * 2;
	}

}
