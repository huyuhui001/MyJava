/*
 * ArrayList是会自动扩增容量的Array
 * 基于效率和类型检验，应尽可能使用Array，无法确定数组大小时才使用ArrayList
 */

package pkg.basic.array;

import java.util.ArrayList;

public class MainArrays {
	public static void main(String args[]) {
		
		//Foreach
		Office newOffice = new Office();
		ArrayList<String> newClues = new ArrayList<String>();
		newClues.add("No more hints about the stolen sword");
		newClues.add("Accunium prices are at an all time high");
		newClues.add("Eric gathered information on a safe deposit box in Hong Kong");
		newOffice.retrieveClues(newClues);
		
		//ArrayList --> Bookshelf and Clue
		Bookshelf shelf = new Bookshelf();
	    
		for (int i = 0; i < shelf.getClues().size(); i++) {
	    	System.out.println(shelf.getClue(i));
	    }
		
		shelf.OutputForeachList();
	}
}


//Foreach
class Office {
	void retrieveClues(ArrayList<String> myClue) {
		for(String c:myClue) {
			System.out.println(c.toString());
		}
	}
}

//
class Bookshelf {
    ArrayList<Clue> clues = new ArrayList<Clue>();
    
	public Bookshelf() {
		Clue firstClue = new Clue();
		firstClue.setText("No more hints about the stolen sword");
		Clue secondClue = new Clue();
		secondClue.setText("Accunium prices are at an all time high");
		Clue thirdClue = new Clue();
		thirdClue.setText("Eric gathered information on a safe deposit box in Hong Kong");
		
		clues.add(firstClue);
		clues.add(secondClue);
		clues.add(thirdClue);
	}

	public String getClue(int i) {
        return clues.get(i).getText();
    }
    
    public ArrayList<Clue> getClues() {
        return clues;
    }
    
    public void OutputForeachList() {
    	for(Clue clue: clues) {
    		System.out.println(clue.getText());
    	}
    }
}


//Read and write string text
class Clue {
	private String text = "";

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}





