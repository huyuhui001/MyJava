package pkg.basic.operators;

public class Comparisions {
	int a = 2;
	int b = 3;
	int c = 2;
	
	double d = 2.0;
	double e = 3.0;
	double f = 2.0;
	
	String string1 = "Test";
	String string2 = "test";
	
	void getResult() {
		System.out.println("a == b: " + (a == b));
		System.out.println("a == c: " + (a == c));
		System.out.println("b == c: " + (b == c));
		
		System.out.println("d > e: " + (d > e));
		System.out.println("d < e: " + (d < e));
		System.out.println("d >= f: " + (d >= f));
		
		System.out.println(string1 + " == " + string2 + ": " + string1.equals(string2));
	}	
}
