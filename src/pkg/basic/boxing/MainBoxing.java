package pkg.basic.boxing;

public class MainBoxing {
	public static void main(String[] args) {
		Integer i1 = 128;   //装箱, 相当于 Integer.valueOf(128);
        int t = i1;         //拆箱, 相当于 i1.intValue()
        System.out.println(t);
		
        //当两个变量的值位于 -128 ~ 127 之间时，两个变量使用同一地址
        Integer a = 123;
        Integer b = 123;
        System.out.println(a == b);           // == 比较的是对象的地址，输出 true
        System.out.println(a.equals(b));      // equals比较的是对象的内容， 输出 true
        
        //当两个 Integer 变量的数值超出 -128 ~ 127 范围时, 变量使用不同地址
        a = 1230;
        b = 1230;
        System.out.println(a == b);           // == 比较的是对象的地址，输出 false
        System.out.println(a.equals(b));      // equals比较的是对象的内容，输出 true
	}
}
