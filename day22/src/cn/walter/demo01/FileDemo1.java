package cn.walter.demo01;

import java.io.File;

/*
 * File��Ĺ��췽��
 * ����������ʽ
 */
public class FileDemo1 {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * File(File parent, String child) ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
	 * ����·��������File���͸�·�����ַ�����·��
	 */
	
	private static void function_2() {
		File parent = new File("G:");
		File file = new File(parent,"aa");
		System.out.println(file);
		
	}

	/*
	 * File(String parent, String child) ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
	 * ����·���������ַ�����·�����ַ�����·��
	 */
	public static void function_1(){
		File file = new File("G��","aa");
		System.out.println(file);
	}
	/*
	 * File(String pathname) ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
	 * ����·����     ������д���ļ��У�����д��һ���ļ�
	 * c:\\abc   c:\\abc\\Demo.java
	 * ��·����װ��File���ͱ���
	 */
	public static void function(){
		//window�µĴ�Сд�����֣�Linux���֣�������ֻ�ǰ�·�����file�����������ܣ�
		File file  = new File("G:\\aa");
		System.out.println(file);
	}
}
