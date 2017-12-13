package cn.walter.demo04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * ������ϰ
 */
public class DateTest {
	public static void main(String[] args) throws Exception {
		function2();
	}
	/*
	 * �������
	 * 2088  2090
	 * �߼����㷨���������õ�ָ����ݵ�3��1�գ�add��ǰƫ��һ�죬��ȡ������29����
	 */
	public static void function2(){
		Calendar c = Calendar.getInstance();
		//�����������õ�ָ�����3��1��
		c.set(2088, 2, 1);
		//����add��������ǰƫ��1��
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}
	/*
	 * ������˶�����
	 * ���� ���������
	 * �������ڱ�ɺ���ֵ������
	 */
	public static void function() throws Exception{
		System.out.println("������������� ��ʽ YYYY-MM-dd");
		//��ȡ�������ڣ���������(��������)
		String birthdayString = new Scanner(System.in).next();
		//���ַ������ڣ�ת��Date����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//���÷���parse���ַ���ת�����ڶ���
		Date birthdayDate = sdf.parse(birthdayString);
		
		//��ȡ��������ڶ���
		Date todayDate = new Date();
		
		//����������ת�ɺ���ֵ��Date��ķ���getTime
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long msec = todaySecond-birthdaySecond;
		if(msec<0){
			System.out.println("��û����");
		}else{
		System.out.println(msec/1000/60/60/24/365);
		}
	}
}
