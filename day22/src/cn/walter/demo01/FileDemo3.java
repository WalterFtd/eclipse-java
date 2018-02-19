package cn.walter.demo01;

import java.io.File;

/*
 * File��Ļ�ȡ����
 */
public class FileDemo3 {
	public static void main(String[] args) {
		function_4();
	}
	
	/*
	 * File���ȡ����
	 * String getParent() ����String����
	 * File getParentFile() ����File����
	 */
	private static void function_4() {
		File file = new File("G:\\aa\\ss.txt");
		File parent = file.getParentFile().getParentFile();
		System.out.println(parent);
		
	}
	
	/*
	 * File���ȡ����
	 * String getAbsolutePath()  ����String����
	 * File getAbsoluteFile()  ����File����
	 * ��ȡ����·��
	 * eclipse�����У�д����һ�����·��������λ���ǹ��̸�Ŀ¼
	 */
	private static void function_3() {
		File file = new File("G:\\aa\\ss.txt");
		File absolute = file.getAbsoluteFile();
		System.out.println(absolute);
	}
	/*
	 * File���ȡ����
	 * long length()
	 * ����·���б�ʾ���ļ����ֽ���
	 */
	private static void function_2() {
		File file = new File("G:\\aa\\ss.txt");
		long length= file.length();
		System.out.println(length);
	}

	/*
	 * File��Ļ�ȡ����
	 * String getName()
	 * ����·���б�ʾ���ļ������ļ�����
	 * ��ȡ·������󲿷ֵ�����
	 */
	public static void function(){
		File file = new File("G:\\aa\\ss.txt");
		String name = file.getName();
		System.out.println(name);
		
		String path = file.getPath();
		System.out.println(path);
	}
}
