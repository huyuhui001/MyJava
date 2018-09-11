package package_overload;

//public class Detective {        
//   private ArrayList<Robot> robots = new ArrayList<>();        
//
//   public void buildRobot(int i) {                
//      String[] colors = {"red", "green", "blue"}; 
//      robots.add(new Robot(colors[i]));      
//   }        
//
//   //select one of the options to insert here
//   //(have a look at the last line of code of class Story first) 
//   @Override        
//   public String toString() {                
//      String output =  "Hello, I'm Duke.\n";                
//      output += "My robots are:\n";                
//      for (Robot r : robots) {                        
//         output += r.color + "\n";                
//      }               
//      return output;        
//   }
//}

public class Detective {        
	   private int age;        
	   private String name;
//	   double d = Double.parseDouble(name);

	   public Detective(String name, int age) {                
	      this.name = name;                
	      this.age = age;        
	   }   
	   
	   public Detective() {                
	      this("Duke", 43);        
	   }           

	   @Override        
	   public String toString() {                
	       return this.name + this.age;        
	   }
	}



