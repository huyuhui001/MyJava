package pkg.basic.interfaces;

public class MainInterfaces {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10.0, 5.0);
		Rectangle rectangle2 = new Rectangle(7.0, 3.5);
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(2.5);
		
		System.out.println("The area of rectangle1 is: " + rectangle1.calculateArea());
		System.out.println("The area of rectangle2 is: " + rectangle2.calculateArea());
		System.out.println("The area of circle1 is: " + circle1.calculateArea());
		System.out.println("The area of circle2 is: " + circle2.calculateArea());
	}
}

class Rectangle implements Measurable {
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

class Circle implements Measurable {
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

interface Measurable {
	public abstract double calculateArea();
}