package pkg.basic.loops;

public class MainLoops {
	public static void main(String[] args) {
		//WhileLoop
		new WhileLoop().WhileLoop();
		
		//ForLoop
		new ForLoop().ForLoop();
		
		//DoLoop
		new DoLoop().DoLoop();
		
		//ArrayLoops
		new ArrayLoops().ArrayLoops();
	}
}


class WhileLoop {
	double returnNum = 0;
	
	void WhileLoop() {
		while (returnNum <= 10) {
			returnNum = Math.floor(Math.random()*10 + 5);
			System.out.println(returnNum);
			returnNum++;
		}
	}
}


class ForLoop {
	void ForLoop() {
		for(int i = 0; i < 3; i++) {
			System.out.println("The " + i + " random number is " + Math.floor(Math.random()*100));
		}
	}
}


class DoLoop {
	int x = 1;
	void DoLoop() {
		do {
			System.out.println("log(" + x + ")=" + Math.log(x));
			x++;
		}while(x < 3);
	}
}


class ArrayLoops {
	int [] numbers = {10, 20, 30, 40, 50};
	String [] names = {"James", "Tom", "Jerry"};
	
	void ArrayLoops() {
		for(int x : numbers) {
			if(x == 30) {
				break;
			} else {
				System.out.print(x + " ");
			}
		}
		
		for(String y : names) {
			if(y == "Tom") {
				continue;
			} else {
				System.out.print(y + " ");
			}
		}
	}
}








