package cn.walter.demo03;
/*
 * java.lang.Math ��̬�������
 */
import java.util.*;
public class MathDemo {
	public static void main(String[] args) {
		function_4();
	}
	/*
	 * static double random() ����0.0-1.0֮��������
	 * ��ԴҲ��Random
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
	 * �����
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
	 * ���ش��ڻ��ߵ��ڲ���d����С����
	 * static double floor(double d)
	 * ����С�ڻ��ߵ��ڲ���d����С����
	 */
	public static void  function_2(){
		double i = Math.ceil(3.454566);
		double j = Math.floor(3.454566);
		System.out.println(i+"  "+j);
	}
	/*
	 * static int abs(int)
	 * ��ȡ�����ľ���ֵ
	 */
	public static void function(){
		//lang������ľ�̬��ѧ���㷽��ֱ��������������������
		int i = Math.abs(-9);
		System.out.println(i);
		
	}

}
