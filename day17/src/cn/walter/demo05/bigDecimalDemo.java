package cn.walter.demo05;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bigDecimalDemo {
	public static void main(String[] args) {
		/*
		 * ������δ֪
		 * ԭ��:������������У���ʾ����������ȷ���
		 * �������͵ĸ������ݣ��ṩ�߾��ȵĸ������� BigDecimal
		 * �÷���BigInteger����
		 */
		System.out.println(0.09+0.01);//0.09999999999999999
		System.out.println(1.0-0.32);//0.6799999999999999
		System.out.println(1.015*100);//101.49999999999999
		System.out.println(1.301/100);//0.013009999999999999
		
		BigDecimal a = new BigDecimal("12.3456789034");
		BigDecimal b = new BigDecimal("12.34567890341");
		//�����b1+b2  ���÷���Add
		BigDecimal c = b.add(a);
		//�����b1-b2  ���÷���subtract
		 BigDecimal d = b.subtract(a);
		 //����˻� multiply
		BigDecimal e = b.multiply(a);
		//������
		//divide(BigDecimal divisor, int scale, int roundingMode) 
		//int scale ������λС��
		//int roundingMode ����ģʽ �Ķ�API�ĵ�
		//BigDecimal.ROUND_UP  ��̬����
		
		BigDecimal f = b.divide(a,2,BigDecimal.ROUND_UP);//��������˳����������
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
