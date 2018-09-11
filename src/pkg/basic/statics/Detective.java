package pkg.basic.statics;

public class Detective {
	private String name;
	private int age;
	
	void speak() {
		System.out.println("My name is " + getName() + " and my age is " + getAge() + " and I am " + allowedToDrive() + " to drive.");
	}
	
	void setName(String myName) {
		this.name = myName;
	}
	
	void setAge(int myAge) {
		this.age = myAge;
	}
	
	String getName() {
		return this.name; 
	}
	
	int getAge() {
		return this.age;
	}
	
	boolean allowedToDrive() {
		int minAge = 18;
		return age >= minAge;
	}
}
