package package_overload;

//public class Story {
//   
//	public static void main(String[] args) {       
//	Detective duke = new Detective();       
//		   
//	//select one of the options to insert here       
//	for (int i = 0; i < 3; i++) {               
//		duke.buildRobot(i);       
//	}
//
//	System.out.println(duke);    
//	}
//
//}
public class Story {        
	   public static void main(String[] args) {                
	      Detective duke = new Detective();                
	      System.out.println(duke);                                
	      Detective sherlock = new Detective("Sherlock", 12);                
	      System.out.println(sherlock);        
	   }
	}