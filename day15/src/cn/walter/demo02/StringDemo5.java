package cn.walter.demo02;
/*
 * String�����������
 */
public class StringDemo5 {
	public static void main(String[] args) {
		function4();
	}
	/*
	 * String trim ȥ���ַ������˿ո�
	 */
	public static void function(){
		String s1 = " abc cd ";
		String s2 = s1.trim();
		System.out.println(s1);
		System.out.println(s2);
	}
	/*
	 * String replace(char oldChar,char newChar)
	 * ���ַ����е����ַ����滻Ϊ���ַ�
	 * 
	 * String replace(String old,char newstr)
	 * ���ַ����е����ַ������滻Ϊ���ַ���
	 */
	public static void function2(){
		String s1 = "scjbscjs".replace('s', 'w');
		System.out.println(s1);
		String s2 = "rtrtrtrtyu".replace("rt", "yu");
		System.out.println(s2);
		
	}
	/*
	 * String toLowerCase() �ַ���ת��Сд
	 * String toUpperCase() �ַ���ת�ɴ�д
	 */
	public static void function3(){
		String s1 = "scjbscjs".toUpperCase();
		System.out.println(s1);
		String s2 = "CSSCSCSCS".toLowerCase();
		System.out.println(s2);
	}
	/*
	 * char charAT(int index)
	 * ���������ϵ��ַ�
	 */
	public static void function4(){
		char ch = "abcde".charAt(3);
		System.out.println(ch);
	}
}
