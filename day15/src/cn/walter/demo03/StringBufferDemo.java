package cn.walter.demo03;
/*
 * 	StringBuilder和Stringbuffer差不多
 * 	区别，线程不安全，但速度快
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		function6();
	
	
	}
	/*
	 * StringBuffer类方法
	 * String tString()继承Object，重写toString()
	 * 将缓冲区中所用字符，变成字符串
	 */
	public static void function6(){
		StringBuffer buffer = new StringBuffer();
		//原来是缓冲区里面的数据
		buffer.append("dsds");
		buffer.append(123456);
		//采用toString方法把 “可变的缓冲区数据” 变成了“不可变的String对象”
		String s = buffer.toString();
		System.out.println(s);
	}
	/*
	 * StringBuffer类方法
	 * reverse()将缓冲区中的字符反转
	 */
	public static void function5(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefg");
		
		buffer.reverse();
		System.out.println(buffer);
	}
	/*
	 * StringBuffer类方法
	 * replace(int start,int end,String str)
	 * 将指定的索引范围的所有字符，替换成新的字符串
	 */
	public static void function4(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("sfsf");
		buffer.replace(1, 2, "www");
		System.out.println(buffer);
	}
	/*
	 * StringBuffer类方法
	 * insert(int index,任意类型)
	 * 将任意类型数据，插入到缓冲区的指定索引上
	 */
	public static void function3(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("dsdsd");
		buffer.insert(3, "er");
		System.out.println(buffer);
	}
	/*
	 * StringBuffer类方法
	 * delete(int start,int end)删除缓冲区中字符
	 * 开始索引包含，结尾索引不包含
	 */
	public static void function2(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("sdsdfd");
		System.out.println(buffer);
		buffer.delete(1, 4);
		System.out.println(buffer);
	}
	/*
	 * StringBuffer类方法
	 * 	StringBuffer append ，将任意类型的数据，添加到缓冲区
	 * 	append 返回值，写return this
	 *  调用者是谁，返回值就是谁
	 */
	public static void function(){
		StringBuffer buffer = new StringBuffer("scsc");
		//调用StringBuffer 的方法append向缓冲区追加内容
		buffer.append(6).append(false).append('a');
		System.out.println(buffer);
	}
}
