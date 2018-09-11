package package_helloworld;

import pkg.basic.operators.Comparisions;
import pkg.basic.operators.Computations;

class HelloWorld {
	public static void main(String[] args) {

		MethodCalls myMethodCalls = new MethodCalls();
		myMethodCalls.initial();
		
		System.out.println("*****************************************************");
		
		Detective myDetective = new Detective();
		myDetective.name = "Duke";
		myDetective.age = 16;
		System.out.println(myDetective.name);
		myDetective.speak();
		System.out.println(myDetective.allowedToDrive());
		
		System.out.println("*****************************************************");
		
		Computations myComputations = new Computations();
		System.out.println(myComputations.resultAnd);
		System.out.println(myComputations.resultOr);
		System.out.println(myComputations.resultNot);
		System.out.println(myComputations.resultEquals);
		System.out.println(myComputations.resultNotEquals);
		
		System.out.println("*****************************************************");
		
		Comparisions myComparisions = new Comparisions();
		myComparisions.getResult();
		
		System.out.println("*****************************************************");
		
		StandardFunc myStandardFunc = new StandardFunc();
		
		myStandardFunc.number1 = 5.6;
		myStandardFunc.string1 = "Test messages";
		myStandardFunc.getUpperCase();
		myStandardFunc.getCharLocation();
		System.out.println(myStandardFunc.getMathFunc());
		
		System.out.println("*****************************************************");
		
		OutputArray myOutputArray = new OutputArray();
		
		myOutputArray.cases[0] = "string1";
		myOutputArray.cases[1] = "string2";
		myOutputArray.cases[2] = "string3";
		myOutputArray.cases[3] = "string4";
		myOutputArray.cases[4] = "string5";
		
		myOutputArray.getArray1();
		myOutputArray.getArray2();
		myOutputArray.getArray3();
		System.out.println("The size of the array is: " + myOutputArray.cases.length);
		
		System.out.println("*****************************************************");
		
		LoopsFunc myLoopsFunc = new LoopsFunc();
		System.out.println(myLoopsFunc.getRandNum());
		
		System.out.println("*****************************************************");
		
		String stringConcat = "Hello";
		stringConcat.concat("Kitty");
		System.out.println(stringConcat);
		
		System.out.println("*****************************************************");
		
		ConstructorRobot myConstructorRobot1 = new ConstructorRobot("blue", 3);
		System.out.println(myConstructorRobot1.color + " ; " + myConstructorRobot1.numberOfEyes);
		
		ConstructorRobot myConstructorRobot2 = new ConstructorRobot("blue");
		System.out.println(myConstructorRobot2.color + " ; " + myConstructorRobot2.numberOfEyes);
		
		ConstructorRobot myConstructorRobot3 = new ConstructorRobot(3);
		System.out.println(myConstructorRobot3.color + " ; " + myConstructorRobot3.numberOfEyes);
		
		ConstructorRobot myConstructorRobot4 = new ConstructorRobot();
		System.out.println(myConstructorRobot4.color + " ; " + myConstructorRobot4.numberOfEyes);
		
		System.out.println("*****************************************************");
		
		myLoopsFunc.doSomething();
		
		System.out.println("*****************************************************");
		
		PrivateExample duke = new PrivateExample();
		duke.setName("Duke");
		System.out.println(duke.getName());
		
		System.out.println("*****************************************************");

		
		
		
	}
}

