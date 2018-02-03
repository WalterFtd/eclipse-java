package cn.walter.demo03;
/*
 * java.lang.Math 静态方法组成
 */
import java.util.*;
public class MathDemo {
	public static void main(String[] args) {
		function_4();
	}
	/*
	 * static double random() 返回0.0-1.0之间的随机数
	 * 来源也是Random
	 */
	public static void function_4(){
		double d = Math.random();
		System.out.println(d);
		System.out.println("==============");
		Random r = new Random();
		int o = r.nextInt(70);
		System.out.println(o);
	}
	/*
	 * static double pow(double a, double b)
	 * 算次幂
	 * static double sqrt(double d)
	 */
	public static void function_3(){
		double i = Math.pow(3, 2);
		System.out.println(i);
		double j = Math.sqrt(-9.8);
		System.out.println(j);
	}
	
	/*
	 * static double ceil(double d)
	 * 返回大于或者等于参数d的最小整数
	 * static double floor(double d)
	 * 返回小于或者等于参数d的最小整数
	 */
	public static void  function_2(){
		double i = Math.ceil(3.454566);
		double j = Math.floor(3.454566);
		System.out.println(i+"  "+j);
	}
	/*
	 * static int abs(int)
	 * 获取参数的绝对值
	 */
	public static void function(){
		//lang包里面的静态数学计算方法直接用类名。方法名调用
		int i = Math.abs(-9);
		System.out.println(i);
		
	}

}
