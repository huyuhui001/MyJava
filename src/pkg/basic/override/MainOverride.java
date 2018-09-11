package pkg.basic.override;

public class MainOverride {
	public static void main(String[] args) {
		Car dukesCar = new Car("DetectiveCars", 5, 3.5);
		Car ericsCar = new Car("EvilCorp", 4, 2.5);
		Car musonsCar = new Car("DetectiveCars", 5, 3.5);
		System.out.println(dukesCar.equals(ericsCar));
		System.out.println(dukesCar.equals(musonsCar)); 
	}
}


class Car {
	private String brand;
	private int age;
	private double remainingFuel;

	Car(String brand, int age, double remainingFuel) {
		this.brand = brand;
		this.age = age;
		this.remainingFuel = remainingFuel;
	}
	
//	@Override
	public boolean equals(Car car) {
	    boolean result = false;
	    if(car != null && car instanceof Car) {
	        Car car2 = (Car) car;
	        result = this.brand.equals(car2.brand) && this.age == car2.age && this.remainingFuel == car.remainingFuel;
	    }
	    return result;
	}
}

