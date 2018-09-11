/*
To clean up his bookshelf, Duke wants to separate all clues he already used from the clues he did not use yet.

In the class Bookshelf, create two ArrayLists, usedClues and unusedClues that may contain objects of type Clue.

Add a method saveClues() to the class Bookshelf afterwards. It should accept an ArrayList of Clue​s as parameter. 
The method should iterate over all elements of the passed ArrayList and store the elements accordingly. If the 
attribute used of a Clue element is set to true, it should be saved in the list usedClues , otherwise it should 
be assigned to the list unusedClues.

Lastly, add another attribute to the class Bookshelf: a HashMap with the identifier clueHashMap. Stored under 
the key “used”, this HashMap should contain the ArrayList usedClues. Under the key “unused”, 
store the ArrayList unusedClues. This assignment should be done in the already existing method buildHashMap().

Hint: The number of elements of an ArrayList can be retrieved with the method size(). Use the Java Docs for 
ArrayLists and HashMaps in case you need to learn more about needed methods.
 */
package package_hashmap_arraylist;

import java.util.ArrayList;

public class Story {

	public static void main(String[] args) {
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

