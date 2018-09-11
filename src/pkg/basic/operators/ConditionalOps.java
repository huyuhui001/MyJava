/*
 * 三元运算符
 * variable x = (expression) ? value if true : value if false
 */

package pkg.basic.operators;

public class ConditionalOps {
	int a = 10;
    int b;
    
    void getResult() {
        b = (a == 1) ? 20 : 30;   // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20 : 30;  // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        System.out.println( "Value of b is : " + b );
    }
}
