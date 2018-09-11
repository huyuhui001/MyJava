package pkg.basic.linkedlist;

import java.util.LinkedList;

public class MainLinkedlist {
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


class Stack {
	private LinkedList<String> stack = new LinkedList<>();
	
	public String pop() {
		return this.stack.removeLast();
	}
	
	public void push(String s) {
		this.stack.add(s);
	}
	
	public int size() {
		return this.stack.size();
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String output = "Begin Stack" + newline;
		output += "================" + newline;
		for (String s : stack) {
			output += s + newline;
		}
		output += "================" + newline;
		output += "End Stack" + newline;
		return output;
	}
}


class Queue {
	private LinkedList<String> queue = new LinkedList<>();
	
	public String pop() {
		return this.queue.removeFirst();
	}
	
	public void push(String s) {
		this.queue.add(s);
	}
	
	public int size() {
		return this.queue.size();
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String output = "Begin Queue" + newline;
		output += "================" + newline;
		for (String s : queue) {
			output += s + newline;
		}
		output += "================" + newline;
		output += "End Queue" + newline;
		return output;
	}
}