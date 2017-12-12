package cn.walter.demo01;
/*
 * ʵ�����������ַ�������ƥ�䣬ʹ�õ��ַ�����ķ���
 * String���������ʽ��صķ���
 * boolean matches(String ����Ĺ���)
 * "abc".matches("[a]") ƥ��ɹ�����true
 * 
 * String[] split(Stirng ����Ĺ���)
 * "abc".split("a") ʹ�������ַ��������и�
 * 
 * String replaceAll(String �������String �ַ���)
 * "abc0123".replaceAll("[\\d]","#")
 * ��������Ĺ����滻�ַ���
 */
public class RegexDemo {
	public static void main(String[] args) {
		checkQQ();
		checkTel();
	}
	/*
	 * ����ֻ����Ƿ�Ϸ�
	 * 1��ͷ��������34568 0-9λ���̶�11λ
	 */
	public static void checkTel(){
		String telNumber = "13351258005";
		//String��ķ���matches
		boolean b = telNumber.matches("1[345678][\\d]{9}");
		System.out.println(b);
	}
	/*
	 * ���QQ�����Ƿ�Ϸ�
	 * 0���ܿ�ͷ��ȫ���֣�λ��5,10λ
	 * 12345
	 * Ԥ�����ַ��ࣺ\\d,��ʾ����     \\D,ƥ�䲻������
	 */
	public static void checkQQ(){
		String QQ = "123456";
		//���QQ����͹����Ƿ�ƥ�䣬String��ķ���matches
		boolean b = QQ.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}
}
