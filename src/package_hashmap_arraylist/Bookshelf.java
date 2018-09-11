package package_hashmap_arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class Bookshelf {
	HashMap<String, ArrayList<Clue>> clueHashMap = new HashMap<String, ArrayList<Clue>>();
	ArrayList<Clue> usedClues = new ArrayList<Clue>();
	ArrayList<Clue> unusedClues = new ArrayList<Clue>();
	
	void saveClues(ArrayList<Clue> clues) {
		for(int i=0; i < clues.size(); i++){
            Clue clue = clues.get(i);
            if(clue.getUsed()){
                usedClues.add(clue);
            }else{
                unusedClues.add(clue);
            }
		}
		
		for(Clue c:usedClues) {
			System.out.println(c.getText());
		}
		
		for(Clue c:unusedClues) {
			System.out.println(c.getText());
		}
	}
	
	void buildHashMap() {
        clueHashMap.put("used", usedClues);
        clueHashMap.put("unused", unusedClues);
	}
	
	
	// please just leave this code as it is,
	// it helps you to get an output if you run your code.
	// Also, it might server as a reference for using a foreach loop. ;-)
	void printHashMap(){
	    for (String key : clueHashMap.keySet()){
	        System.out.println("The clue list \""  + key + "\" contains the clues:");
	        for(Clue clue : clueHashMap.get(key)){
	            System.out.println("\t" + clue);
	        }
	    }
	}
}

