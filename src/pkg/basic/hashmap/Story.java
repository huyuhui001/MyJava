/*
Duke still recalls one of his old cases: he once found valuable information in the memory of electronic doors 
when sneaking into his nemesis' headquarter. The doors were operated with access codes. These codes were usable 
only a certain number of times. The same now applies for the deposit boxes in the bank in Hong Kong - which 
explains why Eric could open the box so easily!

Access codes for the doors are represented by objects of class AccessCode.

In the class Door, create a HashMap with the identifier doorCodes. It should save objects of type AccessCode 
as values, and the keys for these objects should be Strings.

Afterwards, implement the method addDoorKey() in class Door. It should accept a String and an object of type 
AccessCode, and store the passed key (String) and value (AccessCode) arguments in the HashMap doorCodes.

Lastly, add a method useCode() to the class Door which accepts a String as parameter. The method should first 
check, whether the given key (passed as a String argument) exists in the doorCodes HashMap. If it does, 
1) the method should look up the respective AccessCode that might belong to the passed (key-)String.
2) The attribute numberOfTimesUsed of the AccessCode object should be increased by 1 then.
3) If numberOfTimesUsed is greater than 2 afterwards, the attribute valid has to be set to false and the method 
   should print out "AccessCode no longer valid".
4) If numberOfTimesUsed is not greater than 2, the method should print out "AccessCode valid".
5) If the given key does not exists in the doorCodes HashMap, the method should print out "AccessCode invalid".

Hint 1: AccessCode offers some getters and setters. Have a look at this class to use them correctly.
Hint 2: You can find the JavaDocs for HashMap here to look up how the HashMap works in detail. 
        Search for put(), containsKey() and get().
Hint 3: If you need more space for the editor textfield, remember that you can simply click on the title of this 
        exercise description to hide this text.
 */
package pkg.basic.hashmap;

import java.util.ArrayList;

public class Story {
	
	/*  Story : Door + AccessCode  */
	public static void main(String args[]) {
		Door door = new Door();
		AccessCode accessCodeDoor1 = new AccessCode(1, "12.02.2003");
		AccessCode accessCodeDoor2 = new AccessCode(2, "23.02.2016");

		door.addDoorKey("superSafePassword", accessCodeDoor1);
		door.addDoorKey("parrotCake", accessCodeDoor2);

		door.useCode("superSafePassword");
		door.useCode("parrotCake");
		door.useCode("Eric");
		
		/*  Story: Clue + Bookshelf  */
		// create an ArrayList of all clues
		ArrayList<Clue> clues = new ArrayList<>();
		Clue clue1 = new Clue("Eric bought books about logic", true);
		Clue clue2 = new Clue("The flower seed was stolen from the museum", true);
		Clue clue3 = new Clue("There is a reward on Erics head", false);
		Clue clue4 = new Clue("Accunium prices are at an all time high", false);
		
		// add all the clues to the ArrayList clues
		clues.add(clue1);
		clues.add(clue2);
		clues.add(clue3);
		clues.add(clue4);
		
		// create an empty Bookshelf
		Bookshelf shelf = new Bookshelf();
		
		// save the clues in the Bookshelf
		shelf.saveClues(clues);
				
		//build the Hashmap
		shelf.buildHashMap();
				
		// print out the HashMap of Bookshelf
		shelf.printHashMap();
	}
}

