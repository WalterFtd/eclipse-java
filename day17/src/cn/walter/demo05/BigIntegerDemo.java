package cn.walter.demo05;
/*
 * ���������������
 * ����longȡֵ��Χ����������װ��BigInteger���͵Ķ���
 */
import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * BigInteger�������������
	 * ���÷������㣬����1���Ҳֻ����BigInteger����
	 */
	
	/*
	 * BigInteger��Ĺ��췽��
	 * �����ַ�����Ҫ�����ָ�ʽ��û�г�������
	 * 
	 */
	private static void function() {
		BigInteger b = new BigInteger("12334355454355465654654645");
		BigInteger a = new BigInteger("12334355454355465654654645");
		//�����b1+b2  ���÷���Add
		BigInteger c = b.add(a);
		//�����b1-b2  ���÷���subtract
		BigInteger d = b.subtract(a);
		//����˻� multiply
		BigInteger e = b.multiply(a);
		//������
		BigInteger f = b.divide(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
	
	
}
