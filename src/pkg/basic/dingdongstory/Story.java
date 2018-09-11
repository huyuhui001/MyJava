/*
 * Write a program that counts up with a for loop from 1 to 50 (including 50).

  - In case the number is divisible by both 3 and 7, ding-dong should be output in a separate line on the screen. 
  - If the respective number is only divisible by 3, ding should be output.
  - If the respective number is only divisible by 7, dong should be output.
  - In all other cases, output ping . 

Note: Checking the divisibility of a number can be done with the modulo operator.

The first 10 lines should look like this: 
ping 
ping 
ding 
ping 
ping 
ding 
dong 
ping 
ding 
ping 

Line 21 looks should like this: 
ding-dong
 */

package pkg.basic.dingdongstory;

public class Story {
	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++) {
			if((i % 3 == 0) && (i % 7 == 0)) {
				dingdong();
			} else if(i % 3 == 0) {
				ding();
			} else if(i % 7 == 0) {
				dong();
			} else {
				ping();
			}
		}
	}
	
	static void dingdong() {
		System.out.println("ding-dong");
	}
	
	static void ding() {
		System.out.println("ding");
	}
	
	static void dong() {
		System.out.println("dong");
	}
	
	static void ping() {
		System.out.println("ping");
	}
}
