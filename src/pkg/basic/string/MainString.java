/* 标准的格式 %[argument_index$][flags][width][.precision]conversion
*    argument_index是一个十进制整数，表示参数在参数列表中的位置。 第一个参数为“1”等
*    flags是修改输出格式的一组字符
*    width是一个正十进制整数，表示要写入输出的最小字符数
*    precision通常用于限制字符数的非负十进制整数
* 日期和时间的格式  %[argument_index$][flags][width]conversion
*    转换表达式是两个字符。 第一个字符是’t’或’T’。 第二个字符表示要使用的格式，如示例中的meY等
*/

package pkg.basic.string;

//import java.util.Calendar;
import java.sql.Date;

public class MainString {
	public static void main(String[] args) {
		//String concat
		String str1 = "website name is ";
		String str2 = "www.google.com";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1 + str2);
		
		
		//StringBuffer
		StringBuffer sBuffer = new StringBuffer("The ");
		sBuffer.append(str1);
		sBuffer.append(str2);
		System.out.println(sBuffer);
		System.out.println(sBuffer.reverse());
		System.out.println(sBuffer.delete(0, 3));
		
		
		//Format string for date type
		// %t表示格式化日期时间类型，%T是时间日期的大写形式，在%t之后用特定的字母表示不同的输出格式
		Date date = new Date(0);
		long dataL = date.getTime();
		// 格式化年月日
		// %t之后用y表示输出日期的年份（2位数的年，如99）
		// %t之后用m表示输出日期的月份，%t之后用d表示输出日期的日号
		System.out.printf("%1$ty-%1$tm-%1$td ; %2$ty-%2$tm-%2$td%n", date, dataL);
		
		// %t之后用Y表示输出日期的年份（4位数的年），
		// %t之后用B表示输出日期的月份的完整名， %t之后用b表示输出日期的月份的简称
		System.out.printf("%1$tY-%1$tB-%1$td ; %2$tY-%2$tb-%2$td%n", date, dataL);

		// 以下是常见的日期组合
		// %t之后用D表示以 "%tm/%td/%ty"格式化日期
		System.out.printf("%1$tD%n", date);
		// %t之后用F表示以"%tY-%tm-%td"格式化日期
		System.out.printf("%1$tF%n", date);

		/*** 输出时间类型***/
		// 输出时分秒
		// %t之后用H表示输出时间的时（24进制），%t之后用I表示输出时间的时（12进制），
		// %t之后用M表示输出时间的分，%t之后用S表示输出时间的秒
		System.out.printf("%1$tH:%1$tM:%1$tS; %2$tI:%2$tM:%2$tS%n", date, dataL);
		// %t之后用L表示输出时间的秒中的毫秒
		System.out.printf("%1$tH:%1$tM:%1$tS %1$tL%n", date);
		// %t之后p表示输出时间的上午或下午信息
		System.out.printf("%1$tH:%1$tM:%1$tS %1$tL %1$tp%n", date);
		// 以下是常见的时间组合
		// %t之后用R表示以"%tH:%tM"格式化时间
		System.out.printf("%1$tR%n", date);
		// %t之后用T表示以"%tH:%tM:%tS"格式化时间
		System.out.printf("%1$tT%n", date);
		// %t之后用r表示以"%tI:%tM:%tS %Tp"格式化时间
		System.out.printf("%1$tr%n", date);

		/*** 输出星期***/
		// %t之后用A表示得到星期几的全称
		System.out.printf("%1$tF %1$tA%n", date);
		// %t之后用a表示得到星期几的简称
		System.out.printf("%1$tF %1$ta%n", date);

		// 输出时间日期的完整信息
		System.out.printf("%1$tc%n", date);
		
		// Format string for numeric
		double d = 345.678;         
		String s = "你好！";     
		int i = 1234;                    //'%'表示进行格式化输出，'%'之后的内容为格式的定义。       
		System.out.printf("%f", d);      //'f'表示格式化输出浮点数。       
		System.out.println();
		System.out.printf("%9.2f",d); //'9.2'中的9表示输出的长度，2表示小数点后的位数。       
		System.out.println();         
		System.out.printf("%+9.2f",d); //'+'表示输出的数带正负号。       
		System.out.println();         
		System.out.printf("%-9.4f",d); //'-'表示输出的数左对齐（默认为右对齐）。       
		System.out.println();         
		System.out.printf("%+-9.3f",d); //'+-'表示输出的数带正负号且左对齐。   
		System.out.println();         
		System.out.printf("%d",i); //'d'表示输出十进制整数。       
		System.out.println();         
		System.out.printf("%o",i); //'o'表示输出八进制整数。       
		System.out.println();         
		System.out.printf("%x",i); //'d'表示输出十六进制整数。       
		System.out.println();         
		System.out.printf("%#x",i); //'d'表示输出带有十六进制标志的整数。      
		System.out.println();         
		System.out.printf("%s",s); //'d'表示输出字符串。       
		System.out.println();         
		System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s",d,i,s);        //可以输出多个变量，注意顺序。       
		System.out.println();         
		System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x",i,s);      //'X$'表示第几个变量。       } 浮点数。          
		System.out.println();           
		System.out.printf("%9.2f",d);//'9.2'中的9表示输出的长度，2表示小数点后的位数。         
		System.out.println();           
		System.out.printf("%+9.2f",d); //'+'表示输出的数带正负号。         
		System.out.println();           
		System.out.printf("%-9.4f",d);//'-'表示输出的数左对齐（默认为右对齐）。
		System.out.println();           
		System.out.printf("%+-9.3f",d); //'+-'表示输出的数带正负号且左对齐。   
		System.out.println();  
		System.out.printf("%d",i); //'d'表示输出十进制整数。         
		System.out.println();           
		System.out.printf("%o",i); //'o'表示输出八进制整数。         
		System.out.println();           
		System.out.printf("%x",i); //'d'表示输出十六进制整数。         
		System.out.println();           
		System.out.printf("%#x",i); //'d'表示输出带有十六进制标志的整数。
		System.out.println();
		System.out.printf("%s",s); //'d'表示输出字符串。
		System.out.println();
		System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s",d,i,s);          //可以输出多个变量，注意顺序。         
		System.out.println();           
		System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x",i,s);          //'X$'表示第几个变量。           

		//定义一些变量，用来格式化输出。         
		double n1 = 345.678;          
		String s1 = "你好！";          
		int i1 = 1234;           //"%"表示进行格式化输出，"%"之后的内容为格式的定义。         
		System.out.printf("%f",n1);//"f"表示格式化输出浮点数。         
		System.out.println();           
		System.out.printf("%9.2f",n1);//"9.2" 中的9表示输出的长度，2表示小数点后的位数。         System.out.println();           
		System.out.printf("%+9.2f",n1);//"+" 表示输出的数带正负号。         
		System.out.println();           
		System.out.printf("%-9.4f",n1);//"-" 表示输出的数左对齐（默认为右对齐）。         
		System.out.println();           
		System.out.printf("%+-9.3f",n1);//"+-" 表示输出的数带正负号且左对齐。 
		System.out.println();           
		System.out.printf("%d",i1);//"d"表示输出十进制整数。         
		System.out.println();           
		System.out.printf("%o",i1);//"o"表示输出八进制整数。         
		System.out.println();           
		System.out.printf("%x",i1);//"d"表示输出十六进制整数。         
		System.out.println();           
		System.out.printf("%#x",i1);//"d" 表示输出带有十六进制标志的整数。   
		System.out.println();  
		System.out.printf("%s",s1);//"d"表示输出字符串。         
		System.out.println();           
		System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s",n1,i1,s1);          //可以输出多个变量，注意顺序。         
		System.out.println();           
		System.out.printf("字符串：%2$s，%1$d的十六进制数：%1$#x",i1,s1);          //"X$"表示第几个变量。
		
	}
}

