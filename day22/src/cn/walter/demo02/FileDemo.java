package cn.walter.demo02;

import java.io.File;

/*
 * File类的获取功能
 * list
 * listFiles
 */
public class FileDemo {
	public static void main(String[] args) {
		function_2();
	}
	
	
	private static void function_2() {
		//获取系统中的所有根目录
		File[] fileArr = File.listRoots();
		for(File f: fileArr){
			System.out.println(f);
		}
		
	}


	/*
	 * File类的获取功能
	 * File[] listFiles
	 * 获取到，File构造方法中封装的路径中的文件和文件名(遍历了一个目录)
	 * 返回目录或全路径
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
	 * File类的获取功能
	 * String[] list()
	 * 获取到，File构造方法中封装的路径中的文件和文件名(遍历了一个目录)
	 * 返回只有名字
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
