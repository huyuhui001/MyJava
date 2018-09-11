package package_interface3;

public class HotPursuit {
	Flyable droneF = new Drone();
	Flyable planeF = new Plane();
	Flyable ravenF = new Raven();
	
	Flyable[] chasers = new Flyable[3];
	
	void chase() {
		chasers[0] = droneF;
		chasers[1] = planeF;
		chasers[2] = ravenF;
		
		for (int i = 0; i < chasers.length; i++) {
			chasers[i].fly();
		}
	}

}
