package cn.walter.demo01;
/*
 * " +":ƥ�����ո�
 * \\.+:ƥ����
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		//split1();
		replaceAll();
	}
	/*
	 * �����������滻
	 * String�෽��replaceAll(��������滻������ַ���)
	 */
	public static void replaceAll(){
		String str = "sdsdsdsdsdsd122323";
		str = str.replaceAll("[\\d]+","#");
		System.out.println(str);
	}
	/*
	 * String�෽��split���ַ��������и�
	 * 12-25-36-98����-�ַ��������и�
	 */
	public static void split1(){
		String str = "12-25-36-98";
		//����-���ַ��������иString�෽��split
		String[] strArr = str.split("-");
		System.out.println("����ĳ���"+strArr.length);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
