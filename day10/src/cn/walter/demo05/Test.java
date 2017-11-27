package cn.walter.demo05;
/*
 * 要求子类的权限大于等于父类
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
