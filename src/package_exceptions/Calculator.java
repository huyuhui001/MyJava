package package_exceptions;

public class Calculator {
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
