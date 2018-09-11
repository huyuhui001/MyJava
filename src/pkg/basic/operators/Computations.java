package pkg.basic.operators;

public class Computations {
	boolean first = false;
	boolean second = isTrue();
	boolean resultAnd = first && second;
	boolean resultOr = first || second;
	boolean resultNot = !first;
	boolean resultEquals = (first == second);
	boolean resultNotEquals = (first != second);
	
	boolean isTrue() {
		return false;
	}
}
