package cn.walter.demo01;
/*
 * Integer���е���������
 * ��������������������̬��Ա����
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		function();
	}
	/*
	 * Integer���3����̬����
	 * �����Ƶ�ת��
	 * ʮ����ת�ɶ����� toBinarString(int)
	 * ʮ����ת�ɰ˽��� toOctalString(int)
	 * ʮ����ת��ʮ������ toHerString(int)
	 * ��������������ֵ������String��ʽ����
	 */
	public static void function2(){
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
	}
	/*
	 * Integer��ľ�̬��Ա����
	 * MAX_VALUE
	 * MIN_VALUE
	 */
	public static void function(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}
}
