package cn.walter.demo03;
/*
 * 	StringBuilder��Stringbuffer���
 * 	�����̲߳���ȫ�����ٶȿ�
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		function6();
	
	
	}
	/*
	 * StringBuffer�෽��
	 * String tString()�̳�Object����дtoString()
	 * ���������������ַ�������ַ���
	 */
	public static void function6(){
		StringBuffer buffer = new StringBuffer();
		//ԭ���ǻ��������������
		buffer.append("dsds");
		buffer.append(123456);
		//����toString������ ���ɱ�Ļ��������ݡ� ����ˡ����ɱ��String����
		String s = buffer.toString();
		System.out.println(s);
	}
	/*
	 * StringBuffer�෽��
	 * reverse()���������е��ַ���ת
	 */
	public static void function5(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefg");
		
		buffer.reverse();
		System.out.println(buffer);
	}
	/*
	 * StringBuffer�෽��
	 * replace(int start,int end,String str)
	 * ��ָ����������Χ�������ַ����滻���µ��ַ���
	 */
	public static void function4(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("sfsf");
		buffer.replace(1, 2, "www");
		System.out.println(buffer);
	}
	/*
	 * StringBuffer�෽��
	 * insert(int index,��������)
	 * �������������ݣ����뵽��������ָ��������
	 */
	public static void function3(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("dsdsd");
		buffer.insert(3, "er");
		System.out.println(buffer);
	}
	/*
	 * StringBuffer�෽��
	 * delete(int start,int end)ɾ�����������ַ�
	 * ��ʼ������������β����������
	 */
	public static void function2(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("sdsdfd");
		System.out.println(buffer);
		buffer.delete(1, 4);
		System.out.println(buffer);
	}
	/*
	 * StringBuffer�෽��
	 * 	StringBuffer append �����������͵����ݣ���ӵ�������
	 * 	append ����ֵ��дreturn this
	 *  ��������˭������ֵ����˭
	 */
	public static void function(){
		StringBuffer buffer = new StringBuffer("scsc");
		//����StringBuffer �ķ���append�򻺳���׷������
		buffer.append(6).append(false).append('a');
		System.out.println(buffer);
	}
}
