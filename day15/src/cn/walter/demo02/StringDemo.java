package cn.walter.demo02;
/*
 * String类特点：
 * 	一切都是对象，字符串事物"" 也是对象
 * 	类是描述事物，String类，描述字符串对象的类
 * 	所有的"" 都是String类的对象
 * 	字符串是一个常量，一旦创建，不能改变
 * 
 * 常量池的概念：
 * 	存储的是字符类型的字母，在堆中
 */
public class StringDemo {
	public static void main(String[] args) {
		//引用变量str执行内存变化
		//定义好的字符串对象，不变
		String str = "Education";
		//在String类中重写了toString方法，所以输出的不是对象的地址
		System.out.println(str);
		str = "bjbdvdv";
		System.out.println(str);
	}
}
