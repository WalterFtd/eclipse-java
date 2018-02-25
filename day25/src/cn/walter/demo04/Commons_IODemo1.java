package cn.walter.demo04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Commons_IODemo1 {
	public static void main(String[] args)throws IOException {
		function_3();
	}
	/*
	 * FileUtils工具类方法
	 * static void copyDirectoryToDirectory(File src,File desc)
	 * 复制文件夹
	 */
	public static void function_3() throws IOException{
		FileUtils.copyDirectoryToDirectory(new File("G:\\aa"), new File("G:\\as"));
	}
	
	/*
	 * FileUtils工具类的方法
	 * static void copyFile(File src,File desc)
	 * 复制文件
	 */
	public static void function_2() throws IOException{
		FileUtils.copyFile(new File("G:\\aa\\w.txt"),new File("G:\\aa\\e.txt"));
	}
	
	/*
	 * FileUtils工具类的方法
	 * static void writeStringToFile(File src,String date)
	 * 将字符串直接写到文件中
	 */
	public static void function_1() throws IOException{
		FileUtils.writeStringToFile(new File("G:\\aa\\w.txt"),"chjvjhvjhvj");
	}
	
	/*
	 * FileUtils工具类的方法
	 * static String readFileToString(File src)读取文本,返回字符串
	 */
	 public static void function() throws IOException{
		 String s = FileUtils.readFileToString(new File("G:\\aa\\w.txt"));
		 System.out.println(s);
	 }
}

