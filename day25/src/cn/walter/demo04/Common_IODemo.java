package cn.walter.demo04;

import org.apache.commons.io.FilenameUtils;

public class Common_IODemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * FilenameUtils类的方法
	 * static boolean isExtension(String filename,String extension)
	 * 判断文件名的后缀是不是extension
	 */
	public static void function_2(){
		boolean b = FilenameUtils.isExtension("w.txt", "txt");
		System.out.println(b);
	}
	
	/*
	 * FilenameUtils类的方法
	 * static String getName(String filename)
	 * 获取文件名
	 */
	public static void function_1(){
		String name = FilenameUtils.getName("G:\\aa\\w.txt");
		System.out.println(name);
	}
	
	/*
	 * FilenameUtils类的方法
	 * static String getExtension(String filename)
	 * 获取文件名的扩展名
	 */
	 public static void function(){
		 String name = FilenameUtils.getExtension("G:\\aa\\w.txt");
		 System.out.println(name);
	 }

}
