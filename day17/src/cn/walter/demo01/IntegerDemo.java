package cn.walter.demo01;
/*
 * Integer�࣬��װ������������int����ߴ�������
 * ���ַ���ת�ɻ�����������int
 */
public class IntegerDemo {
	public static void main(String[] args) {
		function2();
	}
	/*
	 * Integer�๹�췽��
	 * Integer(String s)
	 * �����ָ�ʽ���ַ��������ݵ�Integer��Ĺ��췽����
	 * ����Ineger���󣬰�װ����һ���ַ���
	 * �����췽���е��ַ�����ת�ɻ����������ͣ����÷������Ǿ�̬�ģ�intValue()
	 */
	public static void function3(){
		//��100ͨ���������ķ�ʽ��װ���������÷����Ǿ�̬��intValue()��100��ɻ�������int
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(i--);
	}
	/*
	 * ��ν���������int������ַ���
	 * 
	 * int =>String �κ�����+"" ���String����
	 * Integer���еľ�̬����toString()
	 * toString(int int radix),��int������ת��ָ������
	 */
	public static void function2() {
		int i = 3;
		String s = i+"";
		System.out.println(s+1);
		 String s1 = Integer.toString(34);
		 System.out.println(s1+1);
	}

	/*
	 * Integer�ྲ̬����parseInt(String s,int radix)
	 * radix ����
	 */
	public static void function1(){
		int i = Integer.parseInt("111",2);
		System.out.println(i);
	}
	
	/*
	 * Integer���о�̬����parseInt(String s) ���ػ�������
	 * Ҫ��;�ַ����������ַ���ʽ��
	 */
	public static void function(){
		//ֱ��ʹ��lang�������Integer��װ��ķ���
		int i = Integer.parseInt("23");
		System.out.println(i/2);
	}
}
