/*
 * We have started a very easy and not yet complete implementation of a Stack and a Queue here. 
 * Have a look at the code and play around with it. If you have already advanced knowledge, you 
 * can try to modify the collections, so that they accept elements of an arbitrary type. Have a 
 * further look at Java Generics for that. Another interesting topic related to collections are 
 * Iterators, with which you might want to play around.
 */

package package_linkedlist;

//import java.util.ArrayList;
//import java.util.LinkedList;

public class Story {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("Tommy");
		stack.push("Robert");
		stack.push("Rafi");
		stack.push("Rolf");
		
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		
		Queue queue = new Queue();
		queue.push("Tommy");
		queue.push("Robert");
		queue.push("Rafi");
		queue.push("Rolf");
		
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());
		
	}

}