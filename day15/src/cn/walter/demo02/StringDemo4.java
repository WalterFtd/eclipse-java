package cn.walter.demo02;
/*
 * String类的查找功能
 */
public class StringDemo4 {
	public static void main(String[] args) {
		//function();
		//function2();
		//function3();
		//function4();
		function5();
	}
	/*
	 * equals(Object obj)
	 * 方法传递字符串，判断字符串中字符是否完全相同
	 * equalsIgnoreCase(Object obj)
	 * 方法传递字符串，判断字符串中字符是否完全相同，忽略大小写
	 */
	public static void function5() {
		String str1 = "ABC";
		String str2 = "abc";
		//分别调用equals()和equalsIgnoreCase()
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

	/*
	 * byte[] getBytes() 将字符串转成字节数组
	 * 此功能和String构造方法相反
	 * bytes数组相关的功能，查询编码表
	 * 
	 * char[] toCharArray()将字符串转成字符数组
	 * 此功能和String构造方法相反
	 */
	public static void function4() {
		String str = "abc";
		//调用String方法getBytes 字符串转成字节数组
		byte[] bytes = str.getBytes();
		for(int i = 0;i < bytes.length; i++){
			System.out.println(bytes[i]);
		}
		//调用String方法toCharArray 字符串转成字符数组
		char[] ch = str.toCharArray();
		for(int i = 0;i < ch.length; i++){
			System.out.println(ch[i]);
		}
		
	}

	/*
	 * 字符串对象.startsWith(prefix)
	 * 判断一个字符串是不是另一个字符串的前缀
	 * 
	 * 字符串对象.endsWith(suffix)
	 * 判断一个字符串是不是另一个字符串的后缀
	 * 
	 * 字符串对象.contains(String s)
	 * 判断一个字符串是不是包含另一个字符串
	 * 
	 * 字符串对象.str.indexOf(char ch)
	 * 查找一个字符，在字符串中第一次出现的索引，不存在返回-1
	 * 
	 */
	public static void function3() {
		String str = "howareyou";
		//调用String类的方法startsWith
		System.out.println(str.startsWith("how"));
		System.out.println(str.endsWith("you"));
		System.out.println(str.contains("are"));
		System.out.println(str.indexOf('w'));
	}
	/*
	 * 字符串对象.substring(beginIndex, endIndex) 获取字符串一部分
	 * 返回新的字符串
	 * 包头不包尾
	 * 
	 * 字符串对象.substring(beginIndex)获取字符串一部分
	 * 包头，后面全要
	 */
	public static void function2(){
		String str = "hellobaby";
		//调用String类的方法substring获取字符串的一部分
		System.out.println(str.substring(0,5));
		System.out.println(str.substring(5));
		
	}
	/*
	 *  字符串对象.length() 返回字符串的长度
	 *  包含多少个字符
	 */
	public static void function() {
		String str = "mvdvmx vmxnvnxm";
		//调用String类方法length，获取字符串长度
		int length = str.length();
		System.out.println(length);
	}
}
