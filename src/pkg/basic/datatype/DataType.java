package pkg.basic.datatype;

public class DataType {
    public static void main(String[] args) {
    	// byte
    	System.out.println("包装类：java.lang.Byte");
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("包装类：java.lang.Short");
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long 
        System.out.println("包装类：java.lang.Long");
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  

        // float
        System.out.println("包装类：java.lang.Float");
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("包装类：java.lang.Double");
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();  

        // char
        System.out.println("包装类：java.lang.Character");
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE); //以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE); //以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台 
        
        // Boolean
        System.out.println("包装类：java.lang.Boolean");  
        System.out.println("Boolean.FALSE=" + Boolean.FALSE);  
        System.out.println("Boolean.TRUE=" + Boolean.TRUE);
        System.out.println("Boolean.TYPE=" + Boolean.TYPE);
        System.out.println(); 
        
        // Constant Value
        final double PI = 3.1415926; //常量
        int decimal = 100;           //十进制
        int octal = 0144;            //前缀0表示八进制常量
        int hexadecimal = 0x64;      //前缀0x表示十六进制常量
        System.out.println(PI + "/" + decimal + "/" + octal + "/" + hexadecimal);
        
        // Escape character 转义符
        System.out.println("\"this is double quotes\"");   //输出双引号
        System.out.println("Line 1 \n and line 2");        //输出换行
        System.out.println("It's line and it\'s line");    //输出单引号
        System.out.println("slash / and backslash \\");    //输出斜杠和反斜杠
        
        // Cast 强制类型转换
        char c1 = 'a';
        int i1 = c1;
        int i2 = c1 + 1;
        System.out.println("char 'a' 自动类型转换为int后的值等于" + i1);
        System.out.println("char 'a' 自动类型转换为int计算后的值等于" + i2);
        System.out.println("23.7强制转换成为int后的值是：" + (int)23.7);    //浮点数到整数的转换是通过舍弃小数得到，不是四舍五入
        System.out.println("-23.7强制转换成为int后的值是：" + (int)-23.7);
        System.out.println("23.7强制转换成为byte后的值是：" + (byte)23.7);
    }
}