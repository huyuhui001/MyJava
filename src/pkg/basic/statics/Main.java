package pkg.basic.statics;

public class Main {
	public static void main(String[] args) {
		
		//Class InstanceCounter
		System.out.println("Instance counter starts with: " + InstanceCounter.getCount());
		for (int i = 1; i <= 500; i++) {
			new InstanceCounter();   //addInstance()不可用
		}
		System.out.println("Instance counter ends with: " + InstanceCounter.getCount());
		
		//Class Vehicle
		Vehicle newVehicle = new Vehicle();     
	    System.out.println(newVehicle.kmh + " --> " + newVehicle.convert());
	    System.out.println(Vehicle.mph + " --> " + Vehicle.reverse());
	    
	    //Class WhatDoesItDo
	    WhatDoesItDo newWhatDoesItDo = new WhatDoesItDo();
	    System.out.println("result starts with: " + newWhatDoesItDo.resut); 
		for (int i = 0; i < 5; i++) {
			System.out.println(WhatDoesItDo.count(i));
		}
		System.out.println("result ends with: " + newWhatDoesItDo.resut);    //有warning，没有按照static方式访问static变量
		
		//Class Detective
		Detective myDetective = new Detective();
		myDetective.setName("Duke");
		myDetective.setAge(19);
		myDetective.speak();
	}
}
