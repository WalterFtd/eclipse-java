package cn.walter.demo01;

import java.io.File;
import java.io.IOException;

/*
 * File类的创建和删除功能
 * 文件或者是目录
 */
public class FileDemo2 {
	public static void main(String[] args)throws IOException{
		function_2();
	}
	/*
	 * File类的删除功能
	 * boolean delete()
	 * 删除的文件或者是文件夹，在Fiel构造方法中给出
	 * 删除方法不走回收站，直接从硬盘删除
	 */
	private static void function_2() {
		File file = new File("G:\\aa\\a.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	/*
	 * File创建文件夹功能
	 * booean mkdir() 一层
	 * booean mkdirs() 多层
	 * 创建的路径也在File构造方法中给出
	 * 若文件夹已经存在了，不再创建
	 */
	private static void function_1() {
		File file = new File("G:\\aa\\dd");
		boolean b = file.mkdirs();
		System.out.println(b);
	}

	/*
	 * File创建文件的功能
	 * boolean createBewFile()
	 * 创建的文件路径和文件名，在File构造方法中给出
	 */
	public static void function()throws IOException{
		File file = new File("G:\\aa\\a.txt");
		boolean b = file.createNewFile(); //(未报告的异常 IO异常)
		System.out.println(b);
	}
}
