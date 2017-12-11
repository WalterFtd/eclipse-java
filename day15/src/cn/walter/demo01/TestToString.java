package cn.walter.demo01;

import java.util.Random;
import java.util.Scanner;

public class TestToString {
	public static void main(String[] args) {
		//调用Person类的方法toSting()
		//输出语句中，写的是一个对象，默认调用对象的toStirng方法
		Person p = new Person("张索尼",10);
		String s = p.toString();
		System.out.println(p);
		System.out.println(s);
		/*
		 * System.out.println(p);
		 * System.out.println(p.toString());
		 */
		//random是地址，没有重写，Scanner是内容，重写过了
		Random r = new Random();
		System.out.println(r);
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}
}
