package pkg.basic.exceptions;

public class MainExceptions {
	public static void main(String args[]) {
	    //System.out.println(1/0);
	    //System.out.println(1.0/0.0);
	    //System.out.println((float)1/0);
	
		Calculator calculator = new Calculator();
		System.out.println("4 divided by 2 is: " + calculator.div(4,2));
		System.out.println("15 divided by 7 is: " + calculator.div(15,7));
		System.out.println("1 divided by 3 is: " + calculator.div(1,3));
		System.out.println("1 divided by 0 is: " + calculator.div(1,0));
		
		System.out.println("3 divided by 2 is: " + calculator.div("3","2"));
		System.out.println("2 divided by 2 is: " + calculator.div("2","2"));
	}
}


class Calculator {
	double result = 0;
	
	double div(int x, int y) {
		try {
			if(y != 0) {
				result =  (double) x / y;
			} else {
				result = x / y;
			}
		} catch (ArithmeticException e) {
            System.out.println("Dividing By Zero Is Not Possible");
        }
		return result;
	}
	
    public double div(String str1, String str2) {
		try {
			if(Double.parseDouble(str2) != 0) {
				result = Double.parseDouble(str1) / Double.parseDouble(str2);
			} else {
				result = Double.parseDouble(str1) / Double.parseDouble(str2);
			}
		} catch (ArithmeticException e) {
            System.out.println("Dividing By Zero Is Not Possible");
        }
		return result;
    }
}