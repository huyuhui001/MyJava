package pkg.basic.operators;

public class Main {	
	public static void main(String[] args) {
		Computations myComputations = new Computations();
		System.out.println(myComputations.resultAnd);
		System.out.println(myComputations.resultOr);
		System.out.println(myComputations.resultNot);
		System.out.println(myComputations.resultEquals);
		System.out.println(myComputations.resultNotEquals);
		
		Comparisions myComparisions = new Comparisions();
		myComparisions.getResult();
		
		BitOps myBitOps = new BitOps();
		myBitOps.getResult();
		
		ConditionalOps myConditionalOps = new ConditionalOps();
		myConditionalOps.getResult();
		
		InstanceOf myInstanceOf = new InstanceOf();
		myInstanceOf.getResult();
	}
}









