package cn.walter.demo02;

import java.io.File;

/*
 * File��Ļ�ȡ����
 * list
 * listFiles
 */
public class FileDemo {
	public static void main(String[] args) {
		function_2();
	}
	
	
	private static void function_2() {
		//��ȡϵͳ�е����и�Ŀ¼
		File[] fileArr = File.listRoots();
		for(File f: fileArr){
			System.out.println(f);
		}
		
	}


	/*
	 * File��Ļ�ȡ����
	 * File[] listFiles
	 * ��ȡ����File���췽���з�װ��·���е��ļ����ļ���(������һ��Ŀ¼)
	 * ����Ŀ¼��ȫ·��
	 */
	public static void function_1(){
		File file = new File("G:\\aa");
		File[] fileArr = file.listFiles();
		System.out.println(fileArr.length);
		for(File f :fileArr){
			System.out.println(f);
		}
	}
	/*
	 * File��Ļ�ȡ����
	 * String[] list()
	 * ��ȡ����File���췽���з�װ��·���е��ļ����ļ���(������һ��Ŀ¼)
	 * ����ֻ������
	 */
	public static void function(){
		File file = new File("G:\\aa");
		String[] strArr = file.list();
		System.out.println(strArr.length);
		for(String str :strArr){
			System.out.println(str);
		}
	}
}
