package cn.walter.demo02;
/*
 * String��Ĳ��ҹ���
 */
public class StringDemo4 {
	public static void main(String[] args) {
		//function();
		//function2();
		//function3();
		//function4();
		function5();
	}
	/*
	 * equals(Object obj)
	 * ���������ַ������ж��ַ������ַ��Ƿ���ȫ��ͬ
	 * equalsIgnoreCase(Object obj)
	 * ���������ַ������ж��ַ������ַ��Ƿ���ȫ��ͬ�����Դ�Сд
	 */
	public static void function5() {
		String str1 = "ABC";
		String str2 = "abc";
		//�ֱ����equals()��equalsIgnoreCase()
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

	/*
	 * byte[] getBytes() ���ַ���ת���ֽ�����
	 * �˹��ܺ�String���췽���෴
	 * bytes������صĹ��ܣ���ѯ�����
	 * 
	 * char[] toCharArray()���ַ���ת���ַ�����
	 * �˹��ܺ�String���췽���෴
	 */
	public static void function4() {
		String str = "abc";
		//����String����getBytes �ַ���ת���ֽ�����
		byte[] bytes = str.getBytes();
		for(int i = 0;i < bytes.length; i++){
			System.out.println(bytes[i]);
		}
		//����String����toCharArray �ַ���ת���ַ�����
		char[] ch = str.toCharArray();
		for(int i = 0;i < ch.length; i++){
			System.out.println(ch[i]);
		}
		
	}

	/*
	 * �ַ�������.startsWith(prefix)
	 * �ж�һ���ַ����ǲ�����һ���ַ�����ǰ׺
	 * 
	 * �ַ�������.endsWith(suffix)
	 * �ж�һ���ַ����ǲ�����һ���ַ����ĺ�׺
	 * 
	 * �ַ�������.contains(String s)
	 * �ж�һ���ַ����ǲ��ǰ�����һ���ַ���
	 * 
	 * �ַ�������.str.indexOf(char ch)
	 * ����һ���ַ������ַ����е�һ�γ��ֵ������������ڷ���-1
	 * 
	 */
	public static void function3() {
		String str = "howareyou";
		//����String��ķ���startsWith
		System.out.println(str.startsWith("how"));
		System.out.println(str.endsWith("you"));
		System.out.println(str.contains("are"));
		System.out.println(str.indexOf('w'));
	}
	/*
	 * �ַ�������.substring(beginIndex, endIndex) ��ȡ�ַ���һ����
	 * �����µ��ַ���
	 * ��ͷ����β
	 * 
	 * �ַ�������.substring(beginIndex)��ȡ�ַ���һ����
	 * ��ͷ������ȫҪ
	 */
	public static void function2(){
		String str = "hellobaby";
		//����String��ķ���substring��ȡ�ַ�����һ����
		System.out.println(str.substring(0,5));
		System.out.println(str.substring(5));
		
	}
	/*
	 *  �ַ�������.length() �����ַ����ĳ���
	 *  �������ٸ��ַ�
	 */
	public static void function() {
		String str = "mvdvmx vmxnvnxm";
		//����String�෽��length����ȡ�ַ�������
		int length = str.length();
		System.out.println(length);
	}
}
