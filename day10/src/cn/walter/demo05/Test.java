package cn.walter.demo05;
/*
 * Ҫ�������Ȩ�޴��ڵ��ڸ���
 */
public class Test {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sendMseeage();
		p.showNum();
		
		AndroidPhone an = new AndroidPhone();
		an.showNum();
	}
}
