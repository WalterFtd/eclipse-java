package cn.walter.demo02;
/*
 * String类构造方法
 * String类的构造方法，重载形式（通过构造方法）
 */
public class StringDemo3 {
	public static void main(String[] args) {
		//function();
		function2();
	}
	/*
	 * String(char[] value) 传递字符数组
	 * 将字符数组，转成字符串，字符数组的参数，不查询编码表
	 * String(byte[] bytes,int offset, int count) 传递字符数组
	 * 将字符串的一部分转成字符串
	 * offset 数组开始索引
	 * count  个数
	 */
	public static void function2() {
		char[] ch = {'a','b','c','d','e'};
		//调用String构造方法，传递字符数组
		String s = new String(ch);
		System.out.println(s+" f21");
		
		String s1 = new String(ch, 1, 2);
		System.out.println(s1);
	}
	
	/*
	 * 定义方法，String类的构造方法
	 * String(byte[] bytes) 传递字节数组
	 * 通过使用平台的默认字符集解码指定的byte 数组，构造一个新的String
	 * 平台 ：机器操作系统
	 * 默认字符集：操作系统中的默认编码表，默认编码表GBK
	 * 将字节数组中的每个字节，查询编码表，得到的结果
	 * 字节是负数，汉子的字节编码就是负数，一个汉子采用2个字节表示
	 * 
	 * String(byte[] bytes,int offset, int length) 传递字节数组
	 * 字节数组的一部分转成字符串
	 * offset 数组的起始的索引
	 * length 个数，转几个，不是结束的索引
	 */
	public static void function() {
		byte[] bytes = {97,98,99,100};
		//调用String类的构造方法，传递字节数组
		String s = new String(bytes);
		System.out.println(s);
		//调用String构造方法，传递数组，传递两个int值
		String s1 = new String(bytes, 1, 1);
		System.out.println(s1);
	}
}
