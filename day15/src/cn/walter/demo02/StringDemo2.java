package cn.walter.demo02;

public class StringDemo2 {
	public static void main(String[] args) {
		//�ַ������巽ʽ2����ֱ��= ʹ��String��Ĺ��췽��
		String str1 = new String("adad");//˫�㸳ֵ
		String str2 = "adad";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);//�����������ͣ��Ƚ϶���ĵ�ַ false
		System.out.println(str1.equals(str2)); //����������д��equals������һ�����ַ��Ƚϣ�����Ϊtrue
	}
}
