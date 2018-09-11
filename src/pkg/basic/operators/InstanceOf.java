/*
 * 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）
 * 如果运算符左侧变量所指的对象，是操作符右侧类或接口(class/interface)的一个对象，那么结果为真
 * ( Object reference variable ) instanceof  (class/interface type)
 */

package pkg.basic.operators;

class Vehicle {}

class Car extends Vehicle {}

public class InstanceOf {
	String name = "James";
	Vehicle v1 = new Vehicle();
	Vehicle v2 = new Car();
	Car c1 = new Car();
	
	void getResult() {
		boolean resulta = name instanceof String;       // 因为 name 是 String 类型，所以返回真
		System.out.println("Resulta is :" + resulta);
		
		boolean result1 = v1 instanceof Vehicle;        // true
		boolean result2 = c1 instanceof Car;            // true
		boolean result3 = v1 instanceof Car;            // false 子类的实例可以声明为父类型，但父类的实例不能声明为子类型。
		boolean result4 = c1 instanceof Vehicle;        // true
		boolean result5 = v2 instanceof Vehicle;        // true
		boolean result6 = v2 instanceof Car;            // true
		
		System.out.println("Result1 is :" + result1);
		System.out.println("Result2 is :" + result2);
		System.out.println("Result3 is :" + result3);
		System.out.println("Result4 is :" + result4);
		System.out.println("Result5 is :" + result5);
		System.out.println("Result6 is :" + result6);
	}
}

