package package_interface2;

public class Story{        
	public static void main(String[] args) {
		Car car = new Car();
		Plane plane = new Plane();
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = car;
		vehicles[1] = plane;
		
		Flyable plane2 = plane;
		Flyable drone = new Drone();
		
		Flyable[] flyables = new Flyable[2];
		flyables[0] = drone;
		flyables[1] = plane2;
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].move();
		}
		
		for (int i = 0; i < flyables.length; i++) {        
			flyables[i].fly();
	    }
	}
}