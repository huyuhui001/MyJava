/*
 * 时间日期标识符：  
 * yyyy：年  
 * MM：月
 * dd：日
 * hh：1~12小时制(1-12)
 * 
 * HH：24小时制(0-23)  
 * mm：分  
 * ss：秒 
 * S：毫秒
 * E：星期几
 * D：一年中的第几天
 * F：一月中的第几个星期(会把这个月总共过的天数除以7)  
 * w：一年中的第几个星期
 * W：一月中的第几星期(会根据实际情况来算)  
 * a：上下午标识  
 * k：和HH差不多，表示一天24小时制(1-24)  
 * K：和hh类似，表示一天12小时制(0-11)
 * z：表示时区 
 */

package pkg.basic.datetime;

import java.util.*;
import java.text.*;

public class MainDateTime {
	public static void main(String[] args) {
		SimpleDateFormatParsePosition mySimpleDateFormatParsePosition = new SimpleDateFormatParsePosition();
		mySimpleDateFormatParsePosition.GetCurrentDate();
		mySimpleDateFormatParsePosition.GetCurrentTime();
		mySimpleDateFormatParsePosition.GetDateString();
		mySimpleDateFormatParsePosition.getParsePosDate();
	}
}


class SimpleDateFormatParsePosition {
	//系统时间
	long currentTime = System.currentTimeMillis();
	Date currentDate = new Date(currentTime);
	
	//格式化系统时间
	SimpleDateFormat myFormatter1 = new SimpleDateFormat();
	SimpleDateFormat myFormatter2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat myFormatter3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S E D F w W a k K z");

	String dateString1 = myFormatter1.format(currentDate);
	String dateString2 = myFormatter2.format(currentDate);
	String dateString3 = myFormatter3.format(currentDate);
	
	void GetDateString() {
		System.out.println(dateString1);
		System.out.println(dateString2);
		System.out.println(dateString3);
	}
	
	void GetCurrentDate() {
		System.out.println(currentDate);					
	}
	
	void GetCurrentTime() {
		System.out.println(currentTime);		//输出与System.out.println(currentDate.getTime())一样
	}
	
	void getParsePosDate() {
		ParsePosition myPos = new ParsePosition(0);
		Date dateStringParse = myFormatter3.parse(dateString3, myPos);
		System.out.println(dateStringParse);
	}
	
}








