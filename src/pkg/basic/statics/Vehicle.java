package pkg.basic.statics;

public class Vehicle {
	   public static final double METRIC_TO_MILES = 0.62;   
	   public int kmh = 100;
	   public static int mph = 62;

	   public Vehicle() {   }   

	   public double convert() {     
	      return kmh * METRIC_TO_MILES; 
	   }    

	   public static double reverse() {
		   return mph / METRIC_TO_MILES;
	   }
}
