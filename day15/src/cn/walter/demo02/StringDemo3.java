package cn.walter.demo02;
/*
 * String�๹�췽��
 * String��Ĺ��췽����������ʽ��ͨ�����췽����
 */
public class StringDemo3 {
	public static void main(String[] args) {
		//function();
		function2();
	}
	/*
	 * String(char[] value) �����ַ�����
	 * ���ַ����飬ת���ַ������ַ�����Ĳ���������ѯ�����
	 * String(byte[] bytes,int offset, int count) �����ַ�����
	 * ���ַ�����һ����ת���ַ���
	 * offset ���鿪ʼ����
	 * count  ����
	 */
	public static void function2() {
		char[] ch = {'a','b','c','d','e'};
		//����String���췽���������ַ�����
		String s = new String(ch);
		System.out.println(s+" f21");
		
		String s1 = new String(ch, 1, 2);
		System.out.println(s1);
	}
	
	/*
	 * ���巽����String��Ĺ��췽��
	 * String(byte[] bytes) �����ֽ�����
	 * ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ����byte ���飬����һ���µ�String
	 * ƽ̨ ����������ϵͳ
	 * Ĭ���ַ���������ϵͳ�е�Ĭ�ϱ����Ĭ�ϱ����GBK
	 * ���ֽ������е�ÿ���ֽڣ���ѯ������õ��Ľ��
	 * �ֽ��Ǹ��������ӵ��ֽڱ�����Ǹ�����һ�����Ӳ���2���ֽڱ�ʾ
	 * 
	 * String(byte[] bytes,int offset, int length) �����ֽ�����
	 * �ֽ������һ����ת���ַ���
	 * offset �������ʼ������
	 * length ������ת���������ǽ���������
	 */
	public static void function() {
		byte[] bytes = {97,98,99,100};
		//����String��Ĺ��췽���������ֽ�����
		String s = new String(bytes);
		System.out.println(s);
		//����String���췽�����������飬��������intֵ
		String s1 = new String(bytes, 1, 1);
		System.out.println(s1);
	}
}
