package package_helloworld;

public class OutputArray {
	String[] cases = new String[5];
	
	void getArray1() {
		int i = 0;
		for (i=0; i<5; i++) {
			System.out.println("case[" + i + "]: " + cases[i]);
		}
}

	void getArray2() {
		int i = 0;
		while (i < 5) {
			System.out.println("case[" + i + "]: " + cases[i]);
			i++;
		}
	}
	
	void getArray3() {
		int i = 0;
		do {
			System.out.println("case[" + i + "]: " + cases[i]);
			i++;
		} while(i < 5);
	}
}
