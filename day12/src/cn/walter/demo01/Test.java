package cn.walter.demo01;
/*
 * new �����ʱ�򣬾����ڵ��ö���Ĺ��췽��
 * new Person();���õ������еĿղ������췽��
 * new Person("����",25);�������е��в������췽��
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Person("����",25);
		System.out.println(p.getName()+"����"+p.getAge());
	}
}
