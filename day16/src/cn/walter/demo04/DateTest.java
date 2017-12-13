package cn.walter.demo04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 日期练习
 */
public class DateTest {
	public static void main(String[] args) throws Exception {
		function2();
	}
	/*
	 * 闰年计算
	 * 2088  2090
	 * 高级的算法：日历设置到指定年份的3月1日，add向前偏移一天，获取天数，29闰年
	 */
	public static void function2(){
		Calendar c = Calendar.getInstance();
		//将日历，设置到指定年的3月1日
		c.set(2088, 2, 1);
		//日历add方法，向前偏移1天
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
	/*
	 * 计算活了多少天
	 * 生日 今天的日期
	 * 两个日期变成毫秒值，减法
	 */
	public static void function() throws Exception{
		System.out.println("请输入出生日期 格式 YYYY-MM-dd");
		//获取出生日期，键盘输入(匿名对象)
		String birthdayString = new Scanner(System.in).next();
		//将字符串日期，转成Date对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//调用方法parse，字符串转成日期对象
		Date birthdayDate = sdf.parse(birthdayString);
		
		//获取今天的日期对象
		Date todayDate = new Date();
		
		//将两个日期转成毫秒值，Date类的方法getTime
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long msec = todaySecond-birthdaySecond;
		if(msec<0){
			System.out.println("还没出生");
		}else{
		System.out.println(msec/1000/60/60/24/365);
		}
	}
}
