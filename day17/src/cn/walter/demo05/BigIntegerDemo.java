package cn.walter.demo05;
/*
 * 超级大的整数运算
 * 超过long取值范围的整数，封装成BigInteger类型的对象
 */
import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * BigInteger对象的四则运算
	 * 调用方法计算，计算1结果也只能是BigInteger对象
	 */
	
	/*
	 * BigInteger类的构造方法
	 * 传递字符串，要求数字格式，没有长度限制
	 * 
	 */
	private static void function() {
		BigInteger b = new BigInteger("12334355454355465654654645");
		BigInteger a = new BigInteger("12334355454355465654654645");
		//计算和b1+b2  调用方法Add
		BigInteger c = b.add(a);
		//计算差b1-b2  调用方法subtract
		BigInteger d = b.subtract(a);
		//计算乘积 multiply
		BigInteger e = b.multiply(a);
		//计算商
		BigInteger f = b.divide(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
	
	
}
