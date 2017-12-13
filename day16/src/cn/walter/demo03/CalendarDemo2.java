package cn.walter.demo03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
	public static void main(String[] args) {
		function4();
	}
	/*
	 * Calendar��ķ���getTime()
	 * ����������ת��Date���ڶ���
	 */
	public static void function4(){
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
	}
	/*
	 * Calendar�෽��add
	 * ������ƫ����������ָ��һ�������е��ֶΣ�����������ƫ��
	 * add(int field, int value)
	 */
	public static void function3(){
		Calendar c = Calendar.getInstance();
		//�������е����������ƫ��-365��
		c.add(Calendar.DAY_OF_MONTH, -365);
		//��ȡ���,ͨ���������ó�Ա����
		int year = c.get(Calendar.YEAR);
		//��ȡ�·�,�����������0-11��
		int month = c.get(Calendar.MARCH)+1;
		//��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
	}
	
	/*
	 * Calendar���set����
	 * ��������
	 * set(int field,int value)
	 * field ���õ����ĸ������ֶ�
	 * value ���ú�ľ�����ֵ
	 * 
	 * set(int year,int month,int day)
	 * ����3�������ģ��꣬�£���
	 */
	public static void function2(){
		Calendar c = Calendar.getInstance();
		//�����·�
		//c.set(Calendar.MONTH, 5);
		//���� �� �� ��
		c.set(2016, 9, 15);
		//��ȡ���,ͨ���������ó�Ա����
		int year = c.get(Calendar.YEAR);
		//��ȡ�·�,�����������0-11��
		int month = c.get(Calendar.MARCH)+1;
		//��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");		
	}
	
	/*
	 * Calendarl���get����
	 * ��ȡ�����ֶε�ֵ
	 * int get(int)
	 * ����int ��ȡ���ĸ������ֶ�
	 * ����ֵ���ͱ�ʾ�����ֶεľ�����ֵ
	 */
	public static void function(){
		//��ȡ�������
		Calendar c= Calendar.getInstance();
		//��ȡ���,ͨ���������ó�Ա����
		int year = c.get(Calendar.YEAR);
		//��ȡ�·�,�����������0-11��
		int month = c.get(Calendar.MARCH)+1;
		//��ȡ����
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
	}
}
