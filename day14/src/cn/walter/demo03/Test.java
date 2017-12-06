package cn.walter.demo03;

import java.util.Calendar;

public class Test {
	//直接调用抽象类的静态方法getInstance获取抽象类的子类的对象
	//抽象类的静态方法，返回了自己的子类对象
	//对于调用者来说，不需要关注子类是谁
	public static void main(String[] args) {
		Animal a = Animal.getInstance();
		a.eat();
		//日历类
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}
}
