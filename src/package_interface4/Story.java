package package_interface4;

public class Story {
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
