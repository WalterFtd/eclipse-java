package cn.walter.demo03;

import java.util.Calendar;

/*
 * 日历类 java.util.Calendar
 * 抽象类，使用他的子类对象
 * 
 * Calendar类写了静态方法 getInstance() 直接返回子类的对象
 * 不需要直接new 子类的对象，通过静态方法直接获取
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//通过父类的引用使用方法间接创建子类的对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}
}
