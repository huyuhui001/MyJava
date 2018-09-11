/*
＆	如果相对应位都是1，则结果为1，否则为0
|	如果相对应位都是0，则结果为0，否则为1
^	如果相对应位值相同，则结果为0，否则为1
〜	按位取反运算符翻转操作数的每一位，即0变成1，1变成0。
<< 	按位左移运算符。左操作数按位左移右操作数指定的位数。
>> 	按位右移运算符。左操作数按位右移右操作数指定的位数。
>>> 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。
 */

package pkg.basic.operators;

public class BitOps {
	int x = 60;                                 // 60 = 0011 1100
	int y = 13;                                 // 13 = 0000 1101
	int z = 1;
	
	void getResult() {
		z = x & y;                              // 12 = 0000 1100
		System.out.println("x & y = " + z );

		z = x | y;                              // 61 = 0011 1101
		System.out.println("x | y = " + z );

		z = x ^ y;                              // 49 = 0011 0001
		System.out.println("x ^ y = " + z );

		z = ~x;                                 // 61 = 1100 0011
		System.out.println("~x = " + z );

		z = x << 2;                             //240 = 1111 0000
		System.out.println("x << 2 = " + z );

		z = x >> 2;                             // 15 = 0000 1111
		System.out.println("x >> 2  = " + z );
		 
		z = x >>> 2;                            // 15 = 0000 1111
		System.out.println("x >>> 2 = " + z );
	}
	
}
