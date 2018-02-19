package cn.walter.demo01;

import java.io.File;

/*
 * File类的获取功能
 */
public class FileDemo3 {
	public static void main(String[] args) {
		function_4();
	}
	
	/*
	 * File类获取功能
	 * String getParent() 返回String对象
	 * File getParentFile() 返回File对象
	 */
	private static void function_4() {
		File file = new File("G:\\aa\\ss.txt");
		File parent = file.getParentFile().getParentFile();
		System.out.println(parent);
		
	}
	
	/*
	 * File类获取功能
	 * String getAbsolutePath()  返回String对象
	 * File getAbsoluteFile()  返回File对象
	 * 获取绝对路径
	 * eclipse环境中，写的是一个相对路径，绝对位置是工程根目录
	 */
	private static void function_3() {
		File file = new File("G:\\aa\\ss.txt");
		File absolute = file.getAbsoluteFile();
		System.out.println(absolute);
	}
	/*
	 * File类获取功能
	 * long length()
	 * 返回路径中表示的文件的字节数
	 */
	private static void function_2() {
		File file = new File("G:\\aa\\ss.txt");
		long length= file.length();
		System.out.println(length);
	}

	/*
	 * File类的获取功能
	 * String getName()
	 * 返回路径中表示的文件或者文件夹名
	 * 获取路径中最后部分的名字
	 */
	public static void function(){
		File file = new File("G:\\aa\\ss.txt");
		String name = file.getName();
		System.out.println(name);
		
		String path = file.getPath();
		System.out.println(path);
	}
}
