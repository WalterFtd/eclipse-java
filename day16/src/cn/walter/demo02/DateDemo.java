package cn.walter.demo02;

import java.util.Date;

/*
 * ʱ���������
 * java.util,Date
 * 
 * ������1000���� = 1��
 * 
 * �����0�㣺
 * System.currentTimeMillis() ����ֵlong���Ͳ���
 * ��ȡ��ǰʱ��ĺ���ֵ
 * ʱ��ԭ�㣻��԰1970��1��1�գ���ҹ0��00:00  ��Ӧ�ĺ���ֵ����0
 * 
 * ��Ҫ��ʱ������ڵļ��㣬������������ֵ�����ڲ��ܼӼ���
 * 
 * long time = System.currentTimeMillis();
		System.out.println(time);
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		function4();
	}
	/*
	 * Date�෽��setTime(long) ���ݺ���ֵ
	 * �����ڶ������õ�ָ������ֵ��
	 * ����ֵת�����ڶ���
	 * ��Date�Ĺ��췽����ͬ
	 */
	public static void function4(){
		Date date = new Date();
		System.out.println(date);
		
		date.setTime(2131424);
		System.out.println(date);
	}
	/*
	 * Date�෽��getTime()������ֵ��long
	 * ����ֵ��һ������ֵ
	 * ��Date��ʾ�����ڣ�ת�ɺ���ֵ
	 * ���ںͺ���ֵת��
	 */
	public static void function3(){
		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);
	}
	/*
	 * Date���long�����Ĺ��췽��
	 * Date(long)��ʾ����ֵ
	 * ���ݺ���ֵ��������ֵת�ɶ�Ӧ�����ڶ���
	 */
	public static void function2(){
		Date date = new Date(0);
		System.out.println(date);
		
	}
	/*
	 * Date��ղ������췽��
	 * ��ȡ�����ǣ���ǰ����ϵͳ�е�ʱ�������
	 */
	public static void function() {
		Date date = new Date();
		//����Ĳ����ڴ��ַ��˵��date��д��toStirng����
		System.out.println(date);
	}
}
