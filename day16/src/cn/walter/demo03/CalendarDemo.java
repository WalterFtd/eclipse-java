package cn.walter.demo03;

import java.util.Calendar;

/*
 * ������ java.util.Calendar
 * �����࣬ʹ�������������
 * 
 * Calendar��д�˾�̬���� getInstance() ֱ�ӷ�������Ķ���
 * ����Ҫֱ��new ����Ķ���ͨ����̬����ֱ�ӻ�ȡ
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//ͨ�����������ʹ�÷�����Ӵ�������Ķ���
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}
}
