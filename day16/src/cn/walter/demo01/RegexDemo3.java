package cn.walter.demo01;

public class RegexDemo3 {
	public static void main(String[] args) {
		checkMail();
	}
	/*
	 * ��������ַ�Ƿ�Ϸ�
	 * ����
	 * 1234567@qq.com
	 * mus_sds@163.com
	 * djfndjn@yahoo.com.cn
	 * 
	 * @��ǰ������ĸ_ ����������1��
	 * @����������ĸ      ����������1��
	 * .������ĸ
	 */
	public static void checkMail(){
		String email = "asas13@sdks.com.cn";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}
