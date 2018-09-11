package package_interface;

public class MainClass {
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5, 6);
		Circle myCircle = new Circle(3);
		
		System.out.println(myRectangle.calculateArea());
		System.out.println(myRectangle.calculatePerimeter());
		System.out.println(myCircle.calculateArea());
		System.out.println(myCircle.calculatePerimeter());
	}
}
