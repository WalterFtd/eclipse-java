package cn.walter.demo02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �����ڽ��и�ʽ�����Զ��壩
 * �����ڸ�ʽ������ java.text.DateFormat �����࣬��ͨ������Ҳ�г���ķ���
 * ʵ��ʵ����ʹ�õ�������java.text,SimpleDateFormat ����ʹ�ø�����ͨ��������д�˳��󷽷�
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * ��ζ����ڸ�ʽ��
	 * ���裺
	 * 1.����SimpleDateFormat����
	 * 	���๹�췽���У�д���ַ��������ڸ�ʽ���Լ����壩
	 * 2.SimpleDateFormat���÷���format�����ڽ��и�ʽ��
	 * 	String format(Date date)�������ڲ����������ַ���
	 * ����ģʽ��
	 * yyyy		���
	 * MM		�·�
	 * dd		���е�����
	 * HH		0-23Сʱ
	 * mm		Сʱ�еķ���
	 * ss		��
	 * yyyy��MM��dd�� HH��mm����ss��
	 */
	public static void function() {
		//����SimpleDateFormat���󣬹��췽����д���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH��mm����ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
}
