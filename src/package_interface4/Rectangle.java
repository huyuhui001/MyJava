package package_interface4;

public class Rectangle implements Measurable {
	double length;
	double width;
	
	Rectangle(double d, double e){
		this.length = d;
		this.width = e;
	}
	
	public double calculateArea() {
		return this.length * this.width;
	}
	
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
}
