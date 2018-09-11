/*
 * 验证多态的三个前提:
 * 1.要有继承关系
 * 2.子类要重写父类的方法
 * 3.父类引用指向子类对象
 * https://www.zhihu.com/question/30082151
 */
package pkg.basic.polymorphism;

public class MainPolymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Cat(); //父类Animal引用子类Cat
		myAnimal.eat(); //子类Cat重写了父类Animal的非静态成员方法eat()
		myAnimal.sleep(); //子类Cat重写了父类Animal的静态成员方法sleep()
		myAnimal.run(); //父类Animal的非静态成员方法run()
		System.out.println(myAnimal.num); 
		System.out.println(myAnimal.age);
		
		Cat myCat = (Cat)myAnimal;
		myCat.eat();
		myCat.sleep();
		myCat.catchMouse();
		System.out.println(myCat.name);
		
	}
}

class Animal {
	int num = 10;
	static int age = 20;
	
	public void eat() {
		System.out.println("Annimal is eating");
	}
	
	public static void sleep() {
		System.out.println("Annimal is sleeping");
	}
	
	public void run() {
		System.out.println("Annimal is running");
	}
}

class Cat extends Animal {
	int num = 80;
	static int age = 90;
	String name = "Tom Cat";
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public static void sleep() {
		System.out.println("Cat is sleeping");
	}
	
	public void catchMouse() {
		System.out.println("Cat is catching mouse");
	}
}
