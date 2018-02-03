package cn.walter.demo01;
/*
 * Integer类，封装基本数据类型int，提高大量方法
 * 将字符串转成基本数据类型int
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function2();
	}
	/*
	 * Integer类构造方法
	 * Integer(String s)
	 * 将数字格式的字符串，传递到Integer类的构造方法中
	 * 创建Ineger对象，包装的是一个字符串
	 * 将构造方法中的字符串，转成基本数据类型，调用方法，非静态的，intValue()
	 */
	public static void function3(){
		//把100通过构造器的方式封装起来，再用方法非静态的intValue()把100变成基本类型int
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(i--);
	}
	/*
	 * 如何将基本类型int，变成字符串
	 * 
	 * int =>String 任何类型+"" 变成String类型
	 * Integer类中的静态方法toString()
	 * toString(int int radix),将int整数，转成指定进制
	 */
	public static void function2() {
		int i = 3;
		String s = i+"";
		System.out.println(s+1);
		 String s1 = Integer.toString(34);
		 System.out.println(s1+1);
	}

	/*
	 * Integer类静态方法parseInt(String s,int radix)
	 * radix 基数
	 */
	public static void function1(){
		int i = Integer.parseInt("111",2);
		System.out.println(i);
	}
	
	/*
	 * Integer类中静态方法parseInt(String s) 返回基本类型
	 * 要求;字符串必须是字符格式的
	 */
	public static void function(){
		//直接使用lang包里面的Integer包装类的方法
		int i = Integer.parseInt("23");
		System.out.println(i/2);
	}
}
