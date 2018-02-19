package cn.walter.demo01;

import java.io.File;

/*
 * File类的构造方法
 * 三种重载形式
 */
public class FileDemo1 {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
	 * 传递路径，传递File类型父路径，字符串子路径
	 */
	
	private static void function_2() {
		File parent = new File("G:");
		File file = new File(parent,"aa");
		System.out.println(file);
		
	}

	/*
	 * File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
	 * 传递路径，传递字符串父路径，字符串子路径
	 */
	public static void function_1(){
		File file = new File("G：","aa");
		System.out.println(file);
	}
	/*
	 * File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
	 * 传递路径名     ：可以写到文件夹，可以写到一个文件
	 * c:\\abc   c:\\abc\\Demo.java
	 * 将路径封装成File类型变量
	 */
	public static void function(){
		//window下的大小写不区分，Linux区分（构造器只是把路径变成file对象，其他不管）
		File file  = new File("G:\\aa");
		System.out.println(file);
	}
}
