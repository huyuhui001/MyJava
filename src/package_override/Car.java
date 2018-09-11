package package_override;

public class Car {
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
