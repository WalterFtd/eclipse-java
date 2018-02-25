package cn.walter.demo04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Commons_IODemo1 {
	public static void main(String[] args)throws IOException {
		function_3();
	}
	/*
	 * FileUtils�����෽��
	 * static void copyDirectoryToDirectory(File src,File desc)
	 * �����ļ���
	 */
	public static void function_3() throws IOException{
		FileUtils.copyDirectoryToDirectory(new File("G:\\aa"), new File("G:\\as"));
	}
	
	/*
	 * FileUtils������ķ���
	 * static void copyFile(File src,File desc)
	 * �����ļ�
	 */
	public static void function_2() throws IOException{
		FileUtils.copyFile(new File("G:\\aa\\w.txt"),new File("G:\\aa\\e.txt"));
	}
	
	/*
	 * FileUtils������ķ���
	 * static void writeStringToFile(File src,String date)
	 * ���ַ���ֱ��д���ļ���
	 */
	public static void function_1() throws IOException{
		FileUtils.writeStringToFile(new File("G:\\aa\\w.txt"),"chjvjhvjhvj");
	}
	
	/*
	 * FileUtils������ķ���
	 * static String readFileToString(File src)��ȡ�ı�,�����ַ���
	 */
	 public static void function() throws IOException{
		 String s = FileUtils.readFileToString(new File("G:\\aa\\w.txt"));
		 System.out.println(s);
	 }
}

